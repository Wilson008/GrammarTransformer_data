/**
 */
package spectra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spectra.Define;
import spectra.DefineDecl;
import spectra.SpectraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Define</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.DefineImpl#getDefineList <em>Define List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefineImpl extends DeclImpl implements Define {
	/**
	 * The cached value of the '{@link #getDefineList() <em>Define List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefineList()
	 * @generated
	 * @ordered
	 */
	protected EList<DefineDecl> defineList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.DEFINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefineDecl> getDefineList() {
		if (defineList == null) {
			defineList = new EObjectContainmentEList<DefineDecl>(DefineDecl.class, this, SpectraPackage.DEFINE__DEFINE_LIST);
		}
		return defineList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.DEFINE__DEFINE_LIST:
				return ((InternalEList<?>)getDefineList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpectraPackage.DEFINE__DEFINE_LIST:
				return getDefineList();
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
			case SpectraPackage.DEFINE__DEFINE_LIST:
				getDefineList().clear();
				getDefineList().addAll((Collection<? extends DefineDecl>)newValue);
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
			case SpectraPackage.DEFINE__DEFINE_LIST:
				getDefineList().clear();
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
			case SpectraPackage.DEFINE__DEFINE_LIST:
				return defineList != null && !defineList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DefineImpl