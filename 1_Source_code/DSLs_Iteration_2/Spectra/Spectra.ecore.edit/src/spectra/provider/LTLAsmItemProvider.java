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

import spectra.LTLAsm;
import spectra.SpectraFactory;
import spectra.SpectraPackage;

/**
 * This is the item provider adapter for a {@link spectra.LTLAsm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LTLAsmItemProvider extends DeclItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTLAsmItemProvider(AdapterFactory adapterFactory) {
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
			addSafetyPropertyDescriptor(object);
			addStateInvPropertyDescriptor(object);
			addJusticePropertyDescriptor(object);
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
				 getString("_UI_LTLAsm_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LTLAsm_name_feature", "_UI_LTLAsm_type"),
				 SpectraPackage.Literals.LTL_ASM__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Safety feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSafetyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LTLAsm_safety_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LTLAsm_safety_feature", "_UI_LTLAsm_type"),
				 SpectraPackage.Literals.LTL_ASM__SAFETY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State Inv feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStateInvPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LTLAsm_stateInv_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LTLAsm_stateInv_feature", "_UI_LTLAsm_type"),
				 SpectraPackage.Literals.LTL_ASM__STATE_INV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Justice feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJusticePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LTLAsm_justice_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LTLAsm_justice_feature", "_UI_LTLAsm_type"),
				 SpectraPackage.Literals.LTL_ASM__JUSTICE,
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
			childrenFeatures.add(SpectraPackage.Literals.LTL_ASM__PARAMS);
			childrenFeatures.add(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR);
			childrenFeatures.add(SpectraPackage.Literals.LTL_ASM__TRIG);
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
	 * This returns LTLAsm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LTLAsm"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LTLAsm)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LTLAsm_type") :
			getString("_UI_LTLAsm_type") + " " + label;
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

		switch (notification.getFeatureID(LTLAsm.class)) {
			case SpectraPackage.LTL_ASM__NAME:
			case SpectraPackage.LTL_ASM__SAFETY:
			case SpectraPackage.LTL_ASM__STATE_INV:
			case SpectraPackage.LTL_ASM__JUSTICE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpectraPackage.LTL_ASM__PARAMS:
			case SpectraPackage.LTL_ASM__TEMPORAL_EXPR:
			case SpectraPackage.LTL_ASM__TRIG:
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
				(SpectraPackage.Literals.LTL_ASM__PARAMS,
				 SpectraFactory.eINSTANCE.createTypedParamList()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR,
				 SpectraFactory.eINSTANCE.createTemporalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR,
				 SpectraFactory.eINSTANCE.createTemporalInExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR,
				 SpectraFactory.eINSTANCE.createTemporalImpExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR,
				 SpectraFactory.eINSTANCE.createTemporalIffExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR,
				 SpectraFactory.eINSTANCE.createTemporalOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR,
				 SpectraFactory.eINSTANCE.createTemporalAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR,
				 SpectraFactory.eINSTANCE.createTemporalRelationalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR,
				 SpectraFactory.eINSTANCE.createTemporalRemainderExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR,
				 SpectraFactory.eINSTANCE.createTemporalAdditiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR,
				 SpectraFactory.eINSTANCE.createTemporalMultiplicativeExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR,
				 SpectraFactory.eINSTANCE.createTemporalBinaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR,
				 SpectraFactory.eINSTANCE.createTemporalUnaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR,
				 SpectraFactory.eINSTANCE.createTemporalPrimaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR,
				 SpectraFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TEMPORAL_EXPR,
				 SpectraFactory.eINSTANCE.createQuantifierExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.LTL_ASM__TRIG,
				 SpectraFactory.eINSTANCE.createTrigger()));
	}

}
