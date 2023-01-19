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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.scenariotools.sml.ChannelOptions;
import org.scenariotools.sml.Collaboration;
import org.scenariotools.sml.DummyExprClass;
import org.scenariotools.sml.EventParameterRanges;
import org.scenariotools.sml.SmlPackage;
import org.scenariotools.sml.Specification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.SpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.SpecificationImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.SpecificationImpl#getDomains <em>Domains</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.SpecificationImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.SpecificationImpl#getControllableEClasses <em>Controllable EClasses</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.SpecificationImpl#getNonSpontaneousOperations <em>Non Spontaneous Operations</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.SpecificationImpl#getCollaborations <em>Collaborations</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.SpecificationImpl#getContainedCollaborations <em>Contained Collaborations</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.SpecificationImpl#getIncludedCollaborations <em>Included Collaborations</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.SpecificationImpl#getEventParameterRanges <em>Event Parameter Ranges</em>}</li>
 *   <li>{@link org.scenariotools.sml.impl.SpecificationImpl#getChannelOptions <em>Channel Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationImpl extends MinimalEObjectImpl.Container implements Specification {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<DummyExprClass> imports;

	/**
	 * The cached value of the '{@link #getDomains() <em>Domains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> domains;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> contexts;

	/**
	 * The cached value of the '{@link #getControllableEClasses() <em>Controllable EClasses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllableEClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> controllableEClasses;

	/**
	 * The cached value of the '{@link #getNonSpontaneousOperations() <em>Non Spontaneous Operations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonSpontaneousOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<ETypedElement> nonSpontaneousOperations;

	/**
	 * The cached value of the '{@link #getCollaborations() <em>Collaborations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborations()
	 * @generated
	 * @ordered
	 */
	protected EList<Collaboration> collaborations;

	/**
	 * The cached value of the '{@link #getContainedCollaborations() <em>Contained Collaborations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedCollaborations()
	 * @generated
	 * @ordered
	 */
	protected EList<Collaboration> containedCollaborations;

	/**
	 * The cached value of the '{@link #getIncludedCollaborations() <em>Included Collaborations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedCollaborations()
	 * @generated
	 * @ordered
	 */
	protected EList<Collaboration> includedCollaborations;

	/**
	 * The cached value of the '{@link #getEventParameterRanges() <em>Event Parameter Ranges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventParameterRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<EventParameterRanges> eventParameterRanges;

	/**
	 * The cached value of the '{@link #getChannelOptions() <em>Channel Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelOptions()
	 * @generated
	 * @ordered
	 */
	protected ChannelOptions channelOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Collaboration> getCollaborations() {
		if (collaborations == null) {
			collaborations = new EObjectResolvingEList<Collaboration>(Collaboration.class, this, SmlPackage.SPECIFICATION__COLLABORATIONS);
		}
		collaborations.addAll(getContainedCollaborations());
		collaborations.addAll(getIncludedCollaborations());
		return collaborations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Collaboration> getContainedCollaborations() {
		if (containedCollaborations == null) {
			containedCollaborations = new EObjectContainmentEList<Collaboration>(Collaboration.class, this, SmlPackage.SPECIFICATION__CONTAINED_COLLABORATIONS);
		}
		return containedCollaborations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Collaboration> getIncludedCollaborations() {
		if (includedCollaborations == null) {
			includedCollaborations = new EObjectResolvingEList<Collaboration>(Collaboration.class, this, SmlPackage.SPECIFICATION__INCLUDED_COLLABORATIONS);
		}
		return includedCollaborations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventParameterRanges> getEventParameterRanges() {
		if (eventParameterRanges == null) {
			eventParameterRanges = new EObjectContainmentEList<EventParameterRanges>(EventParameterRanges.class, this, SmlPackage.SPECIFICATION__EVENT_PARAMETER_RANGES);
		}
		return eventParameterRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelOptions getChannelOptions() {
		return channelOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannelOptions(ChannelOptions newChannelOptions, NotificationChain msgs) {
		ChannelOptions oldChannelOptions = channelOptions;
		channelOptions = newChannelOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.SPECIFICATION__CHANNEL_OPTIONS, oldChannelOptions, newChannelOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelOptions(ChannelOptions newChannelOptions) {
		if (newChannelOptions != channelOptions) {
			NotificationChain msgs = null;
			if (channelOptions != null)
				msgs = ((InternalEObject)channelOptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.SPECIFICATION__CHANNEL_OPTIONS, null, msgs);
			if (newChannelOptions != null)
				msgs = ((InternalEObject)newChannelOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.SPECIFICATION__CHANNEL_OPTIONS, null, msgs);
			msgs = basicSetChannelOptions(newChannelOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.SPECIFICATION__CHANNEL_OPTIONS, newChannelOptions, newChannelOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getDomains() {
		if (domains == null) {
			domains = new EObjectResolvingEList<EPackage>(EPackage.class, this, SmlPackage.SPECIFICATION__DOMAINS);
		}
		return domains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getContexts() {
		if (contexts == null) {
			contexts = new EObjectResolvingEList<EPackage>(EPackage.class, this, SmlPackage.SPECIFICATION__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getControllableEClasses() {
		if (controllableEClasses == null) {
			controllableEClasses = new EObjectResolvingEList<EClass>(EClass.class, this, SmlPackage.SPECIFICATION__CONTROLLABLE_ECLASSES);
		}
		return controllableEClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ETypedElement> getNonSpontaneousOperations() {
		if (nonSpontaneousOperations == null) {
			nonSpontaneousOperations = new EObjectResolvingEList<ETypedElement>(ETypedElement.class, this, SmlPackage.SPECIFICATION__NON_SPONTANEOUS_OPERATIONS);
		}
		return nonSpontaneousOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DummyExprClass> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<DummyExprClass>(DummyExprClass.class, this, SmlPackage.SPECIFICATION__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.SPECIFICATION__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case SmlPackage.SPECIFICATION__CONTAINED_COLLABORATIONS:
				return ((InternalEList<?>)getContainedCollaborations()).basicRemove(otherEnd, msgs);
			case SmlPackage.SPECIFICATION__EVENT_PARAMETER_RANGES:
				return ((InternalEList<?>)getEventParameterRanges()).basicRemove(otherEnd, msgs);
			case SmlPackage.SPECIFICATION__CHANNEL_OPTIONS:
				return basicSetChannelOptions(null, msgs);
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
			case SmlPackage.SPECIFICATION__NAME:
				return getName();
			case SmlPackage.SPECIFICATION__IMPORTS:
				return getImports();
			case SmlPackage.SPECIFICATION__DOMAINS:
				return getDomains();
			case SmlPackage.SPECIFICATION__CONTEXTS:
				return getContexts();
			case SmlPackage.SPECIFICATION__CONTROLLABLE_ECLASSES:
				return getControllableEClasses();
			case SmlPackage.SPECIFICATION__NON_SPONTANEOUS_OPERATIONS:
				return getNonSpontaneousOperations();
			case SmlPackage.SPECIFICATION__COLLABORATIONS:
				return getCollaborations();
			case SmlPackage.SPECIFICATION__CONTAINED_COLLABORATIONS:
				return getContainedCollaborations();
			case SmlPackage.SPECIFICATION__INCLUDED_COLLABORATIONS:
				return getIncludedCollaborations();
			case SmlPackage.SPECIFICATION__EVENT_PARAMETER_RANGES:
				return getEventParameterRanges();
			case SmlPackage.SPECIFICATION__CHANNEL_OPTIONS:
				return getChannelOptions();
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
			case SmlPackage.SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case SmlPackage.SPECIFICATION__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends DummyExprClass>)newValue);
				return;
			case SmlPackage.SPECIFICATION__DOMAINS:
				getDomains().clear();
				getDomains().addAll((Collection<? extends EPackage>)newValue);
				return;
			case SmlPackage.SPECIFICATION__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends EPackage>)newValue);
				return;
			case SmlPackage.SPECIFICATION__CONTROLLABLE_ECLASSES:
				getControllableEClasses().clear();
				getControllableEClasses().addAll((Collection<? extends EClass>)newValue);
				return;
			case SmlPackage.SPECIFICATION__NON_SPONTANEOUS_OPERATIONS:
				getNonSpontaneousOperations().clear();
				getNonSpontaneousOperations().addAll((Collection<? extends ETypedElement>)newValue);
				return;
			case SmlPackage.SPECIFICATION__COLLABORATIONS:
				getCollaborations().clear();
				getCollaborations().addAll((Collection<? extends Collaboration>)newValue);
				return;
			case SmlPackage.SPECIFICATION__CONTAINED_COLLABORATIONS:
				getContainedCollaborations().clear();
				getContainedCollaborations().addAll((Collection<? extends Collaboration>)newValue);
				return;
			case SmlPackage.SPECIFICATION__INCLUDED_COLLABORATIONS:
				getIncludedCollaborations().clear();
				getIncludedCollaborations().addAll((Collection<? extends Collaboration>)newValue);
				return;
			case SmlPackage.SPECIFICATION__EVENT_PARAMETER_RANGES:
				getEventParameterRanges().clear();
				getEventParameterRanges().addAll((Collection<? extends EventParameterRanges>)newValue);
				return;
			case SmlPackage.SPECIFICATION__CHANNEL_OPTIONS:
				setChannelOptions((ChannelOptions)newValue);
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
			case SmlPackage.SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmlPackage.SPECIFICATION__IMPORTS:
				getImports().clear();
				return;
			case SmlPackage.SPECIFICATION__DOMAINS:
				getDomains().clear();
				return;
			case SmlPackage.SPECIFICATION__CONTEXTS:
				getContexts().clear();
				return;
			case SmlPackage.SPECIFICATION__CONTROLLABLE_ECLASSES:
				getControllableEClasses().clear();
				return;
			case SmlPackage.SPECIFICATION__NON_SPONTANEOUS_OPERATIONS:
				getNonSpontaneousOperations().clear();
				return;
			case SmlPackage.SPECIFICATION__COLLABORATIONS:
				getCollaborations().clear();
				return;
			case SmlPackage.SPECIFICATION__CONTAINED_COLLABORATIONS:
				getContainedCollaborations().clear();
				return;
			case SmlPackage.SPECIFICATION__INCLUDED_COLLABORATIONS:
				getIncludedCollaborations().clear();
				return;
			case SmlPackage.SPECIFICATION__EVENT_PARAMETER_RANGES:
				getEventParameterRanges().clear();
				return;
			case SmlPackage.SPECIFICATION__CHANNEL_OPTIONS:
				setChannelOptions((ChannelOptions)null);
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
			case SmlPackage.SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmlPackage.SPECIFICATION__IMPORTS:
				return imports != null && !imports.isEmpty();
			case SmlPackage.SPECIFICATION__DOMAINS:
				return domains != null && !domains.isEmpty();
			case SmlPackage.SPECIFICATION__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
			case SmlPackage.SPECIFICATION__CONTROLLABLE_ECLASSES:
				return controllableEClasses != null && !controllableEClasses.isEmpty();
			case SmlPackage.SPECIFICATION__NON_SPONTANEOUS_OPERATIONS:
				return nonSpontaneousOperations != null && !nonSpontaneousOperations.isEmpty();
			case SmlPackage.SPECIFICATION__COLLABORATIONS:
				return collaborations != null && !collaborations.isEmpty();
			case SmlPackage.SPECIFICATION__CONTAINED_COLLABORATIONS:
				return containedCollaborations != null && !containedCollaborations.isEmpty();
			case SmlPackage.SPECIFICATION__INCLUDED_COLLABORATIONS:
				return includedCollaborations != null && !includedCollaborations.isEmpty();
			case SmlPackage.SPECIFICATION__EVENT_PARAMETER_RANGES:
				return eventParameterRanges != null && !eventParameterRanges.isEmpty();
			case SmlPackage.SPECIFICATION__CHANNEL_OPTIONS:
				return channelOptions != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecificationImpl
