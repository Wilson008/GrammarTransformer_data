/**
 */
package spectra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spectra.DomainVarDecl;
import spectra.QuantifierExpr;
import spectra.SpectraPackage;
import spectra.TemporalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantifier Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.QuantifierExprImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link spectra.impl.QuantifierExprImpl#getDomainVar <em>Domain Var</em>}</li>
 *   <li>{@link spectra.impl.QuantifierExprImpl#getTemporalExpr <em>Temporal Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantifierExprImpl extends TemporalExpressionImpl implements QuantifierExpr {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomainVar() <em>Domain Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainVar()
	 * @generated
	 * @ordered
	 */
	protected DomainVarDecl domainVar;

	/**
	 * The cached value of the '{@link #getTemporalExpr() <em>Temporal Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalExpr()
	 * @generated
	 * @ordered
	 */
	protected TemporalExpression temporalExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantifierExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.QUANTIFIER_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.QUANTIFIER_EXPR__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainVarDecl getDomainVar() {
		return domainVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainVar(DomainVarDecl newDomainVar, NotificationChain msgs) {
		DomainVarDecl oldDomainVar = domainVar;
		domainVar = newDomainVar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.QUANTIFIER_EXPR__DOMAIN_VAR, oldDomainVar, newDomainVar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainVar(DomainVarDecl newDomainVar) {
		if (newDomainVar != domainVar) {
			NotificationChain msgs = null;
			if (domainVar != null)
				msgs = ((InternalEObject)domainVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.QUANTIFIER_EXPR__DOMAIN_VAR, null, msgs);
			if (newDomainVar != null)
				msgs = ((InternalEObject)newDomainVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.QUANTIFIER_EXPR__DOMAIN_VAR, null, msgs);
			msgs = basicSetDomainVar(newDomainVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.QUANTIFIER_EXPR__DOMAIN_VAR, newDomainVar, newDomainVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalExpression getTemporalExpr() {
		return temporalExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalExpr(TemporalExpression newTemporalExpr, NotificationChain msgs) {
		TemporalExpression oldTemporalExpr = temporalExpr;
		temporalExpr = newTemporalExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.QUANTIFIER_EXPR__TEMPORAL_EXPR, oldTemporalExpr, newTemporalExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalExpr(TemporalExpression newTemporalExpr) {
		if (newTemporalExpr != temporalExpr) {
			NotificationChain msgs = null;
			if (temporalExpr != null)
				msgs = ((InternalEObject)temporalExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.QUANTIFIER_EXPR__TEMPORAL_EXPR, null, msgs);
			if (newTemporalExpr != null)
				msgs = ((InternalEObject)newTemporalExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.QUANTIFIER_EXPR__TEMPORAL_EXPR, null, msgs);
			msgs = basicSetTemporalExpr(newTemporalExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.QUANTIFIER_EXPR__TEMPORAL_EXPR, newTemporalExpr, newTemporalExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.QUANTIFIER_EXPR__DOMAIN_VAR:
				return basicSetDomainVar(null, msgs);
			case SpectraPackage.QUANTIFIER_EXPR__TEMPORAL_EXPR:
				return basicSetTemporalExpr(null, msgs);
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
			case SpectraPackage.QUANTIFIER_EXPR__OPERATOR:
				return getOperator();
			case SpectraPackage.QUANTIFIER_EXPR__DOMAIN_VAR:
				return getDomainVar();
			case SpectraPackage.QUANTIFIER_EXPR__TEMPORAL_EXPR:
				return getTemporalExpr();
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
			case SpectraPackage.QUANTIFIER_EXPR__OPERATOR:
				setOperator((String)newValue);
				return;
			case SpectraPackage.QUANTIFIER_EXPR__DOMAIN_VAR:
				setDomainVar((DomainVarDecl)newValue);
				return;
			case SpectraPackage.QUANTIFIER_EXPR__TEMPORAL_EXPR:
				setTemporalExpr((TemporalExpression)newValue);
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
			case SpectraPackage.QUANTIFIER_EXPR__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case SpectraPackage.QUANTIFIER_EXPR__DOMAIN_VAR:
				setDomainVar((DomainVarDecl)null);
				return;
			case SpectraPackage.QUANTIFIER_EXPR__TEMPORAL_EXPR:
				setTemporalExpr((TemporalExpression)null);
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
			case SpectraPackage.QUANTIFIER_EXPR__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case SpectraPackage.QUANTIFIER_EXPR__DOMAIN_VAR:
				return domainVar != null;
			case SpectraPackage.QUANTIFIER_EXPR__TEMPORAL_EXPR:
				return temporalExpr != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //QuantifierExprImpl
