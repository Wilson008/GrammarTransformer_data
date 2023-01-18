/**
 */
package EMOF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URI Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see EMOF.EMOFPackage#getURIExtent()
 * @model
 * @generated
 */
public interface URIExtent extends Extent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="PrimitiveTypes.String"
	 * @generated
	 */
	String contextURI();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uriDataType="PrimitiveTypes.String"
	 * @generated
	 */
	Element element(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="PrimitiveTypes.String"
	 * @generated
	 */
	String uri(Element element);

} // URIExtent
