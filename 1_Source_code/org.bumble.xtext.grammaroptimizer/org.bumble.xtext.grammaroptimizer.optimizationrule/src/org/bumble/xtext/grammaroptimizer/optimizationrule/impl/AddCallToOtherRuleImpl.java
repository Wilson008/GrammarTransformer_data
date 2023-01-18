/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import java.util.ArrayList;
import java.util.List;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.grammarrule.impl.LineEntryImpl;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddCallToOtherRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Call To Other Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddCallToOtherRuleImpl#getNameOfOtherClass <em>Name Of Other Class</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddCallToOtherRuleImpl#isRemoveAction <em>Remove Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddCallToOtherRuleImpl extends OptimizationRuleImpl implements AddCallToOtherRule {
	/**
	 * The default value of the '{@link #getNameOfOtherClass() <em>Name Of Other Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOfOtherClass()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_OF_OTHER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameOfOtherClass() <em>Name Of Other Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOfOtherClass()
	 * @generated
	 * @ordered
	 */
	protected String nameOfOtherClass = NAME_OF_OTHER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoveAction() <em>Remove Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveAction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_ACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoveAction() <em>Remove Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveAction()
	 * @generated
	 * @ordered
	 */
	protected boolean removeAction = REMOVE_ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddCallToOtherRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_CALL_TO_OTHER_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameOfOtherClass() {
		return nameOfOtherClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameOfOtherClass(String newNameOfOtherClass) {
		String oldNameOfOtherClass = nameOfOtherClass;
		nameOfOtherClass = newNameOfOtherClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_CALL_TO_OTHER_RULE__NAME_OF_OTHER_CLASS, oldNameOfOtherClass, nameOfOtherClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoveAction() {
		return removeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveAction(boolean newRemoveAction) {
		boolean oldRemoveAction = removeAction;
		removeAction = newRemoveAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_CALL_TO_OTHER_RULE__REMOVE_ACTION, oldRemoveAction, removeAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_CALL_TO_OTHER_RULE__NAME_OF_OTHER_CLASS:
				return getNameOfOtherClass();
			case OptimizationrulePackage.ADD_CALL_TO_OTHER_RULE__REMOVE_ACTION:
				return isRemoveAction();
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
			case OptimizationrulePackage.ADD_CALL_TO_OTHER_RULE__NAME_OF_OTHER_CLASS:
				setNameOfOtherClass((String)newValue);
				return;
			case OptimizationrulePackage.ADD_CALL_TO_OTHER_RULE__REMOVE_ACTION:
				setRemoveAction((Boolean)newValue);
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
			case OptimizationrulePackage.ADD_CALL_TO_OTHER_RULE__NAME_OF_OTHER_CLASS:
				setNameOfOtherClass(NAME_OF_OTHER_CLASS_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_CALL_TO_OTHER_RULE__REMOVE_ACTION:
				setRemoveAction(REMOVE_ACTION_EDEFAULT);
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
			case OptimizationrulePackage.ADD_CALL_TO_OTHER_RULE__NAME_OF_OTHER_CLASS:
				return NAME_OF_OTHER_CLASS_EDEFAULT == null ? nameOfOtherClass != null : !NAME_OF_OTHER_CLASS_EDEFAULT.equals(nameOfOtherClass);
			case OptimizationrulePackage.ADD_CALL_TO_OTHER_RULE__REMOVE_ACTION:
				return removeAction != REMOVE_ACTION_EDEFAULT;
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
		result.append(" (nameOfOtherClass: ");
		result.append(nameOfOtherClass);
		result.append(", removeAction: ");
		result.append(removeAction);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		if (grammarRule == null || nameOfOtherClass == null)
			return;
		
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (!rule.getName().equals(grammarRule))
				continue;
			
			List<LineEntry> tempList = new ArrayList<LineEntry>();
			
			tempList.add(rule.getLines().get(0));
			
			LineEntryImpl lineEntry = new LineEntryImpl();
			if (removeAction)
				lineEntry.setLineContent("    " + nameOfOtherClass);
			else
				lineEntry.setLineContent("    " + nameOfOtherClass + " |");
			tempList.add(lineEntry);
			
			for (int j = 1; j < rule.getLines().size(); j++) {
				tempList.add(rule.getLines().get(j));
			}
			
			for (int k = 0; k < tempList.size(); k++) {
				rule.getLines().clear();
				rule.getLines().addAll(tempList);
			}
			
			break;
		}
	}
} //AddCallToOtherRuleImpl
