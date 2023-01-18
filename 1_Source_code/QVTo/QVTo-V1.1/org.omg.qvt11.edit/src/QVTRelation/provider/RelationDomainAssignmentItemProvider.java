/**
 */
package QVTRelation.provider;


import EMOF.provider.ElementItemProvider;

import EssentialOCL.EssentialOCLFactory;

import ImperativeOCL.ImperativeOCLFactory;

import QVTRelation.QVTRelationFactory;
import QVTRelation.QVTRelationPackage;
import QVTRelation.RelationDomainAssignment;

import QVTTemplate.QVTTemplateFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qvtoperational.QvtoperationalFactory;

import qvtoperational.provider.QVTOperationalEditPlugin;

/**
 * This is the item provider adapter for a {@link QVTRelation.RelationDomainAssignment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationDomainAssignmentItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDomainAssignmentItemProvider(AdapterFactory adapterFactory) {
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

			addVariablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RelationDomainAssignment_variable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationDomainAssignment_variable_feature", "_UI_RelationDomainAssignment_type"),
				 QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VARIABLE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP);
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
	 * This returns RelationDomainAssignment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RelationDomainAssignment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_RelationDomainAssignment_type");
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

		switch (notification.getFeatureID(RelationDomainAssignment.class)) {
			case QVTRelationPackage.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP:
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
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 QVTRelationFactory.eINSTANCE.createOppositePropertyCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 QVTRelationFactory.eINSTANCE.createRelationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 QvtoperationalFactory.eINSTANCE.createImperativeCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 QvtoperationalFactory.eINSTANCE.createMappingCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 QvtoperationalFactory.eINSTANCE.createObjectExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 QvtoperationalFactory.eINSTANCE.createResolveExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 QvtoperationalFactory.eINSTANCE.createResolveInExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createBooleanLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createCollectionLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createEnumLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createIfExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createIntegerLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createInvalidLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createIterateExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createIteratorExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createLetExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createNavigationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createNullLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createOperationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createPropertyCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createRealLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createStringLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createTupleLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createTypeExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createUnlimitedNaturalExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 EssentialOCLFactory.eINSTANCE.createVariableExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createAltExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createAssertExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createAssignExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createBlockExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createBreakExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createCatchExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createComputeExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createContinueExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createDictLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createForExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createImperativeIterateExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createInstantiationExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createListLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createLogExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createOrderedTupleLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createRaiseExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createReturnExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createSwitchExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createTryExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createUnlinkExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createUnpackExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createVariableInitExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 ImperativeOCLFactory.eINSTANCE.createWhileExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
				 QVTTemplateFactory.eINSTANCE.createCollectionTemplateExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTRelationPackage.Literals.RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP,
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
