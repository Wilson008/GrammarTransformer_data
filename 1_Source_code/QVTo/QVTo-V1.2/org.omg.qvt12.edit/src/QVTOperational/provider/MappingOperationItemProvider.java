/**
 */
package QVTOperational.provider;


import EMOF.EMOFFactory;
import EMOF.EMOFPackage;
import QVTOperational.MappingOperation;
import QVTOperational.QVTOperationalFactory;
import QVTOperational.QVTOperationalPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link QVTOperational.MappingOperation} object.
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
				 QVTOperationalPackage.Literals.MODULE__CONFIG_PROPERTY,
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
				 QVTOperationalPackage.Literals.MODULE__ENTRY,
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
				 QVTOperationalPackage.Literals.MODULE__USED_MODEL_TYPE,
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
				 QVTOperationalPackage.Literals.MAPPING_OPERATION__DISJUNCT,
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
				 QVTOperationalPackage.Literals.MAPPING_OPERATION__INHERITED,
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
				 QVTOperationalPackage.Literals.MAPPING_OPERATION__MERGED,
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
				 QVTOperationalPackage.Literals.MAPPING_OPERATION__REFINED_RELATION,
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
			childrenFeatures.add(QVTOperationalPackage.Literals.MODULE__MODULE_IMPORT);
			childrenFeatures.add(QVTOperationalPackage.Literals.MODULE__OWNED_TAG);
			childrenFeatures.add(QVTOperationalPackage.Literals.MODULE__OWNED_VARIABLE);
			childrenFeatures.add(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHEN);
			childrenFeatures.add(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHERE);
			childrenFeatures.add(QVTOperationalPackage.Literals.MAPPING_OPERATION__MAPPING_FULL_HEADER);
			childrenFeatures.add(QVTOperationalPackage.Literals.MAPPING_OPERATION__MAPPING_BODY);
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
			case QVTOperationalPackage.MAPPING_OPERATION__URI:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QVTOperationalPackage.MAPPING_OPERATION__NESTED_PACKAGE:
			case QVTOperationalPackage.MAPPING_OPERATION__OWNED_TYPE:
			case QVTOperationalPackage.MAPPING_OPERATION__MODULE_IMPORT:
			case QVTOperationalPackage.MAPPING_OPERATION__OWNED_TAG:
			case QVTOperationalPackage.MAPPING_OPERATION__OWNED_VARIABLE:
			case QVTOperationalPackage.MAPPING_OPERATION__WHEN:
			case QVTOperationalPackage.MAPPING_OPERATION__WHERE:
			case QVTOperationalPackage.MAPPING_OPERATION__MAPPING_FULL_HEADER:
			case QVTOperationalPackage.MAPPING_OPERATION__MAPPING_BODY:
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
				 QVTOperationalFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QVTOperationalFactory.eINSTANCE.createContextualProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QVTOperationalFactory.eINSTANCE.createEntryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QVTOperationalFactory.eINSTANCE.createHelper()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QVTOperationalFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QVTOperationalFactory.eINSTANCE.createLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QVTOperationalFactory.eINSTANCE.createMappingOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QVTOperationalFactory.eINSTANCE.createModelType()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QVTOperationalFactory.eINSTANCE.createOperationalTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QVTOperationalFactory.eINSTANCE.createTagGO()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QVTOperationalFactory.eINSTANCE.createMetaModelGO()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QVTOperationalFactory.eINSTANCE.createAccessDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QVTOperationalFactory.eINSTANCE.createTypeDef()));

		newChildDescriptors.add
			(createChildParameter
				(EMOFPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QVTOperationalFactory.eINSTANCE.createClassifierGO()));

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
				(QVTOperationalPackage.Literals.MODULE__MODULE_IMPORT,
				 QVTOperationalFactory.eINSTANCE.createModuleImport()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODULE__OWNED_TAG,
				 EMOFFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createExpressionGO()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createImperativeCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createMappingCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createObjectExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createResolveExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createResolveInExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QVTOperationalFactory.eINSTANCE.createExpressionGO()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QVTOperationalFactory.eINSTANCE.createImperativeCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QVTOperationalFactory.eINSTANCE.createMappingCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QVTOperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QVTOperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QVTOperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QVTOperationalFactory.eINSTANCE.createObjectExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QVTOperationalFactory.eINSTANCE.createResolveExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHEN,
				 QVTOperationalFactory.eINSTANCE.createResolveInExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QVTOperationalFactory.eINSTANCE.createExpressionGO()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QVTOperationalFactory.eINSTANCE.createImperativeCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QVTOperationalFactory.eINSTANCE.createMappingCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QVTOperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QVTOperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QVTOperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QVTOperationalFactory.eINSTANCE.createObjectExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QVTOperationalFactory.eINSTANCE.createResolveExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__WHERE,
				 QVTOperationalFactory.eINSTANCE.createResolveInExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__MAPPING_FULL_HEADER,
				 QVTOperationalFactory.eINSTANCE.createMappingFullHeader()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MAPPING_OPERATION__MAPPING_BODY,
				 QVTOperationalFactory.eINSTANCE.createMappingBody()));
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
			childFeature == QVTOperationalPackage.Literals.IMPERATIVE_OPERATION__CONTEXT ||
			childFeature == QVTOperationalPackage.Literals.IMPERATIVE_OPERATION__RESULT ||
			childFeature == QVTOperationalPackage.Literals.MODULE__OWNED_VARIABLE ||
			childFeature == QVTOperationalPackage.Literals.MAPPING_OPERATION__WHEN ||
			childFeature == QVTOperationalPackage.Literals.MAPPING_OPERATION__WHERE ||
			childFeature == QVTOperationalPackage.Literals.IMPERATIVE_OPERATION__BODY ||
			childFeature == QVTOperationalPackage.Literals.MAPPING_OPERATION__MAPPING_BODY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
