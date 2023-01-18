/**
 */
package qvtoperational;

import emof.URIExtent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.ModelType#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link qvtoperational.ModelType#getAdditionalCondition <em>Additional Condition</em>}</li>
 *   <li>{@link qvtoperational.ModelType#getConformanceKind <em>Conformance Kind</em>}</li>
 *   <li>{@link qvtoperational.ModelType#getCompliance_kind <em>Compliance kind</em>}</li>
 *   <li>{@link qvtoperational.ModelType#getPackageref_list <em>Packageref list</em>}</li>
 *   <li>{@link qvtoperational.ModelType#getModeltype_where <em>Modeltype where</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getModelType()
 * @model
 * @generated
 */
public interface ModelType extends URIExtent, qvtoperational.Module, emof.Class {
	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference list.
	 * The list contents are of type {@link emof.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference list.
	 * @see qvtoperational.QvtoperationalPackage#getModelType_Metamodel()
	 * @model
	 * @generated
	 */
	EList<emof.Package> getMetamodel();

	/**
	 * Returns the value of the '<em><b>Additional Condition</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.ExpressionGO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Condition</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getModelType_AdditionalCondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionGO> getAdditionalCondition();

	/**
	 * Returns the value of the '<em><b>Conformance Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformance Kind</em>' attribute.
	 * @see #setConformanceKind(String)
	 * @see qvtoperational.QvtoperationalPackage#getModelType_ConformanceKind()
	 * @model dataType="emof.String"
	 * @generated
	 */
	String getConformanceKind();

	/**
	 * Sets the value of the '{@link qvtoperational.ModelType#getConformanceKind <em>Conformance Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance Kind</em>' attribute.
	 * @see #getConformanceKind()
	 * @generated
	 */
	void setConformanceKind(String value);

	/**
	 * Returns the value of the '<em><b>Compliance kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliance kind</em>' attribute.
	 * @see #setCompliance_kind(String)
	 * @see qvtoperational.QvtoperationalPackage#getModelType_Compliance_kind()
	 * @model
	 * @generated
	 */
	String getCompliance_kind();

	/**
	 * Sets the value of the '{@link qvtoperational.ModelType#getCompliance_kind <em>Compliance kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance kind</em>' attribute.
	 * @see #getCompliance_kind()
	 * @generated
	 */
	void setCompliance_kind(String value);

	/**
	 * Returns the value of the '<em><b>Packageref list</b></em>' containment reference list.
	 * The list contents are of type {@link qvtoperational.PackageRefGO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packageref list</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getModelType_Packageref_list()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageRefGO> getPackageref_list();

	/**
	 * Returns the value of the '<em><b>Modeltype where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeltype where</em>' containment reference.
	 * @see #setModeltype_where(ExpressionBlock)
	 * @see qvtoperational.QvtoperationalPackage#getModelType_Modeltype_where()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionBlock getModeltype_where();

	/**
	 * Sets the value of the '{@link qvtoperational.ModelType#getModeltype_where <em>Modeltype where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeltype where</em>' containment reference.
	 * @see #getModeltype_where()
	 * @generated
	 */
	void setModeltype_where(ExpressionBlock value);

} // ModelType
