/**
 */
package ATLnoOCL.impl;

import ATLnoOCL.ATLnoOCLPackage;
import ATLnoOCL.OCLDummy;
import ATLnoOCL.PatternElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.impl.PatternElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link ATLnoOCL.impl.PatternElementImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ATLnoOCL.impl.PatternElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link ATLnoOCL.impl.PatternElementImpl#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link ATLnoOCL.impl.PatternElementImpl#getLetExp <em>Let Exp</em>}</li>
 *   <li>{@link ATLnoOCL.impl.PatternElementImpl#getBaseExp <em>Base Exp</em>}</li>
 *   <li>{@link ATLnoOCL.impl.PatternElementImpl#getVariableExp <em>Variable Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PatternElementImpl extends LocatedElementImpl implements PatternElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OCLDummy type;
	/**
	 * The cached value of the '{@link #getInitExpression() <em>Init Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitExpression()
	 * @generated
	 * @ordered
	 */
	protected OCLDummy initExpression;
	/**
	 * The cached value of the '{@link #getLetExp() <em>Let Exp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetExp()
	 * @generated
	 * @ordered
	 */
	protected OCLDummy letExp;
	/**
	 * The cached value of the '{@link #getBaseExp() <em>Base Exp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseExp()
	 * @generated
	 * @ordered
	 */
	protected OCLDummy baseExp;
	/**
	 * The cached value of the '{@link #getVariableExp() <em>Variable Exp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableExp()
	 * @generated
	 * @ordered
	 */
	protected OCLDummy variableExp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATLnoOCLPackage.Literals.PATTERN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.PATTERN_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.PATTERN_ELEMENT__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDummy getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (OCLDummy)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ATLnoOCLPackage.PATTERN_ELEMENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDummy basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(OCLDummy newType) {
		OCLDummy oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.PATTERN_ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDummy getInitExpression() {
		if (initExpression != null && initExpression.eIsProxy()) {
			InternalEObject oldInitExpression = (InternalEObject)initExpression;
			initExpression = (OCLDummy)eResolveProxy(oldInitExpression);
			if (initExpression != oldInitExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ATLnoOCLPackage.PATTERN_ELEMENT__INIT_EXPRESSION, oldInitExpression, initExpression));
			}
		}
		return initExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDummy basicGetInitExpression() {
		return initExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitExpression(OCLDummy newInitExpression) {
		OCLDummy oldInitExpression = initExpression;
		initExpression = newInitExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.PATTERN_ELEMENT__INIT_EXPRESSION, oldInitExpression, initExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDummy getLetExp() {
		if (letExp != null && letExp.eIsProxy()) {
			InternalEObject oldLetExp = (InternalEObject)letExp;
			letExp = (OCLDummy)eResolveProxy(oldLetExp);
			if (letExp != oldLetExp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ATLnoOCLPackage.PATTERN_ELEMENT__LET_EXP, oldLetExp, letExp));
			}
		}
		return letExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDummy basicGetLetExp() {
		return letExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetExp(OCLDummy newLetExp) {
		OCLDummy oldLetExp = letExp;
		letExp = newLetExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.PATTERN_ELEMENT__LET_EXP, oldLetExp, letExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDummy getBaseExp() {
		if (baseExp != null && baseExp.eIsProxy()) {
			InternalEObject oldBaseExp = (InternalEObject)baseExp;
			baseExp = (OCLDummy)eResolveProxy(oldBaseExp);
			if (baseExp != oldBaseExp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ATLnoOCLPackage.PATTERN_ELEMENT__BASE_EXP, oldBaseExp, baseExp));
			}
		}
		return baseExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDummy basicGetBaseExp() {
		return baseExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseExp(OCLDummy newBaseExp) {
		OCLDummy oldBaseExp = baseExp;
		baseExp = newBaseExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.PATTERN_ELEMENT__BASE_EXP, oldBaseExp, baseExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDummy getVariableExp() {
		if (variableExp != null && variableExp.eIsProxy()) {
			InternalEObject oldVariableExp = (InternalEObject)variableExp;
			variableExp = (OCLDummy)eResolveProxy(oldVariableExp);
			if (variableExp != oldVariableExp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ATLnoOCLPackage.PATTERN_ELEMENT__VARIABLE_EXP, oldVariableExp, variableExp));
			}
		}
		return variableExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDummy basicGetVariableExp() {
		return variableExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableExp(OCLDummy newVariableExp) {
		OCLDummy oldVariableExp = variableExp;
		variableExp = newVariableExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.PATTERN_ELEMENT__VARIABLE_EXP, oldVariableExp, variableExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ATLnoOCLPackage.PATTERN_ELEMENT__ID:
				return getId();
			case ATLnoOCLPackage.PATTERN_ELEMENT__VAR_NAME:
				return getVarName();
			case ATLnoOCLPackage.PATTERN_ELEMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ATLnoOCLPackage.PATTERN_ELEMENT__INIT_EXPRESSION:
				if (resolve) return getInitExpression();
				return basicGetInitExpression();
			case ATLnoOCLPackage.PATTERN_ELEMENT__LET_EXP:
				if (resolve) return getLetExp();
				return basicGetLetExp();
			case ATLnoOCLPackage.PATTERN_ELEMENT__BASE_EXP:
				if (resolve) return getBaseExp();
				return basicGetBaseExp();
			case ATLnoOCLPackage.PATTERN_ELEMENT__VARIABLE_EXP:
				if (resolve) return getVariableExp();
				return basicGetVariableExp();
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
			case ATLnoOCLPackage.PATTERN_ELEMENT__ID:
				setId((String)newValue);
				return;
			case ATLnoOCLPackage.PATTERN_ELEMENT__VAR_NAME:
				setVarName((String)newValue);
				return;
			case ATLnoOCLPackage.PATTERN_ELEMENT__TYPE:
				setType((OCLDummy)newValue);
				return;
			case ATLnoOCLPackage.PATTERN_ELEMENT__INIT_EXPRESSION:
				setInitExpression((OCLDummy)newValue);
				return;
			case ATLnoOCLPackage.PATTERN_ELEMENT__LET_EXP:
				setLetExp((OCLDummy)newValue);
				return;
			case ATLnoOCLPackage.PATTERN_ELEMENT__BASE_EXP:
				setBaseExp((OCLDummy)newValue);
				return;
			case ATLnoOCLPackage.PATTERN_ELEMENT__VARIABLE_EXP:
				setVariableExp((OCLDummy)newValue);
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
			case ATLnoOCLPackage.PATTERN_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case ATLnoOCLPackage.PATTERN_ELEMENT__VAR_NAME:
				setVarName(VAR_NAME_EDEFAULT);
				return;
			case ATLnoOCLPackage.PATTERN_ELEMENT__TYPE:
				setType((OCLDummy)null);
				return;
			case ATLnoOCLPackage.PATTERN_ELEMENT__INIT_EXPRESSION:
				setInitExpression((OCLDummy)null);
				return;
			case ATLnoOCLPackage.PATTERN_ELEMENT__LET_EXP:
				setLetExp((OCLDummy)null);
				return;
			case ATLnoOCLPackage.PATTERN_ELEMENT__BASE_EXP:
				setBaseExp((OCLDummy)null);
				return;
			case ATLnoOCLPackage.PATTERN_ELEMENT__VARIABLE_EXP:
				setVariableExp((OCLDummy)null);
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
			case ATLnoOCLPackage.PATTERN_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ATLnoOCLPackage.PATTERN_ELEMENT__VAR_NAME:
				return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
			case ATLnoOCLPackage.PATTERN_ELEMENT__TYPE:
				return type != null;
			case ATLnoOCLPackage.PATTERN_ELEMENT__INIT_EXPRESSION:
				return initExpression != null;
			case ATLnoOCLPackage.PATTERN_ELEMENT__LET_EXP:
				return letExp != null;
			case ATLnoOCLPackage.PATTERN_ELEMENT__BASE_EXP:
				return baseExp != null;
			case ATLnoOCLPackage.PATTERN_ELEMENT__VARIABLE_EXP:
				return variableExp != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", varName: ");
		result.append(varName);
		result.append(')');
		return result.toString();
	}

} //PatternElementImpl
