/**
 */
package com.rockwellcollins.spear;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rockwellcollins.spear.RecordType#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see com.rockwellcollins.spear.SpearPackage#getRecordType()
 * @model
 * @generated
 */
public interface RecordType extends TypeDef
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link com.rockwellcollins.spear.RecordTypeField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see com.rockwellcollins.spear.SpearPackage#getRecordType_Fields()
   * @model containment="true"
   * @generated
   */
  EList<RecordTypeField> getFields();

} // RecordType
