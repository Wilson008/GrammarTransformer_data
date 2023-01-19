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
import spectra.TemporalUnaryExpr;

/**
 * This is the item provider adapter for a {@link spectra.TemporalUnaryExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalUnaryExprItemProvider extends TemporalExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalUnaryExprItemProvider(AdapterFactory adapterFactory) {
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

			addKindsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Kinds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKindsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemporalUnaryExpr_kinds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemporalUnaryExpr_kinds_feature", "_UI_TemporalUnaryExpr_type"),
				 SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__KINDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE);
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
	 * This returns TemporalUnaryExpr.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TemporalUnaryExpr"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TemporalUnaryExpr)object).getKinds();
		return label == null || label.length() == 0 ?
			getString("_UI_TemporalUnaryExpr_type") :
			getString("_UI_TemporalUnaryExpr_type") + " " + label;
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

		switch (notification.getFeatureID(TemporalUnaryExpr.class)) {
			case SpectraPackage.TEMPORAL_UNARY_EXPR__KINDS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpectraPackage.TEMPORAL_UNARY_EXPR__TUE:
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
				(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE,
				 SpectraFactory.eINSTANCE.createTemporalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE,
				 SpectraFactory.eINSTANCE.createTemporalInExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE,
				 SpectraFactory.eINSTANCE.createTemporalImpExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE,
				 SpectraFactory.eINSTANCE.createTemporalIffExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE,
				 SpectraFactory.eINSTANCE.createTemporalOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE,
				 SpectraFactory.eINSTANCE.createTemporalAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE,
				 SpectraFactory.eINSTANCE.createTemporalRelationalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE,
				 SpectraFactory.eINSTANCE.createTemporalRemainderExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE,
				 SpectraFactory.eINSTANCE.createTemporalAdditiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE,
				 SpectraFactory.eINSTANCE.createTemporalMultiplicativeExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE,
				 SpectraFactory.eINSTANCE.createTemporalBinaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE,
				 SpectraFactory.eINSTANCE.createTemporalUnaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE,
				 SpectraFactory.eINSTANCE.createTemporalPrimaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE,
				 SpectraFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_UNARY_EXPR__TUE,
				 SpectraFactory.eINSTANCE.createQuantifierExpr()));
	}

}
