/**
 */
package EMOF.impl;

import EMOF.EMOFPackage;
import EMOF.ReflectiveSequence;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflective Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReflectiveSequenceImpl extends ReflectiveCollectionImpl implements ReflectiveSequence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflectiveSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMOFPackage.Literals.REFLECTIVE_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add(Integer index, EMOF.Object object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOF.Object get(Integer index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOF.Object remove(Integer index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOF.Object set(Integer index, EMOF.Object object) {
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
			case EMOFPackage.REFLECTIVE_SEQUENCE___ADD__INTEGER_OBJECT:
				add((Integer)arguments.get(0), (EMOF.Object)arguments.get(1));
				return null;
			case EMOFPackage.REFLECTIVE_SEQUENCE___GET__INTEGER:
				return get((Integer)arguments.get(0));
			case EMOFPackage.REFLECTIVE_SEQUENCE___REMOVE__INTEGER:
				return remove((Integer)arguments.get(0));
			case EMOFPackage.REFLECTIVE_SEQUENCE___SET__INTEGER_OBJECT:
				return set((Integer)arguments.get(0), (EMOF.Object)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReflectiveSequenceImpl
