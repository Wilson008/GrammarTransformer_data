/**
 */
package qvtoperational.provider;


import emof.EmofFactory;
import emof.EmofPackage;

import emof.provider.URIExtentItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qvtoperational.ModelType;
import qvtoperational.QvtoperationalFactory;
import qvtoperational.QvtoperationalPackage;

/**
 * This is the item provider adapter for a {@link qvtoperational.ModelType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelTypeItemProvider extends URIExtentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTypeItemProvider(AdapterFactory adapterFactory) {
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

			addTagPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addUriPropertyDescriptor(object);
			addEntryPropertyDescriptor(object);
			addConfigPropertyPropertyDescriptor(object);
			addUsedModelTypePropertyDescriptor(object);
			addIsBlackboxPropertyDescriptor(object);
			addSuperClassPropertyDescriptor(object);
			addIsAbstractPropertyDescriptor(object);
			addMetamodelPropertyDescriptor(object);
			addConformanceKindPropertyDescriptor(object);
			addCompliance_kindPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_tag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_tag_feature", "_UI_Element_type"),
				 EmofPackage.Literals.ELEMENT__TAG,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 EmofPackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 EmofPackage.Literals.PACKAGE__URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	 * This adds a property descriptor for the Is Blackbox feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsBlackboxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Module_isBlackbox_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Module_isBlackbox_feature", "_UI_Module_type"),
				 QvtoperationalPackage.Literals.MODULE__IS_BLACKBOX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Super Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_superClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_superClass_feature", "_UI_Class_type"),
				 EmofPackage.Literals.CLASS__SUPER_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_isAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_isAbstract_feature", "_UI_Class_type"),
				 EmofPackage.Literals.CLASS__IS_ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Metamodel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetamodelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelType_metamodel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelType_metamodel_feature", "_UI_ModelType_type"),
				 QvtoperationalPackage.Literals.MODEL_TYPE__METAMODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conformance Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConformanceKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelType_conformanceKind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelType_conformanceKind_feature", "_UI_ModelType_type"),
				 QvtoperationalPackage.Literals.MODEL_TYPE__CONFORMANCE_KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compliance kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompliance_kindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelType_compliance_kind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelType_compliance_kind_feature", "_UI_ModelType_type"),
				 QvtoperationalPackage.Literals.MODEL_TYPE__COMPLIANCE_KIND,
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
			childrenFeatures.add(EmofPackage.Literals.ELEMENT__OWNED_COMMENT);
			childrenFeatures.add(EmofPackage.Literals.PACKAGE__OWNED_TYPE);
			childrenFeatures.add(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE);
			childrenFeatures.add(QvtoperationalPackage.Literals.MODULE__OWNED_TAG);
			childrenFeatures.add(QvtoperationalPackage.Literals.MODULE__MODULE_IMPORT);
			childrenFeatures.add(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE);
			childrenFeatures.add(EmofPackage.Literals.CLASS__OWNED_ATTRIBUTE);
			childrenFeatures.add(EmofPackage.Literals.CLASS__OWNED_OPERATION);
			childrenFeatures.add(QvtoperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION);
			childrenFeatures.add(QvtoperationalPackage.Literals.MODEL_TYPE__PACKAGEREF_LIST);
			childrenFeatures.add(QvtoperationalPackage.Literals.MODEL_TYPE__MODELTYPE_WHERE);
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
	 * This returns ModelType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModelType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelType_type") :
			getString("_UI_ModelType_type") + " " + label;
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

		switch (notification.getFeatureID(ModelType.class)) {
			case QvtoperationalPackage.MODEL_TYPE__NAME:
			case QvtoperationalPackage.MODEL_TYPE__URI:
			case QvtoperationalPackage.MODEL_TYPE__IS_BLACKBOX:
			case QvtoperationalPackage.MODEL_TYPE__IS_ABSTRACT:
			case QvtoperationalPackage.MODEL_TYPE__CONFORMANCE_KIND:
			case QvtoperationalPackage.MODEL_TYPE__COMPLIANCE_KIND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QvtoperationalPackage.MODEL_TYPE__OWNED_COMMENT:
			case QvtoperationalPackage.MODEL_TYPE__OWNED_TYPE:
			case QvtoperationalPackage.MODEL_TYPE__NESTED_PACKAGE:
			case QvtoperationalPackage.MODEL_TYPE__OWNED_TAG:
			case QvtoperationalPackage.MODEL_TYPE__MODULE_IMPORT:
			case QvtoperationalPackage.MODEL_TYPE__OWNED_VARIABLE:
			case QvtoperationalPackage.MODEL_TYPE__OWNED_ATTRIBUTE:
			case QvtoperationalPackage.MODEL_TYPE__OWNED_OPERATION:
			case QvtoperationalPackage.MODEL_TYPE__ADDITIONAL_CONDITION:
			case QvtoperationalPackage.MODEL_TYPE__PACKAGEREF_LIST:
			case QvtoperationalPackage.MODEL_TYPE__MODELTYPE_WHERE:
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
				(EmofPackage.Literals.ELEMENT__OWNED_COMMENT,
				 EmofFactory.eINSTANCE.createComment()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__OWNED_TYPE,
				 QvtoperationalFactory.eINSTANCE.createModelType()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__OWNED_TYPE,
				 EmofFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__OWNED_TYPE,
				 EmofFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__OWNED_TYPE,
				 EmofFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__OWNED_TYPE,
				 EmofFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createHelper()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createOperationalTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createMappingOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createContextualProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createEntryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createModelType()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createTagGO()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createMetaModelGO()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createAccessDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createTypeDef()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 QvtoperationalFactory.eINSTANCE.createClassifierGO()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 EmofFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__OWNED_TAG,
				 EmofFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__MODULE_IMPORT,
				 QvtoperationalFactory.eINSTANCE.createModuleImport()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QvtoperationalFactory.eINSTANCE.createExpressionGO()));

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
				(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QvtoperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QvtoperationalFactory.eINSTANCE.createMappingParameter()));

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
				 QvtoperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE,
				 QvtoperationalFactory.eINSTANCE.createObjectExp()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.CLASS__OWNED_ATTRIBUTE,
				 EmofFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.CLASS__OWNED_OPERATION,
				 QvtoperationalFactory.eINSTANCE.createImperativeOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.CLASS__OWNED_OPERATION,
				 QvtoperationalFactory.eINSTANCE.createHelper()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.CLASS__OWNED_OPERATION,
				 QvtoperationalFactory.eINSTANCE.createMappingOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.CLASS__OWNED_OPERATION,
				 QvtoperationalFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.CLASS__OWNED_OPERATION,
				 QvtoperationalFactory.eINSTANCE.createContextualProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.CLASS__OWNED_OPERATION,
				 QvtoperationalFactory.eINSTANCE.createEntryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.CLASS__OWNED_OPERATION,
				 QvtoperationalFactory.eINSTANCE.createTagGO()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.CLASS__OWNED_OPERATION,
				 QvtoperationalFactory.eINSTANCE.createAccessDecl()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.CLASS__OWNED_OPERATION,
				 QvtoperationalFactory.eINSTANCE.createTypeDef()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.CLASS__OWNED_OPERATION,
				 QvtoperationalFactory.eINSTANCE.createClassifierGO()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.CLASS__OWNED_OPERATION,
				 EmofFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QvtoperationalFactory.eINSTANCE.createExpressionGO()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QvtoperationalFactory.eINSTANCE.createResolveExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QvtoperationalFactory.eINSTANCE.createResolveInExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QvtoperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QvtoperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QvtoperationalFactory.eINSTANCE.createImperativeCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QvtoperationalFactory.eINSTANCE.createMappingCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QvtoperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QvtoperationalFactory.eINSTANCE.createObjectExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODEL_TYPE__PACKAGEREF_LIST,
				 QvtoperationalFactory.eINSTANCE.createPackageRefGO()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.MODEL_TYPE__MODELTYPE_WHERE,
				 QvtoperationalFactory.eINSTANCE.createExpressionBlock()));
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
			childFeature == EmofPackage.Literals.PACKAGE__OWNED_TYPE ||
			childFeature == EmofPackage.Literals.PACKAGE__NESTED_PACKAGE ||
			childFeature == EmofPackage.Literals.CLASS__OWNED_OPERATION ||
			childFeature == QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE ||
			childFeature == QvtoperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QvtoperationalEditPlugin.INSTANCE;
	}

}
