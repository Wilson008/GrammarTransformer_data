/**
 */
package ATLnoOCL.impl;

import ATLnoOCL.ATLnoOCLPackage;
import ATLnoOCL.ModuleElement;
import ATLnoOCL.OCLDummy;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.impl.ModuleImpl#isIsRefining <em>Is Refining</em>}</li>
 *   <li>{@link ATLnoOCL.impl.ModuleImpl#getInModels <em>In Models</em>}</li>
 *   <li>{@link ATLnoOCL.impl.ModuleImpl#getOutModels <em>Out Models</em>}</li>
 *   <li>{@link ATLnoOCL.impl.ModuleImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends UnitImpl implements ATLnoOCL.Module {
	/**
	 * The default value of the '{@link #isIsRefining() <em>Is Refining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRefining()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REFINING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRefining() <em>Is Refining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRefining()
	 * @generated
	 * @ordered
	 */
	protected boolean isRefining = IS_REFINING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInModels() <em>In Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInModels()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLDummy> inModels;

	/**
	 * The cached value of the '{@link #getOutModels() <em>Out Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutModels()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLDummy> outModels;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATLnoOCLPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRefining() {
		return isRefining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRefining(boolean newIsRefining) {
		boolean oldIsRefining = isRefining;
		isRefining = newIsRefining;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.MODULE__IS_REFINING, oldIsRefining, isRefining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLDummy> getInModels() {
		if (inModels == null) {
			inModels = new EObjectContainmentEList<OCLDummy>(OCLDummy.class, this, ATLnoOCLPackage.MODULE__IN_MODELS);
		}
		return inModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLDummy> getOutModels() {
		if (outModels == null) {
			outModels = new EObjectContainmentEList<OCLDummy>(OCLDummy.class, this, ATLnoOCLPackage.MODULE__OUT_MODELS);
		}
		return outModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ModuleElement>(ModuleElement.class, this, ATLnoOCLPackage.MODULE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATLnoOCLPackage.MODULE__IN_MODELS:
				return ((InternalEList<?>)getInModels()).basicRemove(otherEnd, msgs);
			case ATLnoOCLPackage.MODULE__OUT_MODELS:
				return ((InternalEList<?>)getOutModels()).basicRemove(otherEnd, msgs);
			case ATLnoOCLPackage.MODULE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case ATLnoOCLPackage.MODULE__IS_REFINING:
				return isIsRefining();
			case ATLnoOCLPackage.MODULE__IN_MODELS:
				return getInModels();
			case ATLnoOCLPackage.MODULE__OUT_MODELS:
				return getOutModels();
			case ATLnoOCLPackage.MODULE__ELEMENTS:
				return getElements();
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
			case ATLnoOCLPackage.MODULE__IS_REFINING:
				setIsRefining((Boolean)newValue);
				return;
			case ATLnoOCLPackage.MODULE__IN_MODELS:
				getInModels().clear();
				getInModels().addAll((Collection<? extends OCLDummy>)newValue);
				return;
			case ATLnoOCLPackage.MODULE__OUT_MODELS:
				getOutModels().clear();
				getOutModels().addAll((Collection<? extends OCLDummy>)newValue);
				return;
			case ATLnoOCLPackage.MODULE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ModuleElement>)newValue);
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
			case ATLnoOCLPackage.MODULE__IS_REFINING:
				setIsRefining(IS_REFINING_EDEFAULT);
				return;
			case ATLnoOCLPackage.MODULE__IN_MODELS:
				getInModels().clear();
				return;
			case ATLnoOCLPackage.MODULE__OUT_MODELS:
				getOutModels().clear();
				return;
			case ATLnoOCLPackage.MODULE__ELEMENTS:
				getElements().clear();
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
			case ATLnoOCLPackage.MODULE__IS_REFINING:
				return isRefining != IS_REFINING_EDEFAULT;
			case ATLnoOCLPackage.MODULE__IN_MODELS:
				return inModels != null && !inModels.isEmpty();
			case ATLnoOCLPackage.MODULE__OUT_MODELS:
				return outModels != null && !outModels.isEmpty();
			case ATLnoOCLPackage.MODULE__ELEMENTS:
				return elements != null && !elements.isEmpty();
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
		result.append(" (isRefining: ");
		result.append(isRefining);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
