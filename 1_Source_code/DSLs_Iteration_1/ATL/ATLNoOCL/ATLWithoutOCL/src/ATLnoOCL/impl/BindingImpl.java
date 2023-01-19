/**
 */
package ATLnoOCL.impl;

import ATLnoOCL.ATLnoOCLPackage;
import ATLnoOCL.Binding;
import ATLnoOCL.OCLDummy;
import ATLnoOCL.OutPatternElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.impl.BindingImpl#getValue <em>Value</em>}</li>
 *   <li>{@link ATLnoOCL.impl.BindingImpl#getOutPatternElement <em>Out Pattern Element</em>}</li>
 *   <li>{@link ATLnoOCL.impl.BindingImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link ATLnoOCL.impl.BindingImpl#isIsAssignment <em>Is Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingImpl extends LocatedElementImpl implements Binding {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected OCLDummy value;

	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAssignment() <em>Is Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssignment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASSIGNMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAssignment() <em>Is Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssignment()
	 * @generated
	 * @ordered
	 */
	protected boolean isAssignment = IS_ASSIGNMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATLnoOCLPackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDummy getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(OCLDummy newValue, NotificationChain msgs) {
		OCLDummy oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.BINDING__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(OCLDummy newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATLnoOCLPackage.BINDING__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATLnoOCLPackage.BINDING__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.BINDING__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPatternElement getOutPatternElement() {
		if (eContainerFeatureID() != ATLnoOCLPackage.BINDING__OUT_PATTERN_ELEMENT) return null;
		return (OutPatternElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutPatternElement(OutPatternElement newOutPatternElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOutPatternElement, ATLnoOCLPackage.BINDING__OUT_PATTERN_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutPatternElement(OutPatternElement newOutPatternElement) {
		if (newOutPatternElement != eInternalContainer() || (eContainerFeatureID() != ATLnoOCLPackage.BINDING__OUT_PATTERN_ELEMENT && newOutPatternElement != null)) {
			if (EcoreUtil.isAncestor(this, newOutPatternElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOutPatternElement != null)
				msgs = ((InternalEObject)newOutPatternElement).eInverseAdd(this, ATLnoOCLPackage.OUT_PATTERN_ELEMENT__BINDINGS, OutPatternElement.class, msgs);
			msgs = basicSetOutPatternElement(newOutPatternElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.BINDING__OUT_PATTERN_ELEMENT, newOutPatternElement, newOutPatternElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(String newPropertyName) {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.BINDING__PROPERTY_NAME, oldPropertyName, propertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAssignment() {
		return isAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAssignment(boolean newIsAssignment) {
		boolean oldIsAssignment = isAssignment;
		isAssignment = newIsAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.BINDING__IS_ASSIGNMENT, oldIsAssignment, isAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATLnoOCLPackage.BINDING__OUT_PATTERN_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOutPatternElement((OutPatternElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATLnoOCLPackage.BINDING__VALUE:
				return basicSetValue(null, msgs);
			case ATLnoOCLPackage.BINDING__OUT_PATTERN_ELEMENT:
				return basicSetOutPatternElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ATLnoOCLPackage.BINDING__OUT_PATTERN_ELEMENT:
				return eInternalContainer().eInverseRemove(this, ATLnoOCLPackage.OUT_PATTERN_ELEMENT__BINDINGS, OutPatternElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ATLnoOCLPackage.BINDING__VALUE:
				return getValue();
			case ATLnoOCLPackage.BINDING__OUT_PATTERN_ELEMENT:
				return getOutPatternElement();
			case ATLnoOCLPackage.BINDING__PROPERTY_NAME:
				return getPropertyName();
			case ATLnoOCLPackage.BINDING__IS_ASSIGNMENT:
				return isIsAssignment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ATLnoOCLPackage.BINDING__VALUE:
				setValue((OCLDummy)newValue);
				return;
			case ATLnoOCLPackage.BINDING__OUT_PATTERN_ELEMENT:
				setOutPatternElement((OutPatternElement)newValue);
				return;
			case ATLnoOCLPackage.BINDING__PROPERTY_NAME:
				setPropertyName((String)newValue);
				return;
			case ATLnoOCLPackage.BINDING__IS_ASSIGNMENT:
				setIsAssignment((Boolean)newValue);
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
			case ATLnoOCLPackage.BINDING__VALUE:
				setValue((OCLDummy)null);
				return;
			case ATLnoOCLPackage.BINDING__OUT_PATTERN_ELEMENT:
				setOutPatternElement((OutPatternElement)null);
				return;
			case ATLnoOCLPackage.BINDING__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case ATLnoOCLPackage.BINDING__IS_ASSIGNMENT:
				setIsAssignment(IS_ASSIGNMENT_EDEFAULT);
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
			case ATLnoOCLPackage.BINDING__VALUE:
				return value != null;
			case ATLnoOCLPackage.BINDING__OUT_PATTERN_ELEMENT:
				return getOutPatternElement() != null;
			case ATLnoOCLPackage.BINDING__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
			case ATLnoOCLPackage.BINDING__IS_ASSIGNMENT:
				return isAssignment != IS_ASSIGNMENT_EDEFAULT;
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
		result.append(" (propertyName: ");
		result.append(propertyName);
		result.append(", isAssignment: ");
		result.append(isAssignment);
		result.append(')');
		return result.toString();
	}

} //BindingImpl
