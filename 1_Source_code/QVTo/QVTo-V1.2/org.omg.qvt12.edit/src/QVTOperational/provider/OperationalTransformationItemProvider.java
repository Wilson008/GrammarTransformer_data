/**
 */
package QVTOperational.provider;


import EMOF.EMOFPackage;

import QVTOperational.OperationalTransformation;
import QVTOperational.QVTOperationalFactory;
import QVTOperational.QVTOperationalPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link QVTOperational.OperationalTransformation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationalTransformationItemProvider extends ModuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalTransformationItemProvider(AdapterFactory adapterFactory) {
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

			addIntermediateClassPropertyDescriptor(object);
			addIntermediatePropertyPropertyDescriptor(object);
			addRefinedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Intermediate Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntermediateClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OperationalTransformation_intermediateClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OperationalTransformation_intermediateClass_feature", "_UI_OperationalTransformation_type"),
				 QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__INTERMEDIATE_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Intermediate Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntermediatePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OperationalTransformation_intermediateProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OperationalTransformation_intermediateProperty_feature", "_UI_OperationalTransformation_type"),
				 QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__INTERMEDIATE_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refined feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OperationalTransformation_refined_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OperationalTransformation_refined_feature", "_UI_OperationalTransformation_type"),
				 QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__REFINED,
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
			childrenFeatures.add(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER);
			childrenFeatures.add(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__RELATION);
			childrenFeatures.add(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__TRANSFORMATION_H);
			childrenFeatures.add(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT);
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
	 * This returns OperationalTransformation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OperationalTransformation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OperationalTransformation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OperationalTransformation_type") :
			getString("_UI_OperationalTransformation_type") + " " + label;
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

		switch (notification.getFeatureID(OperationalTransformation.class)) {
			case QVTOperationalPackage.OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER:
			case QVTOperationalPackage.OPERATIONAL_TRANSFORMATION__RELATION:
			case QVTOperationalPackage.OPERATIONAL_TRANSFORMATION__TRANSFORMATION_H:
			case QVTOperationalPackage.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT:
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
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER,
				 QVTOperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__RELATION,
				 QVTOperationalFactory.eINSTANCE.createExpressionGO()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__RELATION,
				 QVTOperationalFactory.eINSTANCE.createImperativeCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__RELATION,
				 QVTOperationalFactory.eINSTANCE.createMappingCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__RELATION,
				 QVTOperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__RELATION,
				 QVTOperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__RELATION,
				 QVTOperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__RELATION,
				 QVTOperationalFactory.eINSTANCE.createObjectExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__RELATION,
				 QVTOperationalFactory.eINSTANCE.createResolveExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__RELATION,
				 QVTOperationalFactory.eINSTANCE.createResolveInExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__TRANSFORMATION_H,
				 QVTOperationalFactory.eINSTANCE.createTransformationHeader()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createImperativeOperation()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createContextualProperty()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createEntryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createHelper()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createMappingOperation()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createTagGO()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createAccessDecl()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createTypeDef()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createClassifierGO()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE ||
			childFeature == QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT ||
			childFeature == QVTOperationalPackage.Literals.MODULE__OWNED_VARIABLE ||
			childFeature == QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__RELATION ||
			childFeature == QVTOperationalPackage.Literals.OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
