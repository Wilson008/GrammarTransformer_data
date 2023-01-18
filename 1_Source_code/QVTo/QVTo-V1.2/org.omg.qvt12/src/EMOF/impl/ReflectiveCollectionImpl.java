/**
 */
package EMOF.impl;

import EMOF.EMOFPackage;
import EMOF.ReflectiveCollection;
import EMOF.ReflectiveSequence;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflective Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReflectiveCollectionImpl extends ObjectImpl implements ReflectiveCollection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflectiveCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMOFPackage.Literals.REFLECTIVE_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean add(EMOF.Object object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean addAll(ReflectiveSequence objects) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clear() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean remove(EMOF.Object object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer size() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EMOFPackage.REFLECTIVE_COLLECTION___ADD__OBJECT:
				return add((EMOF.Object)arguments.get(0));
			case EMOFPackage.REFLECTIVE_COLLECTION___ADD_ALL__REFLECTIVESEQUENCE:
				return addAll((ReflectiveSequence)arguments.get(0));
			case EMOFPackage.REFLECTIVE_COLLECTION___CLEAR:
				clear();
				return null;
			case EMOFPackage.REFLECTIVE_COLLECTION___REMOVE__OBJECT:
				return remove((EMOF.Object)arguments.get(0));
			case EMOFPackage.REFLECTIVE_COLLECTION___SIZE:
				return size();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReflectiveCollectionImpl
