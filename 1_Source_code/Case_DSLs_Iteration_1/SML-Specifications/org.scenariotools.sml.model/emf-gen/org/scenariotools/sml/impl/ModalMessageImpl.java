/**
 * Copyright (c) 2016 Joel Greenyer and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * ScenarioTools-URL: www.scenariotools.org
 *    
 * Contributors:
 *     ScenarioTools Team - Initial API and implementation
 */
package org.scenariotools.sml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.scenariotools.sml.ExpectationKind;
import org.scenariotools.sml.Message;
import org.scenariotools.sml.ModalMessage;
import org.scenariotools.sml.ParameterBinding;
import org.scenariotools.sml.Role;
import org.scenariotools.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modal Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.ModalMessageImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ModalMessageImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ModalMessageImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ModalMessageImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ModalMessageImpl#getCollectionModification <em>Collection Modification</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ModalMessageImpl#isStrict <em>Strict</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ModalMessageImpl#isMonitored <em>Monitored</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ModalMessageImpl#getExpectationKind <em>Expectation Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModalMessageImpl extends InteractionFragmentImpl implements ModalMessage {
	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected Role receiver;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Role sender;

	/**
	 * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElement()
	 * @generated
	 * @ordered
	 */
	protected ETypedElement modelElement;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterBinding> parameters;

	/**
	 * The default value of the '{@link #getCollectionModification() <em>Collection Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionModification()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLECTION_MODIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollectionModification() <em>Collection Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionModification()
	 * @generated
	 * @ordered
	 */
	protected String collectionModification = COLLECTION_MODIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isStrict() <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRICT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrict() <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected boolean strict = STRICT_EDEFAULT;

	/**
	 * The default value of the '{@link #isMonitored() <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitored()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONITORED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonitored() <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitored()
	 * @generated
	 * @ordered
	 */
	protected boolean monitored = MONITORED_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectationKind() <em>Expectation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectationKind()
	 * @generated
	 * @ordered
	 */
	protected static final ExpectationKind EXPECTATION_KIND_EDEFAULT = ExpectationKind.NONE;

	/**
	 * The cached value of the '{@link #getExpectationKind() <em>Expectation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectationKind()
	 * @generated
	 * @ordered
	 */
	protected ExpectationKind expectationKind = EXPECTATION_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModalMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.MODAL_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (Role)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.MODAL_MESSAGE__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(Role newReceiver) {
		Role oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.MODAL_MESSAGE__RECEIVER, oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject)sender;
			sender = (Role)eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.MODAL_MESSAGE__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(Role newSender) {
		Role oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.MODAL_MESSAGE__SENDER, oldSender, sender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypedElement getModelElement() {
		if (modelElement != null && modelElement.eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = (ETypedElement)eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.MODAL_MESSAGE__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypedElement basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElement(ETypedElement newModelElement) {
		ETypedElement oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.MODAL_MESSAGE__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterBinding> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ParameterBinding>(ParameterBinding.class, this, SmlPackage.MODAL_MESSAGE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollectionModification() {
		return collectionModification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionModification(String newCollectionModification) {
		String oldCollectionModification = collectionModification;
		collectionModification = newCollectionModification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.MODAL_MESSAGE__COLLECTION_MODIFICATION, oldCollectionModification, collectionModification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrict() {
		return strict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrict(boolean newStrict) {
		boolean oldStrict = strict;
		strict = newStrict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.MODAL_MESSAGE__STRICT, oldStrict, strict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonitored() {
		return monitored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitored(boolean newMonitored) {
		boolean oldMonitored = monitored;
		monitored = newMonitored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.MODAL_MESSAGE__MONITORED, oldMonitored, monitored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectationKind getExpectationKind() {
		return expectationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectationKind(ExpectationKind newExpectationKind) {
		ExpectationKind oldExpectationKind = expectationKind;
		expectationKind = newExpectationKind == null ? EXPECTATION_KIND_EDEFAULT : newExpectationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.MODAL_MESSAGE__EXPECTATION_KIND, oldExpectationKind, expectationKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.MODAL_MESSAGE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case SmlPackage.MODAL_MESSAGE__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
			case SmlPackage.MODAL_MESSAGE__SENDER:
				if (resolve) return getSender();
				return basicGetSender();
			case SmlPackage.MODAL_MESSAGE__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case SmlPackage.MODAL_MESSAGE__PARAMETERS:
				return getParameters();
			case SmlPackage.MODAL_MESSAGE__COLLECTION_MODIFICATION:
				return getCollectionModification();
			case SmlPackage.MODAL_MESSAGE__STRICT:
				return isStrict();
			case SmlPackage.MODAL_MESSAGE__MONITORED:
				return isMonitored();
			case SmlPackage.MODAL_MESSAGE__EXPECTATION_KIND:
				return getExpectationKind();
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
			case SmlPackage.MODAL_MESSAGE__RECEIVER:
				setReceiver((Role)newValue);
				return;
			case SmlPackage.MODAL_MESSAGE__SENDER:
				setSender((Role)newValue);
				return;
			case SmlPackage.MODAL_MESSAGE__MODEL_ELEMENT:
				setModelElement((ETypedElement)newValue);
				return;
			case SmlPackage.MODAL_MESSAGE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ParameterBinding>)newValue);
				return;
			case SmlPackage.MODAL_MESSAGE__COLLECTION_MODIFICATION:
				setCollectionModification((String)newValue);
				return;
			case SmlPackage.MODAL_MESSAGE__STRICT:
				setStrict((Boolean)newValue);
				return;
			case SmlPackage.MODAL_MESSAGE__MONITORED:
				setMonitored((Boolean)newValue);
				return;
			case SmlPackage.MODAL_MESSAGE__EXPECTATION_KIND:
				setExpectationKind((ExpectationKind)newValue);
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
			case SmlPackage.MODAL_MESSAGE__RECEIVER:
				setReceiver((Role)null);
				return;
			case SmlPackage.MODAL_MESSAGE__SENDER:
				setSender((Role)null);
				return;
			case SmlPackage.MODAL_MESSAGE__MODEL_ELEMENT:
				setModelElement((ETypedElement)null);
				return;
			case SmlPackage.MODAL_MESSAGE__PARAMETERS:
				getParameters().clear();
				return;
			case SmlPackage.MODAL_MESSAGE__COLLECTION_MODIFICATION:
				setCollectionModification(COLLECTION_MODIFICATION_EDEFAULT);
				return;
			case SmlPackage.MODAL_MESSAGE__STRICT:
				setStrict(STRICT_EDEFAULT);
				return;
			case SmlPackage.MODAL_MESSAGE__MONITORED:
				setMonitored(MONITORED_EDEFAULT);
				return;
			case SmlPackage.MODAL_MESSAGE__EXPECTATION_KIND:
				setExpectationKind(EXPECTATION_KIND_EDEFAULT);
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
			case SmlPackage.MODAL_MESSAGE__RECEIVER:
				return receiver != null;
			case SmlPackage.MODAL_MESSAGE__SENDER:
				return sender != null;
			case SmlPackage.MODAL_MESSAGE__MODEL_ELEMENT:
				return modelElement != null;
			case SmlPackage.MODAL_MESSAGE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case SmlPackage.MODAL_MESSAGE__COLLECTION_MODIFICATION:
				return COLLECTION_MODIFICATION_EDEFAULT == null ? collectionModification != null : !COLLECTION_MODIFICATION_EDEFAULT.equals(collectionModification);
			case SmlPackage.MODAL_MESSAGE__STRICT:
				return strict != STRICT_EDEFAULT;
			case SmlPackage.MODAL_MESSAGE__MONITORED:
				return monitored != MONITORED_EDEFAULT;
			case SmlPackage.MODAL_MESSAGE__EXPECTATION_KIND:
				return expectationKind != EXPECTATION_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Message.class) {
			switch (derivedFeatureID) {
				case SmlPackage.MODAL_MESSAGE__RECEIVER: return SmlPackage.MESSAGE__RECEIVER;
				case SmlPackage.MODAL_MESSAGE__SENDER: return SmlPackage.MESSAGE__SENDER;
				case SmlPackage.MODAL_MESSAGE__MODEL_ELEMENT: return SmlPackage.MESSAGE__MODEL_ELEMENT;
				case SmlPackage.MODAL_MESSAGE__PARAMETERS: return SmlPackage.MESSAGE__PARAMETERS;
				case SmlPackage.MODAL_MESSAGE__COLLECTION_MODIFICATION: return SmlPackage.MESSAGE__COLLECTION_MODIFICATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Message.class) {
			switch (baseFeatureID) {
				case SmlPackage.MESSAGE__RECEIVER: return SmlPackage.MODAL_MESSAGE__RECEIVER;
				case SmlPackage.MESSAGE__SENDER: return SmlPackage.MODAL_MESSAGE__SENDER;
				case SmlPackage.MESSAGE__MODEL_ELEMENT: return SmlPackage.MODAL_MESSAGE__MODEL_ELEMENT;
				case SmlPackage.MESSAGE__PARAMETERS: return SmlPackage.MODAL_MESSAGE__PARAMETERS;
				case SmlPackage.MESSAGE__COLLECTION_MODIFICATION: return SmlPackage.MODAL_MESSAGE__COLLECTION_MODIFICATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (collectionModification: ");
		result.append(collectionModification);
		result.append(", strict: ");
		result.append(strict);
		result.append(", monitored: ");
		result.append(monitored);
		result.append(", expectationKind: ");
		result.append(expectationKind);
		result.append(')');
		return result.toString();
	}

} //ModalMessageImpl
