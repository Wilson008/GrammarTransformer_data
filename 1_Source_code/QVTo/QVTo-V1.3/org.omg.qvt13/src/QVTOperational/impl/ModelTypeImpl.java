/**
 */
package QVTOperational.impl;

import QVTOperational.ExpressionBlock;
import QVTOperational.ExpressionGO;
import QVTOperational.ModelType;
import QVTOperational.PackageRefGO;
import QVTOperational.QVTOperationalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.ModelTypeImpl#getAdditionalCondition <em>Additional Condition</em>}</li>
 *   <li>{@link QVTOperational.impl.ModelTypeImpl#getConformanceKind <em>Conformance Kind</em>}</li>
 *   <li>{@link QVTOperational.impl.ModelTypeImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link QVTOperational.impl.ModelTypeImpl#getCompliance_kind <em>Compliance kind</em>}</li>
 *   <li>{@link QVTOperational.impl.ModelTypeImpl#getPackageref_list <em>Packageref list</em>}</li>
 *   <li>{@link QVTOperational.impl.ModelTypeImpl#getModeltype_where <em>Modeltype where</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelTypeImpl extends ModuleImpl implements ModelType {
	/**
	 * The cached value of the '{@link #getAdditionalCondition() <em>Additional Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionGO> additionalCondition;

	/**
	 * The default value of the '{@link #getConformanceKind() <em>Conformance Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformanceKind()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFORMANCE_KIND_EDEFAULT = "effective";

	/**
	 * The cached value of the '{@link #getConformanceKind() <em>Conformance Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformanceKind()
	 * @generated
	 * @ordered
	 */
	protected String conformanceKind = CONFORMANCE_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected EList<EMOF.Package> metamodel;

	/**
	 * The default value of the '{@link #getCompliance_kind() <em>Compliance kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliance_kind()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLIANCE_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompliance_kind() <em>Compliance kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliance_kind()
	 * @generated
	 * @ordered
	 */
	protected String compliance_kind = COMPLIANCE_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackageref_list() <em>Packageref list</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageref_list()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRefGO> packageref_list;

	/**
	 * The cached value of the '{@link #getModeltype_where() <em>Modeltype where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeltype_where()
	 * @generated
	 * @ordered
	 */
	protected ExpressionBlock modeltype_where;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.MODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionGO> getAdditionalCondition() {
		if (additionalCondition == null) {
			additionalCondition = new EObjectContainmentEList<ExpressionGO>(ExpressionGO.class, this, QVTOperationalPackage.MODEL_TYPE__ADDITIONAL_CONDITION);
		}
		return additionalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConformanceKind() {
		return conformanceKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformanceKind(String newConformanceKind) {
		String oldConformanceKind = conformanceKind;
		conformanceKind = newConformanceKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODEL_TYPE__CONFORMANCE_KIND, oldConformanceKind, conformanceKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMOF.Package> getMetamodel() {
		if (metamodel == null) {
			metamodel = new EObjectResolvingEList<EMOF.Package>(EMOF.Package.class, this, QVTOperationalPackage.MODEL_TYPE__METAMODEL);
		}
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompliance_kind() {
		return compliance_kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompliance_kind(String newCompliance_kind) {
		String oldCompliance_kind = compliance_kind;
		compliance_kind = newCompliance_kind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODEL_TYPE__COMPLIANCE_KIND, oldCompliance_kind, compliance_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRefGO> getPackageref_list() {
		if (packageref_list == null) {
			packageref_list = new EObjectContainmentEList<PackageRefGO>(PackageRefGO.class, this, QVTOperationalPackage.MODEL_TYPE__PACKAGEREF_LIST);
		}
		return packageref_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionBlock getModeltype_where() {
		return modeltype_where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModeltype_where(ExpressionBlock newModeltype_where, NotificationChain msgs) {
		ExpressionBlock oldModeltype_where = modeltype_where;
		modeltype_where = newModeltype_where;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODEL_TYPE__MODELTYPE_WHERE, oldModeltype_where, newModeltype_where);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeltype_where(ExpressionBlock newModeltype_where) {
		if (newModeltype_where != modeltype_where) {
			NotificationChain msgs = null;
			if (modeltype_where != null)
				msgs = ((InternalEObject)modeltype_where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MODEL_TYPE__MODELTYPE_WHERE, null, msgs);
			if (newModeltype_where != null)
				msgs = ((InternalEObject)newModeltype_where).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MODEL_TYPE__MODELTYPE_WHERE, null, msgs);
			msgs = basicSetModeltype_where(newModeltype_where, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODEL_TYPE__MODELTYPE_WHERE, newModeltype_where, newModeltype_where));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.MODEL_TYPE__ADDITIONAL_CONDITION:
				return ((InternalEList<?>)getAdditionalCondition()).basicRemove(otherEnd, msgs);
			case QVTOperationalPackage.MODEL_TYPE__PACKAGEREF_LIST:
				return ((InternalEList<?>)getPackageref_list()).basicRemove(otherEnd, msgs);
			case QVTOperationalPackage.MODEL_TYPE__MODELTYPE_WHERE:
				return basicSetModeltype_where(null, msgs);
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
			case QVTOperationalPackage.MODEL_TYPE__ADDITIONAL_CONDITION:
				return getAdditionalCondition();
			case QVTOperationalPackage.MODEL_TYPE__CONFORMANCE_KIND:
				return getConformanceKind();
			case QVTOperationalPackage.MODEL_TYPE__METAMODEL:
				return getMetamodel();
			case QVTOperationalPackage.MODEL_TYPE__COMPLIANCE_KIND:
				return getCompliance_kind();
			case QVTOperationalPackage.MODEL_TYPE__PACKAGEREF_LIST:
				return getPackageref_list();
			case QVTOperationalPackage.MODEL_TYPE__MODELTYPE_WHERE:
				return getModeltype_where();
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
			case QVTOperationalPackage.MODEL_TYPE__ADDITIONAL_CONDITION:
				getAdditionalCondition().clear();
				getAdditionalCondition().addAll((Collection<? extends ExpressionGO>)newValue);
				return;
			case QVTOperationalPackage.MODEL_TYPE__CONFORMANCE_KIND:
				setConformanceKind((String)newValue);
				return;
			case QVTOperationalPackage.MODEL_TYPE__METAMODEL:
				getMetamodel().clear();
				getMetamodel().addAll((Collection<? extends EMOF.Package>)newValue);
				return;
			case QVTOperationalPackage.MODEL_TYPE__COMPLIANCE_KIND:
				setCompliance_kind((String)newValue);
				return;
			case QVTOperationalPackage.MODEL_TYPE__PACKAGEREF_LIST:
				getPackageref_list().clear();
				getPackageref_list().addAll((Collection<? extends PackageRefGO>)newValue);
				return;
			case QVTOperationalPackage.MODEL_TYPE__MODELTYPE_WHERE:
				setModeltype_where((ExpressionBlock)newValue);
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
			case QVTOperationalPackage.MODEL_TYPE__ADDITIONAL_CONDITION:
				getAdditionalCondition().clear();
				return;
			case QVTOperationalPackage.MODEL_TYPE__CONFORMANCE_KIND:
				setConformanceKind(CONFORMANCE_KIND_EDEFAULT);
				return;
			case QVTOperationalPackage.MODEL_TYPE__METAMODEL:
				getMetamodel().clear();
				return;
			case QVTOperationalPackage.MODEL_TYPE__COMPLIANCE_KIND:
				setCompliance_kind(COMPLIANCE_KIND_EDEFAULT);
				return;
			case QVTOperationalPackage.MODEL_TYPE__PACKAGEREF_LIST:
				getPackageref_list().clear();
				return;
			case QVTOperationalPackage.MODEL_TYPE__MODELTYPE_WHERE:
				setModeltype_where((ExpressionBlock)null);
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
			case QVTOperationalPackage.MODEL_TYPE__ADDITIONAL_CONDITION:
				return additionalCondition != null && !additionalCondition.isEmpty();
			case QVTOperationalPackage.MODEL_TYPE__CONFORMANCE_KIND:
				return CONFORMANCE_KIND_EDEFAULT == null ? conformanceKind != null : !CONFORMANCE_KIND_EDEFAULT.equals(conformanceKind);
			case QVTOperationalPackage.MODEL_TYPE__METAMODEL:
				return metamodel != null && !metamodel.isEmpty();
			case QVTOperationalPackage.MODEL_TYPE__COMPLIANCE_KIND:
				return COMPLIANCE_KIND_EDEFAULT == null ? compliance_kind != null : !COMPLIANCE_KIND_EDEFAULT.equals(compliance_kind);
			case QVTOperationalPackage.MODEL_TYPE__PACKAGEREF_LIST:
				return packageref_list != null && !packageref_list.isEmpty();
			case QVTOperationalPackage.MODEL_TYPE__MODELTYPE_WHERE:
				return modeltype_where != null;
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
		result.append(" (conformanceKind: ");
		result.append(conformanceKind);
		result.append(", compliance_kind: ");
		result.append(compliance_kind);
		result.append(')');
		return result.toString();
	}

} //ModelTypeImpl
