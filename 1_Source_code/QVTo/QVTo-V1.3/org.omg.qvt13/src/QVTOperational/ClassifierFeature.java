/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.ClassifierFeature#getFeature_qualifier <em>Feature qualifier</em>}</li>
 *   <li>{@link QVTOperational.ClassifierFeature#getDeclarator <em>Declarator</em>}</li>
 *   <li>{@link QVTOperational.ClassifierFeature#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link QVTOperational.ClassifierFeature#getOpposite_property <em>Opposite property</em>}</li>
 *   <li>{@link QVTOperational.ClassifierFeature#getComplete_signature <em>Complete signature</em>}</li>
 *   <li>{@link QVTOperational.ClassifierFeature#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getClassifierFeature()
 * @model
 * @generated
 */
public interface ClassifierFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature qualifier</em>' containment reference.
	 * @see #setFeature_qualifier(FeatureQualifier)
	 * @see QVTOperational.QVTOperationalPackage#getClassifierFeature_Feature_qualifier()
	 * @model containment="true"
	 * @generated
	 */
	FeatureQualifier getFeature_qualifier();

	/**
	 * Sets the value of the '{@link QVTOperational.ClassifierFeature#getFeature_qualifier <em>Feature qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature qualifier</em>' containment reference.
	 * @see #getFeature_qualifier()
	 * @generated
	 */
	void setFeature_qualifier(FeatureQualifier value);

	/**
	 * Returns the value of the '<em><b>Declarator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarator</em>' containment reference.
	 * @see #setDeclarator(Declarator)
	 * @see QVTOperational.QVTOperationalPackage#getClassifierFeature_Declarator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Declarator getDeclarator();

	/**
	 * Sets the value of the '{@link QVTOperational.ClassifierFeature#getDeclarator <em>Declarator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declarator</em>' containment reference.
	 * @see #getDeclarator()
	 * @generated
	 */
	void setDeclarator(Declarator value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(Multiplicity)
	 * @see QVTOperational.QVTOperationalPackage#getClassifierFeature_Multiplicity()
	 * @model containment="true"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link QVTOperational.ClassifierFeature#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>Opposite property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite property</em>' containment reference.
	 * @see #setOpposite_property(OppositeProperty)
	 * @see QVTOperational.QVTOperationalPackage#getClassifierFeature_Opposite_property()
	 * @model containment="true"
	 * @generated
	 */
	OppositeProperty getOpposite_property();

	/**
	 * Sets the value of the '{@link QVTOperational.ClassifierFeature#getOpposite_property <em>Opposite property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite property</em>' containment reference.
	 * @see #getOpposite_property()
	 * @generated
	 */
	void setOpposite_property(OppositeProperty value);

	/**
	 * Returns the value of the '<em><b>Complete signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete signature</em>' containment reference.
	 * @see #setComplete_signature(CompleteSignature)
	 * @see QVTOperational.QVTOperationalPackage#getClassifierFeature_Complete_signature()
	 * @model containment="true"
	 * @generated
	 */
	CompleteSignature getComplete_signature();

	/**
	 * Sets the value of the '{@link QVTOperational.ClassifierFeature#getComplete_signature <em>Complete signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete signature</em>' containment reference.
	 * @see #getComplete_signature()
	 * @generated
	 */
	void setComplete_signature(CompleteSignature value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference.
	 * @see #setTag(TagGO)
	 * @see QVTOperational.QVTOperationalPackage#getClassifierFeature_Tag()
	 * @model containment="true"
	 * @generated
	 */
	TagGO getTag();

	/**
	 * Sets the value of the '{@link QVTOperational.ClassifierFeature#getTag <em>Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' containment reference.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(TagGO value);

} // ClassifierFeature
