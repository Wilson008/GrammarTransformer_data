/**
 */
package qvtoperational.impl;

import EMOF.impl.ParameterImpl;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import qvtoperational.Declarator;
import qvtoperational.DirectionKind;
import qvtoperational.ExpressionGO;
import qvtoperational.ImperativeOperation;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.VarParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.VarParameterImpl#getDummyContent <em>Dummy Content</em>}</li>
 *   <li>{@link qvtoperational.impl.VarParameterImpl#getCtxOwner <em>Ctx Owner</em>}</li>
 *   <li>{@link qvtoperational.impl.VarParameterImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link qvtoperational.impl.VarParameterImpl#getResOwner <em>Res Owner</em>}</li>
 *   <li>{@link qvtoperational.impl.VarParameterImpl#getDeclarator <em>Declarator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarParameterImpl extends ParameterImpl implements VarParameter {
	/**
	 * The cached value of the '{@link #getDummyContent() <em>Dummy Content</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDummyContent()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dummyContent;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionKind KIND_EDEFAULT = DirectionKind.IN;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DirectionKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclarator() <em>Declarator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarator()
	 * @generated
	 * @ordered
	 */
	protected Declarator declarator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.VAR_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDummyContent() {
		if (dummyContent == null) {
			dummyContent = new EDataTypeUniqueEList<String>(String.class, this, QvtoperationalPackage.VAR_PARAMETER__DUMMY_CONTENT);
		}
		return dummyContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOperation getCtxOwner() {
		if (eContainerFeatureID() != QvtoperationalPackage.VAR_PARAMETER__CTX_OWNER) return null;
		return (ImperativeOperation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCtxOwner(ImperativeOperation newCtxOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCtxOwner, QvtoperationalPackage.VAR_PARAMETER__CTX_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtxOwner(ImperativeOperation newCtxOwner) {
		if (newCtxOwner != eInternalContainer() || (eContainerFeatureID() != QvtoperationalPackage.VAR_PARAMETER__CTX_OWNER && newCtxOwner != null)) {
			if (EcoreUtil.isAncestor(this, newCtxOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCtxOwner != null)
				msgs = ((InternalEObject)newCtxOwner).eInverseAdd(this, QvtoperationalPackage.IMPERATIVE_OPERATION__CONTEXT, ImperativeOperation.class, msgs);
			msgs = basicSetCtxOwner(newCtxOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.VAR_PARAMETER__CTX_OWNER, newCtxOwner, newCtxOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(DirectionKind newKind) {
		DirectionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.VAR_PARAMETER__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOperation getResOwner() {
		if (eContainerFeatureID() != QvtoperationalPackage.VAR_PARAMETER__RES_OWNER) return null;
		return (ImperativeOperation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResOwner(ImperativeOperation newResOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResOwner, QvtoperationalPackage.VAR_PARAMETER__RES_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResOwner(ImperativeOperation newResOwner) {
		if (newResOwner != eInternalContainer() || (eContainerFeatureID() != QvtoperationalPackage.VAR_PARAMETER__RES_OWNER && newResOwner != null)) {
			if (EcoreUtil.isAncestor(this, newResOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResOwner != null)
				msgs = ((InternalEObject)newResOwner).eInverseAdd(this, QvtoperationalPackage.IMPERATIVE_OPERATION__RESULT, ImperativeOperation.class, msgs);
			msgs = basicSetResOwner(newResOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.VAR_PARAMETER__RES_OWNER, newResOwner, newResOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declarator getDeclarator() {
		return declarator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclarator(Declarator newDeclarator, NotificationChain msgs) {
		Declarator oldDeclarator = declarator;
		declarator = newDeclarator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.VAR_PARAMETER__DECLARATOR, oldDeclarator, newDeclarator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclarator(Declarator newDeclarator) {
		if (newDeclarator != declarator) {
			NotificationChain msgs = null;
			if (declarator != null)
				msgs = ((InternalEObject)declarator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.VAR_PARAMETER__DECLARATOR, null, msgs);
			if (newDeclarator != null)
				msgs = ((InternalEObject)newDeclarator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.VAR_PARAMETER__DECLARATOR, null, msgs);
			msgs = basicSetDeclarator(newDeclarator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.VAR_PARAMETER__DECLARATOR, newDeclarator, newDeclarator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.VAR_PARAMETER__CTX_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCtxOwner((ImperativeOperation)otherEnd, msgs);
			case QvtoperationalPackage.VAR_PARAMETER__RES_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResOwner((ImperativeOperation)otherEnd, msgs);
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
			case QvtoperationalPackage.VAR_PARAMETER__CTX_OWNER:
				return basicSetCtxOwner(null, msgs);
			case QvtoperationalPackage.VAR_PARAMETER__RES_OWNER:
				return basicSetResOwner(null, msgs);
			case QvtoperationalPackage.VAR_PARAMETER__DECLARATOR:
				return basicSetDeclarator(null, msgs);
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
			case QvtoperationalPackage.VAR_PARAMETER__CTX_OWNER:
				return eInternalContainer().eInverseRemove(this, QvtoperationalPackage.IMPERATIVE_OPERATION__CONTEXT, ImperativeOperation.class, msgs);
			case QvtoperationalPackage.VAR_PARAMETER__RES_OWNER:
				return eInternalContainer().eInverseRemove(this, QvtoperationalPackage.IMPERATIVE_OPERATION__RESULT, ImperativeOperation.class, msgs);
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
			case QvtoperationalPackage.VAR_PARAMETER__DUMMY_CONTENT:
				return getDummyContent();
			case QvtoperationalPackage.VAR_PARAMETER__CTX_OWNER:
				return getCtxOwner();
			case QvtoperationalPackage.VAR_PARAMETER__KIND:
				return getKind();
			case QvtoperationalPackage.VAR_PARAMETER__RES_OWNER:
				return getResOwner();
			case QvtoperationalPackage.VAR_PARAMETER__DECLARATOR:
				return getDeclarator();
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
			case QvtoperationalPackage.VAR_PARAMETER__DUMMY_CONTENT:
				getDummyContent().clear();
				getDummyContent().addAll((Collection<? extends String>)newValue);
				return;
			case QvtoperationalPackage.VAR_PARAMETER__CTX_OWNER:
				setCtxOwner((ImperativeOperation)newValue);
				return;
			case QvtoperationalPackage.VAR_PARAMETER__KIND:
				setKind((DirectionKind)newValue);
				return;
			case QvtoperationalPackage.VAR_PARAMETER__RES_OWNER:
				setResOwner((ImperativeOperation)newValue);
				return;
			case QvtoperationalPackage.VAR_PARAMETER__DECLARATOR:
				setDeclarator((Declarator)newValue);
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
			case QvtoperationalPackage.VAR_PARAMETER__DUMMY_CONTENT:
				getDummyContent().clear();
				return;
			case QvtoperationalPackage.VAR_PARAMETER__CTX_OWNER:
				setCtxOwner((ImperativeOperation)null);
				return;
			case QvtoperationalPackage.VAR_PARAMETER__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case QvtoperationalPackage.VAR_PARAMETER__RES_OWNER:
				setResOwner((ImperativeOperation)null);
				return;
			case QvtoperationalPackage.VAR_PARAMETER__DECLARATOR:
				setDeclarator((Declarator)null);
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
			case QvtoperationalPackage.VAR_PARAMETER__DUMMY_CONTENT:
				return dummyContent != null && !dummyContent.isEmpty();
			case QvtoperationalPackage.VAR_PARAMETER__CTX_OWNER:
				return getCtxOwner() != null;
			case QvtoperationalPackage.VAR_PARAMETER__KIND:
				return kind != KIND_EDEFAULT;
			case QvtoperationalPackage.VAR_PARAMETER__RES_OWNER:
				return getResOwner() != null;
			case QvtoperationalPackage.VAR_PARAMETER__DECLARATOR:
				return declarator != null;
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
		if (baseClass == ExpressionGO.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.VAR_PARAMETER__DUMMY_CONTENT: return QvtoperationalPackage.EXPRESSION_GO__DUMMY_CONTENT;
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
		if (baseClass == ExpressionGO.class) {
			switch (baseFeatureID) {
				case QvtoperationalPackage.EXPRESSION_GO__DUMMY_CONTENT: return QvtoperationalPackage.VAR_PARAMETER__DUMMY_CONTENT;
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
		result.append(" (dummyContent: ");
		result.append(dummyContent);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //VarParameterImpl
