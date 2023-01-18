/**
 */
package EssentialOCL;

import EMOF.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EssentialOCL.EnumLiteralExp#getReferredEnumLiteral <em>Referred Enum Literal</em>}</li>
 * </ul>
 *
 * @see EssentialOCL.EssentialOCLPackage#getEnumLiteralExp()
 * @model
 * @generated
 */
public interface EnumLiteralExp extends LiteralExp {
	/**
	 * Returns the value of the '<em><b>Referred Enum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Enum Literal</em>' reference.
	 * @see #setReferredEnumLiteral(EnumerationLiteral)
	 * @see EssentialOCL.EssentialOCLPackage#getEnumLiteralExp_ReferredEnumLiteral()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='literalExp'"
	 * @generated
	 */
	EnumerationLiteral getReferredEnumLiteral();

	/**
	 * Sets the value of the '{@link EssentialOCL.EnumLiteralExp#getReferredEnumLiteral <em>Referred Enum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Enum Literal</em>' reference.
	 * @see #getReferredEnumLiteral()
	 * @generated
	 */
	void setReferredEnumLiteral(EnumerationLiteral value);

} // EnumLiteralExp
