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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.scenariotools.sml.AbstractRanges;
import org.scenariotools.sml.RangesForParameter;
import org.scenariotools.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ranges For Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.RangesForParameterImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.RangesForParameterImpl#getRanges <em>Ranges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangesForParameterImpl extends MinimalEObjectImpl.Container implements RangesForParameter {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected ETypedElement parameter;

	/**
	 * The cached value of the '{@link #getRanges() <em>Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRanges()
	 * @generated
	 * @ordered
	 */
	protected AbstractRanges ranges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangesForParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.RANGES_FOR_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypedElement getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (ETypedElement)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.RANGES_FOR_PARAMETER__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypedElement basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(ETypedElement newParameter) {
		ETypedElement oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.RANGES_FOR_PARAMETER__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRanges getRanges() {
		return ranges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRanges(AbstractRanges newRanges, NotificationChain msgs) {
		AbstractRanges oldRanges = ranges;
		ranges = newRanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.RANGES_FOR_PARAMETER__RANGES, oldRanges, newRanges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRanges(AbstractRanges newRanges) {
		if (newRanges != ranges) {
			NotificationChain msgs = null;
			if (ranges != null)
				msgs = ((InternalEObject)ranges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.RANGES_FOR_PARAMETER__RANGES, null, msgs);
			if (newRanges != null)
				msgs = ((InternalEObject)newRanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.RANGES_FOR_PARAMETER__RANGES, null, msgs);
			msgs = basicSetRanges(newRanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.RANGES_FOR_PARAMETER__RANGES, newRanges, newRanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.RANGES_FOR_PARAMETER__RANGES:
				return basicSetRanges(null, msgs);
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
			case SmlPackage.RANGES_FOR_PARAMETER__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
			case SmlPackage.RANGES_FOR_PARAMETER__RANGES:
				return getRanges();
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
			case SmlPackage.RANGES_FOR_PARAMETER__PARAMETER:
				setParameter((ETypedElement)newValue);
				return;
			case SmlPackage.RANGES_FOR_PARAMETER__RANGES:
				setRanges((AbstractRanges)newValue);
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
			case SmlPackage.RANGES_FOR_PARAMETER__PARAMETER:
				setParameter((ETypedElement)null);
				return;
			case SmlPackage.RANGES_FOR_PARAMETER__RANGES:
				setRanges((AbstractRanges)null);
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
			case SmlPackage.RANGES_FOR_PARAMETER__PARAMETER:
				return parameter != null;
			case SmlPackage.RANGES_FOR_PARAMETER__RANGES:
				return ranges != null;
		}
		return super.eIsSet(featureID);
	}

} //RangesForParameterImpl
