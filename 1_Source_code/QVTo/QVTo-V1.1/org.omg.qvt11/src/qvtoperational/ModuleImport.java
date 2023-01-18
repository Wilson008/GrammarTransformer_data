/**
 */
package qvtoperational;

import EMOF.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.ModuleImport#getBinding <em>Binding</em>}</li>
 *   <li>{@link qvtoperational.ModuleImport#getImportedModule <em>Imported Module</em>}</li>
 *   <li>{@link qvtoperational.ModuleImport#getKind <em>Kind</em>}</li>
 *   <li>{@link qvtoperational.ModuleImport#getModule <em>Module</em>}</li>
 *   <li>{@link qvtoperational.ModuleImport#getUnit <em>Unit</em>}</li>
 *   <li>{@link qvtoperational.ModuleImport#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getModuleImport()
 * @model
 * @generated
 */
public interface ModuleImport extends Element {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference list.
	 * The list contents are of type {@link qvtoperational.ModelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference list.
	 * @see qvtoperational.QvtoperationalPackage#getModuleImport_Binding()
	 * @model
	 * @generated
	 */
	EList<ModelType> getBinding();

	/**
	 * Returns the value of the '<em><b>Imported Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Module</em>' reference.
	 * @see #setImportedModule(qvtoperational.Module)
	 * @see qvtoperational.QvtoperationalPackage#getModuleImport_ImportedModule()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='importingElement'"
	 * @generated
	 */
	qvtoperational.Module getImportedModule();

	/**
	 * Sets the value of the '{@link qvtoperational.ModuleImport#getImportedModule <em>Imported Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Module</em>' reference.
	 * @see #getImportedModule()
	 * @generated
	 */
	void setImportedModule(qvtoperational.Module value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link qvtoperational.ImportKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see qvtoperational.ImportKind
	 * @see #setKind(ImportKind)
	 * @see qvtoperational.QvtoperationalPackage#getModuleImport_Kind()
	 * @model
	 * @generated
	 */
	ImportKind getKind();

	/**
	 * Sets the value of the '{@link qvtoperational.ModuleImport#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see qvtoperational.ImportKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ImportKind value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qvtoperational.Module#getModuleImport <em>Module Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(qvtoperational.Module)
	 * @see qvtoperational.QvtoperationalPackage#getModuleImport_Module()
	 * @see qvtoperational.Module#getModuleImport
	 * @model opposite="moduleImport" resolveProxies="false"
	 * @generated
	 */
	qvtoperational.Module getModule();

	/**
	 * Sets the value of the '{@link qvtoperational.ModuleImport#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(qvtoperational.Module value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(UnitRefGO)
	 * @see qvtoperational.QvtoperationalPackage#getModuleImport_Unit()
	 * @model containment="true"
	 * @generated
	 */
	UnitRefGO getUnit();

	/**
	 * Sets the value of the '{@link qvtoperational.ModuleImport#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitRefGO value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute list.
	 * @see qvtoperational.QvtoperationalPackage#getModuleImport_Identifier()
	 * @model
	 * @generated
	 */
	EList<String> getIdentifier();

} // ModuleImport
