/**
 */
package qvtoperational.provider;


import EMOF.EMOFFactory;
import EMOF.EMOFPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qvtoperational.MappingOperation;
import qvtoperational.QvtoperationalFactory;
import qvtoperational.QvtoperationalPackage;

/**
 * This is the item provider adapter for a {@link qvtoperational.MappingOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingOperationItemProvider extends ImperativeOperationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingOperationItemProvider(AdapterFactory adapterFactory) {
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

			addUriPropertyDescriptor(object);
			addConfigPropertyPropertyDescriptor(object);
			addEntryPropertyDescriptor(object);
			addUsedModelTypePropertyDescriptor(object);
			addDisjunctPropertyDescriptor(object);
			addInheritedPropertyDescriptor(object);
			addMergedPropertyDescriptor(object);
			addRefinedRelationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_uri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_uri_feature", "_UI_Package_type"),
				 EMOFPackage.Literals.PACKAGE__URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Config Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfigPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Module_configProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Module_configProperty_feature", "_UI_Module_type"),
				 QvtoperationalPackage.Literals.MODULE__CONFIG_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entry feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Module_entry_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Module_entry_feature", "_UI_Module_type"),
				 QvtoperationalPackage.Literals.MODULE__ENTRY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Used Model Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedModelTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Module_usedModelType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Module_usedModelType_feature", "_UI_Module_type"),
				 QvtoperationalPackage.Literals.MODULE__USED_MODEL_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disjunct feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisjunctPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingOperation_disjunct_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingOperation_disjunct_feature", "_UI_MappingOperation_type"),
				 QvtoperationalPackage.Literals.MAPPING_OPERATION__DISJUNCT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherited feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingOperation_inherited_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingOperation_inherited_feature", "_UI_MappingOperation_type"),
				 QvtoperationalPackage.Literals.MAPPING_OPERATION__INHERITED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Merged feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMergedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingOperation_merged_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingOperation_merged_feature", "_UI_MappingOperation_type"),
				 QvtoperationalPackage.Literals.MAPPING_OPERATION__MERGED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refined Relation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinedRelationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingOperation_refinedRelation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingOperation_refinedRelation_feature", "_UI_MappingOperation_type"),
				 QvtoperationalPackage.Literals.MAPPING_OPERATION__REFINED_RELATION,
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
			childrenFeatures.add(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE);
			childrenFeatures.add(EMOFPackage.Literals.PACKAGE__OWNED_TYPE);
			childrenFeatures.add(QvtoperationalPackage.Literals.MODULE__MODULE_IMPORT);
			childrenFeatures.add(QvtoperationalPackage.Literals.MODULE__OWNED_TAG);
			childrenFeatures.add(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE);
			childrenFeatures.add(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHEN);
			childrenFeatures.add(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHERE);
			childrenFeatures.add(QvtoperationalPackage.Literals.MAPPING_OPERATION__MAPPING_FULL_HEADER);
			childrenFeatures.add(QvtoperationalPackage.Literals.MAPPING_OPERATION__MAPPING_BODY);
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
	 * This returns MappingOperation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MappingOperation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MappingOperation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MappingOperation_type") :
			getString("_UI_MappingOperation_type") + " " + label;
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

		switch (notification.getFeatureID(MappingOperation.class)) {
			case QvtoperationalPackage.MAPPING_OPERATION__URI:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__NESTED_PACKAGE:
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_TYPE:
			case QvtoperationalPackage.MAPPING_OPERATION__MODULE_IMPORT:
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_TAG:
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_VARIABLE:
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
			case QvtoperationalPackage.MAPPING_OPERATION__MAPPING_FULL_HEADER:
			case QvtoperationalPackage.MAPPING_OPERATION__MAPPING_BODY:
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
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createContextualProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createEntryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createHelper()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createMappingOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createModelType()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createOperationalTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createTagGO()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createMetaModelGO()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createAccessDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createTypeDef()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createClassifierGO()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 EMOFFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__OWNED_TYPE,
				 EMOFFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__OWNED_TYPE,
				 EMOFFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__OWNED_TYPE,
				 EMOFFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__OWNED_TYPE,
				 EMOFFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__MODULE_IMPORT,
				 QvtoperationalFactory.eINSTANCE.createModuleImport()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__OWNED_TAG,
				 EMOFFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QvtoperationalFactory.eINSTANCE.createExpressionGO()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QvtoperationalFactory.eINSTANCE.createImperativeCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QvtoperationalFactory.eINSTANCE.createMappingCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QvtoperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QvtoperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QvtoperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QvtoperationalFactory.eINSTANCE.createObjectExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QvtoperationalFactory.eINSTANCE.createResolveExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QvtoperationalFactory.eINSTANCE.createResolveInExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QvtoperationalFactory.eINSTANCE.createExpressionGO()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QvtoperationalFactory.eINSTANCE.createImperativeCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QvtoperationalFactory.eINSTANCE.createMappingCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QvtoperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QvtoperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QvtoperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QvtoperationalFactory.eINSTANCE.createObjectExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QvtoperationalFactory.eINSTANCE.createResolveExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QvtoperationalFactory.eINSTANCE.createResolveInExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QvtoperationalFactory.eINSTANCE.createExpressionGO()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QvtoperationalFactory.eINSTANCE.createImperativeCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QvtoperationalFactory.eINSTANCE.createMappingCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QvtoperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QvtoperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QvtoperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QvtoperationalFactory.eINSTANCE.createObjectExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QvtoperationalFactory.eINSTANCE.createResolveExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QvtoperationalFactory.eINSTANCE.createResolveInExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__MAPPING_FULL_HEADER,
				 QvtoperationalFactory.eINSTANCE.createMappingFullHeader()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MAPPING_OPERATION__MAPPING_BODY,
				 QvtoperationalFactory.eINSTANCE.createMappingBody()));
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
			childFeature == EMOFPackage.Literals.OPERATION__OWNED_PARAMETER ||
			childFeature == QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__CONTEXT ||
			childFeature == QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__RESULT ||
			childFeature == QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE ||
			childFeature == QvtoperationalPackage.Literals.MAPPING_OPERATION__WHEN ||
			childFeature == QvtoperationalPackage.Literals.MAPPING_OPERATION__WHERE ||
			childFeature == QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__BODY ||
			childFeature == QvtoperationalPackage.Literals.MAPPING_OPERATION__MAPPING_BODY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
