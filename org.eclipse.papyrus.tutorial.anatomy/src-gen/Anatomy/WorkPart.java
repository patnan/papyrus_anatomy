/**
 */
package Anatomy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Anatomy.WorkPart#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link Anatomy.WorkPart#getType <em>Type</em>}</li>
 *   <li>{@link Anatomy.WorkPart#getState <em>State</em>}</li>
 * </ul>
 *
 * @see Anatomy.AnatomyPackage#getWorkPart()
 * @model
 * @generated
 */
public interface WorkPart extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see Anatomy.AnatomyPackage#getWorkPart_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link Anatomy.WorkPart#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Bugzilla"</code>.
	 * The literals are from the enumeration {@link Anatomy.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Anatomy.Type
	 * @see #setType(Type)
	 * @see Anatomy.AnatomyPackage#getWorkPart_Type()
	 * @model default="Bugzilla" required="true" ordered="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link Anatomy.WorkPart#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Anatomy.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"UNKNOWN"</code>.
	 * The literals are from the enumeration {@link Anatomy.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see Anatomy.State
	 * @see #setState(State)
	 * @see Anatomy.AnatomyPackage#getWorkPart_State()
	 * @model default="UNKNOWN" required="true" ordered="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link Anatomy.WorkPart#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see Anatomy.State
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // WorkPart
