/**
 */
package QVTOperational.impl;

import QVTOperational.ExpressionGO;
import QVTOperational.QVTOperationalPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression GO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.ExpressionGOImpl#getDummyContent <em>Dummy Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionGOImpl extends MinimalEObjectImpl.Container implements ExpressionGO {
	/**
	 * The cached value of the '{@link #getDummyContent() <em>Dummy Content</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDummyContent()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dummyContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionGOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.EXPRESSION_GO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDummyContent() {
		if (dummyContent == null) {
			dummyContent = new EDataTypeUniqueEList<String>(String.class, this, QVTOperationalPackage.EXPRESSION_GO__DUMMY_CONTENT);
		}
		return dummyContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QVTOperationalPackage.EXPRESSION_GO__DUMMY_CONTENT:
				return getDummyContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QVTOperationalPackage.EXPRESSION_GO__DUMMY_CONTENT:
				getDummyContent().clear();
				getDummyContent().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QVTOperationalPackage.EXPRESSION_GO__DUMMY_CONTENT:
				getDummyContent().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QVTOperationalPackage.EXPRESSION_GO__DUMMY_CONTENT:
				return dummyContent != null && !dummyContent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dummyContent: ");
		result.append(dummyContent);
		result.append(')');
		return result.toString();
	}

} //ExpressionGOImpl
