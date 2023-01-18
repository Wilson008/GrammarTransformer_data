/**
 */
package QVTOperational;

import EMOF.Property;
import EMOF.Tag;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.Module#getConfigProperty <em>Config Property</em>}</li>
 *   <li>{@link QVTOperational.Module#getEntry <em>Entry</em>}</li>
 *   <li>{@link QVTOperational.Module#getModuleImport <em>Module Import</em>}</li>
 *   <li>{@link QVTOperational.Module#getOwnedTag <em>Owned Tag</em>}</li>
 *   <li>{@link QVTOperational.Module#getOwnedVariable <em>Owned Variable</em>}</li>
 *   <li>{@link QVTOperational.Module#getUsedModelType <em>Used Model Type</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EMOF.Package {
	/**
	 * Returns the value of the '<em><b>Config Property</b></em>' reference list.
	 * The list contents are of type {@link EMOF.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Property</em>' reference list.
	 * @see QVTOperational.QVTOperationalPackage#getModule_ConfigProperty()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='module'"
	 * @generated
	 */
	EList<Property> getConfigProperty();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' reference.
	 * @see #setEntry(EntryOperation)
	 * @see QVTOperational.QVTOperationalPackage#getModule_Entry()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='entryContext'"
	 * @generated
	 */
	EntryOperation getEntry();

	/**
	 * Sets the value of the '{@link QVTOperational.Module#getEntry <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(EntryOperation value);

	/**
	 * Returns the value of the '<em><b>Module Import</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.ModuleImport}.
	 * It is bidirectional and its opposite is '{@link QVTOperational.ModuleImport#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Import</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getModule_ModuleImport()
	 * @see QVTOperational.ModuleImport#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<ModuleImport> getModuleImport();

	/**
	 * Returns the value of the '<em><b>Owned Tag</b></em>' containment reference list.
	 * The list contents are of type {@link EMOF.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tag</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getModule_OwnedTag()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owner'"
	 * @generated
	 */
	EList<Tag> getOwnedTag();

	/**
	 * Returns the value of the '<em><b>Owned Variable</b></em>' containment reference list.
	 * The list contents are of type {@link QVTOperational.ExpressionGO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Variable</em>' containment reference list.
	 * @see QVTOperational.QVTOperationalPackage#getModule_OwnedVariable()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='variableOwner'"
	 * @generated
	 */
	EList<ExpressionGO> getOwnedVariable();

	/**
	 * Returns the value of the '<em><b>Used Model Type</b></em>' reference list.
	 * The list contents are of type {@link QVTOperational.ModelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Model Type</em>' reference list.
	 * @see QVTOperational.QVTOperationalPackage#getModule_UsedModelType()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='module'"
	 * @generated
	 */
	EList<ModelType> getUsedModelType();

} // Module
