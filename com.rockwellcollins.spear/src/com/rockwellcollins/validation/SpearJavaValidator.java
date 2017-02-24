/*
 * generated by Xtext
 */
package com.rockwellcollins.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;

import com.google.inject.Inject;
import com.rockwellcollins.spear.BinaryExpr;
import com.rockwellcollins.spear.Constant;
import com.rockwellcollins.spear.Constraint;
import com.rockwellcollins.spear.Definitions;
import com.rockwellcollins.spear.Expr;
import com.rockwellcollins.spear.File;
import com.rockwellcollins.spear.FormalConstraint;
import com.rockwellcollins.spear.IdExpr;
import com.rockwellcollins.spear.Import;
import com.rockwellcollins.spear.NamedTypeDef;
import com.rockwellcollins.spear.PreviousExpr;
import com.rockwellcollins.spear.SpearPackage;
import com.rockwellcollins.spear.Specification;
import com.rockwellcollins.spear.UnaryExpr;
import com.rockwellcollins.spear.Variable;
import com.rockwellcollins.spear.typing.PrimitiveType;
import com.rockwellcollins.spear.typing.SpearTypeChecker;
import com.rockwellcollins.spear.typing.Type;
import com.rockwellcollins.spear.utilities.ConstantChecker;
import com.rockwellcollins.spear.utilities.Utilities;

/**
 * This class contains custom validation rules.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#
 * validation
 */

@ComposedChecks(validators = { NamesUnique.class,
							   SpecificationsAcyclicValidator.class,
							   VariablesAreUsedValidator.class,
							   IllegalAnalysisValidations.class,
							   DataValidator.class,
							   SpecificationValidator.class})

public class SpearJavaValidator extends com.rockwellcollins.validation.AbstractSpearJavaValidator {

	public static final String INVALID_ASSUMPTION_REF = "INVALID_ASSUMPTION_REF";

	/**
	 * @param s
	 *            - a Spear specification
	 * 
	 *            This validation will check that assumptions only reference
	 *            input variables and not computed variables.
	 */
	@Check
	public void checkAssumptions(Specification s) {
		Set<String> valids = s.getInputs().stream().map(in -> in.getName()).collect(Collectors.toSet());
		Set<String> invalids = s.getOutputs().stream().map(out -> out.getName()).collect(Collectors.toSet());
		invalids.addAll(s.getState().stream().map(local -> local.getName()).collect(Collectors.toSet()));

		for (Constraint assumption : s.getAssumptions()) {
			for (IdExpr ide : EcoreUtil2.getAllContentsOfType(assumption, IdExpr.class)) {
				if (ide.getId() instanceof Variable) {
					Variable var = (Variable) ide.getId();
					if (invalids.contains(var.getName())) {
						warning("Assumption references computed (locals or outputs) variables.", ide,
								SpearPackage.Literals.ID_EXPR__ID, INVALID_ASSUMPTION_REF,
								valids.toArray(new String[valids.size()]));
					}
				}
			}
		}
	}
	
	@Check
	public void checkDefinitionsOnlyImportDefinitions(Definitions d) {
		for(Import im : d.getImports()) {
			File f = Utilities.getImportedFile(d, im);
			if (f instanceof Specification) {
				error("Definitions files cannot import Specifications.", im, SpearPackage.Literals.IMPORT__IMPORT_URI);
			}
		}
	}
	
	@Check
	public void checkConstantsAreConstant(Constant c) {
		if(!ConstantChecker.isConstant(c)) {
			error("Constant " + c.getName() + " is defined by a non-constant expression.", c.getExpr(), null);
		}
	}
	
	@Check
	public void checkInitialIsNotEmbedded(UnaryExpr ue) {
		if(ue.getOp().equals("initially")) {
			if(ue.eContainer() instanceof Expr) {
				error("The initially operator cannot be embedded within expressions.",ue,null);
			}
		}
	}
	
	@Check
	public void checkPreviousExpressionsAreGuarded(PreviousExpr pe) {
		if(pe.getInit() == null) {
			warning("No initial value was specified. Analysis will consider all possible values for the initial state.",pe,null);
		}
	}
	
	@Check
	public void checkForIllegalArrows(Specification s) {
		for(BinaryExpr be : EcoreUtil2.getAllContentsOfType(s, BinaryExpr.class)) {
			if(be.getOp().equals("->") || be.getOp().equals("arrow")) {
				EObject container = Utilities.getTopContainer(be);
				if(container instanceof Specification) {
					error("Arrow operators are meant for use inside of patterns only.",be,SpearPackage.Literals.BINARY_EXPR__OP);
				}
			}
		}
	}
	
	@Check
	public void checkForIllegalSectionheaders(Specification s) {
		String requirements = s.getRequirementsKeyword();
		String behaviors = s.getBehaviorsKeyword();
		if(requirements.equals(behaviors)) {
			error("Duplicate section name used: " + requirements,s,SpearPackage.Literals.SPECIFICATION__REQUIREMENTS_KEYWORD);
			error("Duplicate section name used: " + requirements,s,SpearPackage.Literals.SPECIFICATION__BEHAVIORS_KEYWORD);
		}
	}
	
	@Check
	public void checkAliasTypeUnits(NamedTypeDef ntd) {
		if(ntd.getUnit() != null && !PrimitiveType.isPrimitive(ntd.getType())) {
			error("Unit definitions only allowed on primitive types.",ntd,SpearPackage.Literals.NAMED_TYPE_DEF__UNIT);
		}
	}
	
	@Check
	public void checkPropertiesOnlyHaveWitnessFlags(Specification s) {
		List<Constraint> constraints = new ArrayList<>(s.getAssumptions());
		constraints.addAll(s.getRequirements());
		
		for(Constraint c : constraints) {
			if (c instanceof FormalConstraint) {
				FormalConstraint fc = (FormalConstraint) c;
				if(fc.getFlagAsWitness() != null) {
					String type = fc.getFlagAsWitness().equals("witness") ? "a witness" : "an observer";
					error("Only " + s.getBehaviorsKeyword() + " may be flagged as " + type + ".",c,SpearPackage.Literals.FORMAL_CONSTRAINT__FLAG_AS_WITNESS);
				}
			}
		}
	}
	
	@Inject
	protected IValidatorAdvisor options;
	
	@Check
	public void checkNonlinearDivision(BinaryExpr be) {
		if(options.isSolverNonlinear()) {
			return;
		}
	
		boolean isLeftConstant = ConstantChecker.isConstant(be.getLeft());
		boolean isRightConstant = ConstantChecker.isConstant(be.getRight());
		
		switch (be.getOp()) {
			case "/":
			case "mod":
				if(!isRightConstant) {
					error("Division by non-constant expressions is not supported.",be,SpearPackage.Literals.BINARY_EXPR__RIGHT);
				}
				break;
				
			case "*":
				if(!isLeftConstant && !isRightConstant) {
					error("Multiplication by non-constant expressions is not supported.",be,null);
				}
				break;
				
			default:
				break;
		}
	}
	
	@Check
	public void checkNonlinearModulus(BinaryExpr be) {
		if(options.isSolverNonlinear()) {
			return;
		}
		
		Type leftType = SpearTypeChecker.typeCheck(be.getLeft());
		
		if(be.getOp().equals("mod") && leftType.equals(PrimitiveType.REAL)) {
			error("Real modulus is only supported on non-linear solvers.", be, null);
		}
	}
}
