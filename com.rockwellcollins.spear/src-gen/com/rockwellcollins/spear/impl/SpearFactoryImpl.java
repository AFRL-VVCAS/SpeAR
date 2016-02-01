/**
 */
package com.rockwellcollins.spear.impl;

import com.rockwellcollins.spear.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpearFactoryImpl extends EFactoryImpl implements SpearFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SpearFactory init()
  {
    try
    {
      SpearFactory theSpearFactory = (SpearFactory)EPackage.Registry.INSTANCE.getEFactory(SpearPackage.eNS_URI);
      if (theSpearFactory != null)
      {
        return theSpearFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SpearFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpearFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SpearPackage.FILE: return createFile();
      case SpearPackage.SPECIFICATION: return createSpecification();
      case SpearPackage.IMPORT: return createImport();
      case SpearPackage.DEFINITIONS: return createDefinitions();
      case SpearPackage.PATTERNS: return createPatterns();
      case SpearPackage.PATTERN: return createPattern();
      case SpearPackage.UNIT_DEF: return createUnitDef();
      case SpearPackage.UNIT_EXPR: return createUnitExpr();
      case SpearPackage.TYPE_DEF: return createTypeDef();
      case SpearPackage.FIELD_TYPE: return createFieldType();
      case SpearPackage.ENUM_VALUE: return createEnumValue();
      case SpearPackage.TYPE: return createType();
      case SpearPackage.CONSTANT: return createConstant();
      case SpearPackage.VARIABLE: return createVariable();
      case SpearPackage.MACRO: return createMacro();
      case SpearPackage.CONSTRAINT: return createConstraint();
      case SpearPackage.FORMAL_CONSTRAINT: return createFormalConstraint();
      case SpearPackage.ENGLISH_CONSTRAINT: return createEnglishConstraint();
      case SpearPackage.EXPR: return createExpr();
      case SpearPackage.LITERAL_EXPR: return createLiteralExpr();
      case SpearPackage.ID_REF: return createIdRef();
      case SpearPackage.FIELD_EXPR: return createFieldExpr();
      case SpearPackage.BASE_UNIT: return createBaseUnit();
      case SpearPackage.DERIVED_UNIT: return createDerivedUnit();
      case SpearPackage.BINARY_UNIT_EXPR: return createBinaryUnitExpr();
      case SpearPackage.NAMED_UNIT_EXPR: return createNamedUnitExpr();
      case SpearPackage.NAMED_TYPE: return createNamedType();
      case SpearPackage.RECORD_TYPE: return createRecordType();
      case SpearPackage.ARRAY_TYPE: return createArrayType();
      case SpearPackage.ENUM_TYPE: return createEnumType();
      case SpearPackage.INT_TYPE: return createIntType();
      case SpearPackage.BOOL_TYPE: return createBoolType();
      case SpearPackage.REAL_TYPE: return createRealType();
      case SpearPackage.USER_TYPE: return createUserType();
      case SpearPackage.BINARY_EXPR: return createBinaryExpr();
      case SpearPackage.UNARY_EXPR: return createUnaryExpr();
      case SpearPackage.PREVIOUS_EXPR: return createPreviousExpr();
      case SpearPackage.RECORD_ACCESS_EXPR: return createRecordAccessExpr();
      case SpearPackage.RECORD_UPDATE_EXPR: return createRecordUpdateExpr();
      case SpearPackage.ARRAY_ACCESS_EXPR: return createArrayAccessExpr();
      case SpearPackage.ARRAY_UPDATE_EXPR: return createArrayUpdateExpr();
      case SpearPackage.ID_EXPR: return createIdExpr();
      case SpearPackage.MID_EXPR: return createMIdExpr();
      case SpearPackage.IF_THEN_ELSE_EXPR: return createIfThenElseExpr();
      case SpearPackage.AFTER_UNTIL_EXPR: return createAfterUntilExpr();
      case SpearPackage.WHILE_EXPR: return createWhileExpr();
      case SpearPackage.RECORD_EXPR: return createRecordExpr();
      case SpearPackage.ARRAY_EXPR: return createArrayExpr();
      case SpearPackage.PATTERN_CALL: return createPatternCall();
      case SpearPackage.SPECIFICATION_CALL: return createSpecificationCall();
      case SpearPackage.INT_LITERAL: return createIntLiteral();
      case SpearPackage.BOOL_LITERAL: return createBoolLiteral();
      case SpearPackage.REAL_LITERAL: return createRealLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Specification createSpecification()
  {
    SpecificationImpl specification = new SpecificationImpl();
    return specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definitions createDefinitions()
  {
    DefinitionsImpl definitions = new DefinitionsImpl();
    return definitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Patterns createPatterns()
  {
    PatternsImpl patterns = new PatternsImpl();
    return patterns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitDef createUnitDef()
  {
    UnitDefImpl unitDef = new UnitDefImpl();
    return unitDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitExpr createUnitExpr()
  {
    UnitExprImpl unitExpr = new UnitExprImpl();
    return unitExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef createTypeDef()
  {
    TypeDefImpl typeDef = new TypeDefImpl();
    return typeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldType createFieldType()
  {
    FieldTypeImpl fieldType = new FieldTypeImpl();
    return fieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumValue createEnumValue()
  {
    EnumValueImpl enumValue = new EnumValueImpl();
    return enumValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Macro createMacro()
  {
    MacroImpl macro = new MacroImpl();
    return macro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalConstraint createFormalConstraint()
  {
    FormalConstraintImpl formalConstraint = new FormalConstraintImpl();
    return formalConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnglishConstraint createEnglishConstraint()
  {
    EnglishConstraintImpl englishConstraint = new EnglishConstraintImpl();
    return englishConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpr createLiteralExpr()
  {
    LiteralExprImpl literalExpr = new LiteralExprImpl();
    return literalExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdRef createIdRef()
  {
    IdRefImpl idRef = new IdRefImpl();
    return idRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldExpr createFieldExpr()
  {
    FieldExprImpl fieldExpr = new FieldExprImpl();
    return fieldExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseUnit createBaseUnit()
  {
    BaseUnitImpl baseUnit = new BaseUnitImpl();
    return baseUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DerivedUnit createDerivedUnit()
  {
    DerivedUnitImpl derivedUnit = new DerivedUnitImpl();
    return derivedUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryUnitExpr createBinaryUnitExpr()
  {
    BinaryUnitExprImpl binaryUnitExpr = new BinaryUnitExprImpl();
    return binaryUnitExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedUnitExpr createNamedUnitExpr()
  {
    NamedUnitExprImpl namedUnitExpr = new NamedUnitExprImpl();
    return namedUnitExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedType createNamedType()
  {
    NamedTypeImpl namedType = new NamedTypeImpl();
    return namedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType createRecordType()
  {
    RecordTypeImpl recordType = new RecordTypeImpl();
    return recordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType createArrayType()
  {
    ArrayTypeImpl arrayType = new ArrayTypeImpl();
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumType createEnumType()
  {
    EnumTypeImpl enumType = new EnumTypeImpl();
    return enumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntType createIntType()
  {
    IntTypeImpl intType = new IntTypeImpl();
    return intType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolType createBoolType()
  {
    BoolTypeImpl boolType = new BoolTypeImpl();
    return boolType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealType createRealType()
  {
    RealTypeImpl realType = new RealTypeImpl();
    return realType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserType createUserType()
  {
    UserTypeImpl userType = new UserTypeImpl();
    return userType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpr createBinaryExpr()
  {
    BinaryExprImpl binaryExpr = new BinaryExprImpl();
    return binaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpr createUnaryExpr()
  {
    UnaryExprImpl unaryExpr = new UnaryExprImpl();
    return unaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreviousExpr createPreviousExpr()
  {
    PreviousExprImpl previousExpr = new PreviousExprImpl();
    return previousExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordAccessExpr createRecordAccessExpr()
  {
    RecordAccessExprImpl recordAccessExpr = new RecordAccessExprImpl();
    return recordAccessExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordUpdateExpr createRecordUpdateExpr()
  {
    RecordUpdateExprImpl recordUpdateExpr = new RecordUpdateExprImpl();
    return recordUpdateExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayAccessExpr createArrayAccessExpr()
  {
    ArrayAccessExprImpl arrayAccessExpr = new ArrayAccessExprImpl();
    return arrayAccessExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayUpdateExpr createArrayUpdateExpr()
  {
    ArrayUpdateExprImpl arrayUpdateExpr = new ArrayUpdateExprImpl();
    return arrayUpdateExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdExpr createIdExpr()
  {
    IdExprImpl idExpr = new IdExprImpl();
    return idExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MIdExpr createMIdExpr()
  {
    MIdExprImpl mIdExpr = new MIdExprImpl();
    return mIdExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfThenElseExpr createIfThenElseExpr()
  {
    IfThenElseExprImpl ifThenElseExpr = new IfThenElseExprImpl();
    return ifThenElseExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterUntilExpr createAfterUntilExpr()
  {
    AfterUntilExprImpl afterUntilExpr = new AfterUntilExprImpl();
    return afterUntilExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileExpr createWhileExpr()
  {
    WhileExprImpl whileExpr = new WhileExprImpl();
    return whileExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordExpr createRecordExpr()
  {
    RecordExprImpl recordExpr = new RecordExprImpl();
    return recordExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayExpr createArrayExpr()
  {
    ArrayExprImpl arrayExpr = new ArrayExprImpl();
    return arrayExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternCall createPatternCall()
  {
    PatternCallImpl patternCall = new PatternCallImpl();
    return patternCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecificationCall createSpecificationCall()
  {
    SpecificationCallImpl specificationCall = new SpecificationCallImpl();
    return specificationCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolLiteral createBoolLiteral()
  {
    BoolLiteralImpl boolLiteral = new BoolLiteralImpl();
    return boolLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealLiteral createRealLiteral()
  {
    RealLiteralImpl realLiteral = new RealLiteralImpl();
    return realLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpearPackage getSpearPackage()
  {
    return (SpearPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SpearPackage getPackage()
  {
    return SpearPackage.eINSTANCE;
  }

} //SpearFactoryImpl
