/**
 */
package spectra.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import spectra.SpectraFactory;
import spectra.SpectraPackage;
import spectra.WeightDef;

/**
 * This is the item provider adapter for a {@link spectra.WeightDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WeightDefItemProvider extends DeclItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightDefItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addNegativePropertyDescriptor(object);
			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WeightDef_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WeightDef_name_feature", "_UI_WeightDef_type"),
				 SpectraPackage.Literals.WEIGHT_DEF__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Negative feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNegativePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WeightDef_negative_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WeightDef_negative_feature", "_UI_WeightDef_type"),
				 SpectraPackage.Literals.WEIGHT_DEF__NEGATIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WeightDef_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WeightDef_value_feature", "_UI_WeightDef_type"),
				 SpectraPackage.Literals.WEIGHT_DEF__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns WeightDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WeightDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WeightDef)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_WeightDef_type") :
			getString("_UI_WeightDef_type") + " " + label;
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

		switch (notification.getFeatureID(WeightDef.class)) {
			case SpectraPackage.WEIGHT_DEF__NAME:
			case SpectraPackage.WEIGHT_DEF__NEGATIVE:
			case SpectraPackage.WEIGHT_DEF__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpectraPackage.WEIGHT_DEF__DEFINITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION,
				 SpectraFactory.eINSTANCE.createTemporalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION,
				 SpectraFactory.eINSTANCE.createTemporalInExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION,
				 SpectraFactory.eINSTANCE.createTemporalImpExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION,
				 SpectraFactory.eINSTANCE.createTemporalIffExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION,
				 SpectraFactory.eINSTANCE.createTemporalOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION,
				 SpectraFactory.eINSTANCE.createTemporalAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION,
				 SpectraFactory.eINSTANCE.createTemporalRelationalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION,
				 SpectraFactory.eINSTANCE.createTemporalRemainderExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION,
				 SpectraFactory.eINSTANCE.createTemporalAdditiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION,
				 SpectraFactory.eINSTANCE.createTemporalMultiplicativeExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION,
				 SpectraFactory.eINSTANCE.createTemporalBinaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION,
				 SpectraFactory.eINSTANCE.createTemporalUnaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION,
				 SpectraFactory.eINSTANCE.createTemporalPrimaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION,
				 SpectraFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.WEIGHT_DEF__DEFINITION,
				 SpectraFactory.eINSTANCE.createQuantifierExpr()));
	}

}
