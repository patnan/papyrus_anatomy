/**
 */
package Anatomy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Anatomy.AnatomyFactory
 * @model kind="package"
 * @generated
 */
public interface AnatomyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Anatomy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/Anatomy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Anatomy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnatomyPackage eINSTANCE = Anatomy.impl.AnatomyPackageImpl.init();

	/**
	 * The meta object id for the '{@link Anatomy.impl.WorkPartImpl <em>Work Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Anatomy.impl.WorkPartImpl
	 * @see Anatomy.impl.AnatomyPackageImpl#getWorkPart()
	 * @generated
	 */
	int WORK_PART = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PART__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PART__TYPE = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PART__STATE = 2;

	/**
	 * The number of structural features of the '<em>Work Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PART_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Work Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Anatomy.impl.BlocksImpl <em>Blocks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Anatomy.impl.BlocksImpl
	 * @see Anatomy.impl.AnatomyPackageImpl#getBlocks()
	 * @generated
	 */
	int BLOCKS = 1;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKS__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Blocks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Blocks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Anatomy.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Anatomy.impl.RelationshipImpl
	 * @see Anatomy.impl.AnatomyPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Anatomy.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Anatomy.Type
	 * @see Anatomy.impl.AnatomyPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 3;

	/**
	 * The meta object id for the '{@link Anatomy.State <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Anatomy.State
	 * @see Anatomy.impl.AnatomyPackageImpl#getState()
	 * @generated
	 */
	int STATE = 4;


	/**
	 * Returns the meta object for class '{@link Anatomy.WorkPart <em>Work Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Part</em>'.
	 * @see Anatomy.WorkPart
	 * @generated
	 */
	EClass getWorkPart();

	/**
	 * Returns the meta object for the reference '{@link Anatomy.WorkPart#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see Anatomy.WorkPart#getBase_Class()
	 * @see #getWorkPart()
	 * @generated
	 */
	EReference getWorkPart_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link Anatomy.WorkPart#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Anatomy.WorkPart#getType()
	 * @see #getWorkPart()
	 * @generated
	 */
	EAttribute getWorkPart_Type();

	/**
	 * Returns the meta object for the attribute '{@link Anatomy.WorkPart#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see Anatomy.WorkPart#getState()
	 * @see #getWorkPart()
	 * @generated
	 */
	EAttribute getWorkPart_State();

	/**
	 * Returns the meta object for class '{@link Anatomy.Blocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blocks</em>'.
	 * @see Anatomy.Blocks
	 * @generated
	 */
	EClass getBlocks();

	/**
	 * Returns the meta object for the reference '{@link Anatomy.Blocks#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see Anatomy.Blocks#getBase_Association()
	 * @see #getBlocks()
	 * @generated
	 */
	EReference getBlocks_Base_Association();

	/**
	 * Returns the meta object for class '{@link Anatomy.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see Anatomy.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link Anatomy.Relationship#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see Anatomy.Relationship#getBase_Association()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Base_Association();

	/**
	 * Returns the meta object for enum '{@link Anatomy.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see Anatomy.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link Anatomy.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see Anatomy.State
	 * @generated
	 */
	EEnum getState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnatomyFactory getAnatomyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Anatomy.impl.WorkPartImpl <em>Work Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Anatomy.impl.WorkPartImpl
		 * @see Anatomy.impl.AnatomyPackageImpl#getWorkPart()
		 * @generated
		 */
		EClass WORK_PART = eINSTANCE.getWorkPart();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PART__BASE_CLASS = eINSTANCE.getWorkPart_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PART__TYPE = eINSTANCE.getWorkPart_Type();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PART__STATE = eINSTANCE.getWorkPart_State();

		/**
		 * The meta object literal for the '{@link Anatomy.impl.BlocksImpl <em>Blocks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Anatomy.impl.BlocksImpl
		 * @see Anatomy.impl.AnatomyPackageImpl#getBlocks()
		 * @generated
		 */
		EClass BLOCKS = eINSTANCE.getBlocks();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCKS__BASE_ASSOCIATION = eINSTANCE.getBlocks_Base_Association();

		/**
		 * The meta object literal for the '{@link Anatomy.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Anatomy.impl.RelationshipImpl
		 * @see Anatomy.impl.AnatomyPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__BASE_ASSOCIATION = eINSTANCE.getRelationship_Base_Association();

		/**
		 * The meta object literal for the '{@link Anatomy.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Anatomy.Type
		 * @see Anatomy.impl.AnatomyPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link Anatomy.State <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Anatomy.State
		 * @see Anatomy.impl.AnatomyPackageImpl#getState()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getState();

	}

} //AnatomyPackage
