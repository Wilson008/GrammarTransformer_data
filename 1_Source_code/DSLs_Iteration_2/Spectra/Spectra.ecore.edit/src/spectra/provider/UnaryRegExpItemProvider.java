/**
 */
package spectra.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import spectra.SpectraPackage;
import spectra.UnaryRegExp;

/**
 * This is the item provider adapter for a {@link spectra.UnaryRegExp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryRegExpItemProvider extends RegExpItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryRegExpItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addKleenedPropertyDescriptor(object);
			addQuestionMarkPropertyDescriptor(object);
			addPlusPropertyDescriptor(object);
			addHaveExactRepetitionPropertyDescriptor(object);
			addExactRepetitionPropertyDescriptor(object);
			addHaveAtLeastPropertyDescriptor(object);
			addAtLeastPropertyDescriptor(object);
			addHaveRangePropertyDescriptor(object);
			addFromPropertyDescriptor(object);
			addFromDefinePropertyDescriptor(object);
			addToPropertyDescriptor(object);
			addToDefinePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Kleened feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKleenedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryRegExp_kleened_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryRegExp_kleened_feature", "_UI_UnaryRegExp_type"),
				 SpectraPackage.Literals.UNARY_REG_EXP__KLEENED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Question Mark feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuestionMarkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryRegExp_questionMark_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryRegExp_questionMark_feature", "_UI_UnaryRegExp_type"),
				 SpectraPackage.Literals.UNARY_REG_EXP__QUESTION_MARK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryRegExp_plus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryRegExp_plus_feature", "_UI_UnaryRegExp_type"),
				 SpectraPackage.Literals.UNARY_REG_EXP__PLUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Have Exact Repetition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHaveExactRepetitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryRegExp_haveExactRepetition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryRegExp_haveExactRepetition_feature", "_UI_UnaryRegExp_type"),
				 SpectraPackage.Literals.UNARY_REG_EXP__HAVE_EXACT_REPETITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exact Repetition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExactRepetitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryRegExp_exactRepetition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryRegExp_exactRepetition_feature", "_UI_UnaryRegExp_type"),
				 SpectraPackage.Literals.UNARY_REG_EXP__EXACT_REPETITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Have At Least feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHaveAtLeastPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryRegExp_haveAtLeast_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryRegExp_haveAtLeast_feature", "_UI_UnaryRegExp_type"),
				 SpectraPackage.Literals.UNARY_REG_EXP__HAVE_AT_LEAST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the At Least feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAtLeastPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryRegExp_atLeast_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryRegExp_atLeast_feature", "_UI_UnaryRegExp_type"),
				 SpectraPackage.Literals.UNARY_REG_EXP__AT_LEAST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Have Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHaveRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryRegExp_haveRange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryRegExp_haveRange_feature", "_UI_UnaryRegExp_type"),
				 SpectraPackage.Literals.UNARY_REG_EXP__HAVE_RANGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryRegExp_from_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryRegExp_from_feature", "_UI_UnaryRegExp_type"),
				 SpectraPackage.Literals.UNARY_REG_EXP__FROM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Define feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromDefinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryRegExp_fromDefine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryRegExp_fromDefine_feature", "_UI_UnaryRegExp_type"),
				 SpectraPackage.Literals.UNARY_REG_EXP__FROM_DEFINE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryRegExp_to_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryRegExp_to_feature", "_UI_UnaryRegExp_type"),
				 SpectraPackage.Literals.UNARY_REG_EXP__TO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Define feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToDefinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryRegExp_toDefine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryRegExp_toDefine_feature", "_UI_UnaryRegExp_type"),
				 SpectraPackage.Literals.UNARY_REG_EXP__TO_DEFINE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns UnaryRegExp.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnaryRegExp"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UnaryRegExp)object).getVal();
		return label == null || label.length() == 0 ?
			getString("_UI_UnaryRegExp_type") :
			getString("_UI_UnaryRegExp_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(UnaryRegExp.class)) {
			case SpectraPackage.UNARY_REG_EXP__KLEENED:
			case SpectraPackage.UNARY_REG_EXP__QUESTION_MARK:
			case SpectraPackage.UNARY_REG_EXP__PLUS:
			case SpectraPackage.UNARY_REG_EXP__HAVE_EXACT_REPETITION:
			case SpectraPackage.UNARY_REG_EXP__EXACT_REPETITION:
			case SpectraPackage.UNARY_REG_EXP__HAVE_AT_LEAST:
			case SpectraPackage.UNARY_REG_EXP__AT_LEAST:
			case SpectraPackage.UNARY_REG_EXP__HAVE_RANGE:
			case SpectraPackage.UNARY_REG_EXP__FROM:
			case SpectraPackage.UNARY_REG_EXP__TO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
