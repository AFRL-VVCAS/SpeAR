/**
 */
package com.rockwellcollins.spear.impl;

import com.rockwellcollins.spear.Constraint;
import com.rockwellcollins.spear.Macro;
import com.rockwellcollins.spear.SpearPackage;
import com.rockwellcollins.spear.Specification;
import com.rockwellcollins.spear.UnitDef;
import com.rockwellcollins.spear.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rockwellcollins.spear.impl.SpecificationImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link com.rockwellcollins.spear.impl.SpecificationImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.rockwellcollins.spear.impl.SpecificationImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.rockwellcollins.spear.impl.SpecificationImpl#getState <em>State</em>}</li>
 *   <li>{@link com.rockwellcollins.spear.impl.SpecificationImpl#getMacros <em>Macros</em>}</li>
 *   <li>{@link com.rockwellcollins.spear.impl.SpecificationImpl#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link com.rockwellcollins.spear.impl.SpecificationImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link com.rockwellcollins.spear.impl.SpecificationImpl#getBehaviors <em>Behaviors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationImpl extends FileImpl implements Specification
{
  /**
   * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnits()
   * @generated
   * @ordered
   */
  protected EList<UnitDef> units;

  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EList<Variable> inputs;

  /**
   * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputs()
   * @generated
   * @ordered
   */
  protected EList<Variable> outputs;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected EList<Variable> state;

  /**
   * The cached value of the '{@link #getMacros() <em>Macros</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMacros()
   * @generated
   * @ordered
   */
  protected EList<Macro> macros;

  /**
   * The cached value of the '{@link #getAssumptions() <em>Assumptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssumptions()
   * @generated
   * @ordered
   */
  protected EList<Constraint> assumptions;

  /**
   * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirements()
   * @generated
   * @ordered
   */
  protected EList<Constraint> requirements;

  /**
   * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviors()
   * @generated
   * @ordered
   */
  protected EList<Constraint> behaviors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpecificationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SpearPackage.Literals.SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnitDef> getUnits()
  {
    if (units == null)
    {
      units = new EObjectContainmentEList<UnitDef>(UnitDef.class, this, SpearPackage.SPECIFICATION__UNITS);
    }
    return units;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getInputs()
  {
    if (inputs == null)
    {
      inputs = new EObjectContainmentEList<Variable>(Variable.class, this, SpearPackage.SPECIFICATION__INPUTS);
    }
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getOutputs()
  {
    if (outputs == null)
    {
      outputs = new EObjectContainmentEList<Variable>(Variable.class, this, SpearPackage.SPECIFICATION__OUTPUTS);
    }
    return outputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getState()
  {
    if (state == null)
    {
      state = new EObjectContainmentEList<Variable>(Variable.class, this, SpearPackage.SPECIFICATION__STATE);
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Macro> getMacros()
  {
    if (macros == null)
    {
      macros = new EObjectContainmentEList<Macro>(Macro.class, this, SpearPackage.SPECIFICATION__MACROS);
    }
    return macros;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getAssumptions()
  {
    if (assumptions == null)
    {
      assumptions = new EObjectContainmentEList<Constraint>(Constraint.class, this, SpearPackage.SPECIFICATION__ASSUMPTIONS);
    }
    return assumptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getRequirements()
  {
    if (requirements == null)
    {
      requirements = new EObjectContainmentEList<Constraint>(Constraint.class, this, SpearPackage.SPECIFICATION__REQUIREMENTS);
    }
    return requirements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getBehaviors()
  {
    if (behaviors == null)
    {
      behaviors = new EObjectContainmentEList<Constraint>(Constraint.class, this, SpearPackage.SPECIFICATION__BEHAVIORS);
    }
    return behaviors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SpearPackage.SPECIFICATION__UNITS:
        return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
      case SpearPackage.SPECIFICATION__INPUTS:
        return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
      case SpearPackage.SPECIFICATION__OUTPUTS:
        return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
      case SpearPackage.SPECIFICATION__STATE:
        return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
      case SpearPackage.SPECIFICATION__MACROS:
        return ((InternalEList<?>)getMacros()).basicRemove(otherEnd, msgs);
      case SpearPackage.SPECIFICATION__ASSUMPTIONS:
        return ((InternalEList<?>)getAssumptions()).basicRemove(otherEnd, msgs);
      case SpearPackage.SPECIFICATION__REQUIREMENTS:
        return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
      case SpearPackage.SPECIFICATION__BEHAVIORS:
        return ((InternalEList<?>)getBehaviors()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SpearPackage.SPECIFICATION__UNITS:
        return getUnits();
      case SpearPackage.SPECIFICATION__INPUTS:
        return getInputs();
      case SpearPackage.SPECIFICATION__OUTPUTS:
        return getOutputs();
      case SpearPackage.SPECIFICATION__STATE:
        return getState();
      case SpearPackage.SPECIFICATION__MACROS:
        return getMacros();
      case SpearPackage.SPECIFICATION__ASSUMPTIONS:
        return getAssumptions();
      case SpearPackage.SPECIFICATION__REQUIREMENTS:
        return getRequirements();
      case SpearPackage.SPECIFICATION__BEHAVIORS:
        return getBehaviors();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpearPackage.SPECIFICATION__UNITS:
        getUnits().clear();
        getUnits().addAll((Collection<? extends UnitDef>)newValue);
        return;
      case SpearPackage.SPECIFICATION__INPUTS:
        getInputs().clear();
        getInputs().addAll((Collection<? extends Variable>)newValue);
        return;
      case SpearPackage.SPECIFICATION__OUTPUTS:
        getOutputs().clear();
        getOutputs().addAll((Collection<? extends Variable>)newValue);
        return;
      case SpearPackage.SPECIFICATION__STATE:
        getState().clear();
        getState().addAll((Collection<? extends Variable>)newValue);
        return;
      case SpearPackage.SPECIFICATION__MACROS:
        getMacros().clear();
        getMacros().addAll((Collection<? extends Macro>)newValue);
        return;
      case SpearPackage.SPECIFICATION__ASSUMPTIONS:
        getAssumptions().clear();
        getAssumptions().addAll((Collection<? extends Constraint>)newValue);
        return;
      case SpearPackage.SPECIFICATION__REQUIREMENTS:
        getRequirements().clear();
        getRequirements().addAll((Collection<? extends Constraint>)newValue);
        return;
      case SpearPackage.SPECIFICATION__BEHAVIORS:
        getBehaviors().clear();
        getBehaviors().addAll((Collection<? extends Constraint>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SpearPackage.SPECIFICATION__UNITS:
        getUnits().clear();
        return;
      case SpearPackage.SPECIFICATION__INPUTS:
        getInputs().clear();
        return;
      case SpearPackage.SPECIFICATION__OUTPUTS:
        getOutputs().clear();
        return;
      case SpearPackage.SPECIFICATION__STATE:
        getState().clear();
        return;
      case SpearPackage.SPECIFICATION__MACROS:
        getMacros().clear();
        return;
      case SpearPackage.SPECIFICATION__ASSUMPTIONS:
        getAssumptions().clear();
        return;
      case SpearPackage.SPECIFICATION__REQUIREMENTS:
        getRequirements().clear();
        return;
      case SpearPackage.SPECIFICATION__BEHAVIORS:
        getBehaviors().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SpearPackage.SPECIFICATION__UNITS:
        return units != null && !units.isEmpty();
      case SpearPackage.SPECIFICATION__INPUTS:
        return inputs != null && !inputs.isEmpty();
      case SpearPackage.SPECIFICATION__OUTPUTS:
        return outputs != null && !outputs.isEmpty();
      case SpearPackage.SPECIFICATION__STATE:
        return state != null && !state.isEmpty();
      case SpearPackage.SPECIFICATION__MACROS:
        return macros != null && !macros.isEmpty();
      case SpearPackage.SPECIFICATION__ASSUMPTIONS:
        return assumptions != null && !assumptions.isEmpty();
      case SpearPackage.SPECIFICATION__REQUIREMENTS:
        return requirements != null && !requirements.isEmpty();
      case SpearPackage.SPECIFICATION__BEHAVIORS:
        return behaviors != null && !behaviors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SpecificationImpl
