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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.scenariotools.sml.ObjectQueryBindingExpression;
import org.scenariotools.sml.ObjectQueryValue;
import org.scenariotools.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Query Binding Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.ObjectQueryBindingExpressionImpl#getQueryClass <em>Query Class</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.ObjectQueryBindingExpressionImpl#getQueryValues <em>Query Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectQueryBindingExpressionImpl extends BindingExpressionImpl implements ObjectQueryBindingExpression {
	/**
	 * The cached value of the '{@link #getQueryClass() <em>Query Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryClass()
	 * @generated
	 * @ordered
	 */
	protected EClass queryClass;

	/**
	 * The cached value of the '{@link #getQueryValues() <em>Query Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectQueryValue> queryValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectQueryBindingExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.OBJECT_QUERY_BINDING_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryClass() {
		if (queryClass != null && queryClass.eIsProxy()) {
			InternalEObject oldQueryClass = (InternalEObject)queryClass;
			queryClass = (EClass)eResolveProxy(oldQueryClass);
			if (queryClass != oldQueryClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.OBJECT_QUERY_BINDING_EXPRESSION__QUERY_CLASS, oldQueryClass, queryClass));
			}
		}
		return queryClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetQueryClass() {
		return queryClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryClass(EClass newQueryClass) {
		EClass oldQueryClass = queryClass;
		queryClass = newQueryClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.OBJECT_QUERY_BINDING_EXPRESSION__QUERY_CLASS, oldQueryClass, queryClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectQueryValue> getQueryValues() {
		if (queryValues == null) {
			queryValues = new EObjectContainmentEList<ObjectQueryValue>(ObjectQueryValue.class, this, SmlPackage.OBJECT_QUERY_BINDING_EXPRESSION__QUERY_VALUES);
		}
		return queryValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.OBJECT_QUERY_BINDING_EXPRESSION__QUERY_VALUES:
				return ((InternalEList<?>)getQueryValues()).basicRemove(otherEnd, msgs);
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
			case SmlPackage.OBJECT_QUERY_BINDING_EXPRESSION__QUERY_CLASS:
				if (resolve) return getQueryClass();
				return basicGetQueryClass();
			case SmlPackage.OBJECT_QUERY_BINDING_EXPRESSION__QUERY_VALUES:
				return getQueryValues();
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
			case SmlPackage.OBJECT_QUERY_BINDING_EXPRESSION__QUERY_CLASS:
				setQueryClass((EClass)newValue);
				return;
			case SmlPackage.OBJECT_QUERY_BINDING_EXPRESSION__QUERY_VALUES:
				getQueryValues().clear();
				getQueryValues().addAll((Collection<? extends ObjectQueryValue>)newValue);
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
			case SmlPackage.OBJECT_QUERY_BINDING_EXPRESSION__QUERY_CLASS:
				setQueryClass((EClass)null);
				return;
			case SmlPackage.OBJECT_QUERY_BINDING_EXPRESSION__QUERY_VALUES:
				getQueryValues().clear();
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
			case SmlPackage.OBJECT_QUERY_BINDING_EXPRESSION__QUERY_CLASS:
				return queryClass != null;
			case SmlPackage.OBJECT_QUERY_BINDING_EXPRESSION__QUERY_VALUES:
				return queryValues != null && !queryValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectQueryBindingExpressionImpl
