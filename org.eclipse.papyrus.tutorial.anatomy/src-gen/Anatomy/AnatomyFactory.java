/**
 */
package Anatomy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Anatomy.AnatomyPackage
 * @generated
 */
public interface AnatomyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnatomyFactory eINSTANCE = Anatomy.impl.AnatomyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Work Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Part</em>'.
	 * @generated
	 */
	WorkPart createWorkPart();

	/**
	 * Returns a new object of class '<em>Blocks</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blocks</em>'.
	 * @generated
	 */
	Blocks createBlocks();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnatomyPackage getAnatomyPackage();

} //AnatomyFactory
