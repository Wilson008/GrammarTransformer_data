/**
 */
package qvtoperational.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qvtoperational.ExpressionGO;
import qvtoperational.MappingBody;
import qvtoperational.PopulationSection;
import qvtoperational.QvtoperationalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.MappingBodyImpl#getEndSection <em>End Section</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingBodyImpl#getInitSection <em>Init Section</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingBodyImpl#getPopulation_section <em>Population section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingBodyImpl extends OperationBodyImpl implements MappingBody {
	/**
	 * The cached value of the '{@link #getEndSection() <em>End Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndSection()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionGO> endSection;

	/**
	 * The cached value of the '{@link #getInitSection() <em>Init Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitSection()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionGO> initSection;

	/**
	 * The cached value of the '{@link #getPopulation_section() <em>Population section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation_section()
	 * @generated
	 * @ordered
	 */
	protected PopulationSection population_section;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.MAPPING_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionGO> getEndSection() {
		if (endSection == null) {
			endSection = new EObjectContainmentEList<ExpressionGO>(ExpressionGO.class, this, QvtoperationalPackage.MAPPING_BODY__END_SECTION);
		}
		return endSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionGO> getInitSection() {
		if (initSection == null) {
			initSection = new EObjectContainmentEList<ExpressionGO>(ExpressionGO.class, this, QvtoperationalPackage.MAPPING_BODY__INIT_SECTION);
		}
		return initSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationSection getPopulation_section() {
		return population_section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPopulation_section(PopulationSection newPopulation_section, NotificationChain msgs) {
		PopulationSection oldPopulation_section = population_section;
		population_section = newPopulation_section;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_BODY__POPULATION_SECTION, oldPopulation_section, newPopulation_section);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation_section(PopulationSection newPopulation_section) {
		if (newPopulation_section != population_section) {
			NotificationChain msgs = null;
			if (population_section != null)
				msgs = ((InternalEObject)population_section).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MAPPING_BODY__POPULATION_SECTION, null, msgs);
			if (newPopulation_section != null)
				msgs = ((InternalEObject)newPopulation_section).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MAPPING_BODY__POPULATION_SECTION, null, msgs);
			msgs = basicSetPopulation_section(newPopulation_section, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_BODY__POPULATION_SECTION, newPopulation_section, newPopulation_section));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.MAPPING_BODY__END_SECTION:
				return ((InternalEList<?>)getEndSection()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MAPPING_BODY__INIT_SECTION:
				return ((InternalEList<?>)getInitSection()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MAPPING_BODY__POPULATION_SECTION:
				return basicSetPopulation_section(null, msgs);
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
			case QvtoperationalPackage.MAPPING_BODY__END_SECTION:
				return getEndSection();
			case QvtoperationalPackage.MAPPING_BODY__INIT_SECTION:
				return getInitSection();
			case QvtoperationalPackage.MAPPING_BODY__POPULATION_SECTION:
				return getPopulation_section();
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
			case QvtoperationalPackage.MAPPING_BODY__END_SECTION:
				getEndSection().clear();
				getEndSection().addAll((Collection<? extends ExpressionGO>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_BODY__INIT_SECTION:
				getInitSection().clear();
				getInitSection().addAll((Collection<? extends ExpressionGO>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_BODY__POPULATION_SECTION:
				setPopulation_section((PopulationSection)newValue);
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
			case QvtoperationalPackage.MAPPING_BODY__END_SECTION:
				getEndSection().clear();
				return;
			case QvtoperationalPackage.MAPPING_BODY__INIT_SECTION:
				getInitSection().clear();
				return;
			case QvtoperationalPackage.MAPPING_BODY__POPULATION_SECTION:
				setPopulation_section((PopulationSection)null);
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
			case QvtoperationalPackage.MAPPING_BODY__END_SECTION:
				return endSection != null && !endSection.isEmpty();
			case QvtoperationalPackage.MAPPING_BODY__INIT_SECTION:
				return initSection != null && !initSection.isEmpty();
			case QvtoperationalPackage.MAPPING_BODY__POPULATION_SECTION:
				return population_section != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingBodyImpl
