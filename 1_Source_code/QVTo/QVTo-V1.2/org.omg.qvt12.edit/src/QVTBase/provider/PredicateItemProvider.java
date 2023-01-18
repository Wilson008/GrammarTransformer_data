/**
 */
package QVTBase.provider;


import EMOF.provider.ElementItemProvider;

import EssentialOCL.EssentialOCLFactory;

import ImperativeOCL.ImperativeOCLFactory;

import QVTBase.Predicate;
import QVTBase.QVTBasePackage;

import QVTOperational.QVTOperationalFactory;

import QVTOperational.provider.QVTOperationalEditPlugin;

import QVTRelation.QVTRelationFactory;

import QVTTemplate.QVTTemplateFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link QVTBase.Predicate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PredicateItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION);
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
	 * This returns Predicate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Predicate"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Predicate_type");
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

		switch (notification.getFeatureID(Predicate.class)) {
			case QVTBasePackage.PREDICATE__CONDITION_EXPRESSION:
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
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 QVTOperationalFactory.eINSTANCE.createImperativeCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 QVTOperationalFactory.eINSTANCE.createMappingCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 QVTOperationalFactory.eINSTANCE.createObjectExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 QVTOperationalFactory.eINSTANCE.createResolveExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 QVTOperationalFactory.eINSTANCE.createResolveInExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createBooleanLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createCollectionLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createEnumLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createIfExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createIntegerLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createInvalidLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createIterateExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createIteratorExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createLetExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createNavigationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createNullLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createOperationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createPropertyCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createRealLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createStringLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createTupleLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createTypeExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createUnlimitedNaturalExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createVariableExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createAltExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createAssertExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createAssignExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createBlockExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createBreakExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createCatchExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createComputeExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createContinueExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createDictLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createForExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createImperativeIterateExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createInstantiationExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createListLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createLogExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createRaiseExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createReturnExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createSwitchExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createTryExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createUnlinkExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createVariableInitExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createWhileExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 QVTRelationFactory.eINSTANCE.createOppositePropertyCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 QVTRelationFactory.eINSTANCE.createRelationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 QVTTemplateFactory.eINSTANCE.createCollectionTemplateExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTBasePackage.Literals.PREDICATE__CONDITION_EXPRESSION,
				 QVTTemplateFactory.eINSTANCE.createObjectTemplateExp()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QVTOperationalEditPlugin.INSTANCE;
	}

}