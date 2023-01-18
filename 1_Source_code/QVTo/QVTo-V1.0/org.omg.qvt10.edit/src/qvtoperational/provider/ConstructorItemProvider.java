/**
 */
package qvtoperational.provider;


import emof.EmofFactory;
import emof.EmofPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qvtoperational.Constructor;
import qvtoperational.QvtoperationalFactory;
import qvtoperational.QvtoperationalPackage;

/**
 * This is the item provider adapter for a {@link qvtoperational.Constructor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstructorItemProvider extends ImperativeOperationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorItemProvider(AdapterFactory adapterFactory) {
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
			addEntryPropertyDescriptor(object);
			addConfigPropertyPropertyDescriptor(object);
			addUsedModelTypePropertyDescriptor(object);
			addIsBlackboxPropertyDescriptor(object);
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
			childrenFeatures.add(EmofPackage.Literals.PACKAGE__OWNED_TYPE);
			childrenFeatures.add(EmofPackage.Literals.PACKAGE__NESTED_PACKAGE);
			childrenFeatures.add(QvtoperationalPackage.Literals.MODULE__OWNED_TAG);
			childrenFeatures.add(QvtoperationalPackage.Literals.MODULE__MODULE_IMPORT);
			childrenFeatures.add(QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE);
			childrenFeatures.add(QvtoperationalPackage.Literals.CONSTRUCTOR__CONSTRUCTOR_HEADER);
			childrenFeatures.add(QvtoperationalPackage.Literals.CONSTRUCTOR__EXPRESSION_BLOCK);
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
	 * This returns Constructor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Constructor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Constructor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Constructor_type") :
			getString("_UI_Constructor_type") + " " + label;
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

		switch (notification.getFeatureID(Constructor.class)) {
			case QvtoperationalPackage.CONSTRUCTOR__URI:
			case QvtoperationalPackage.CONSTRUCTOR__IS_BLACKBOX:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QvtoperationalPackage.CONSTRUCTOR__OWNED_TYPE:
			case QvtoperationalPackage.CONSTRUCTOR__NESTED_PACKAGE:
			case QvtoperationalPackage.CONSTRUCTOR__OWNED_TAG:
			case QvtoperationalPackage.CONSTRUCTOR__MODULE_IMPORT:
			case QvtoperationalPackage.CONSTRUCTOR__OWNED_VARIABLE:
			case QvtoperationalPackage.CONSTRUCTOR__CONSTRUCTOR_HEADER:
			case QvtoperationalPackage.CONSTRUCTOR__EXPRESSION_BLOCK:
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
				(QvtoperationalPackage.Literals.CONSTRUCTOR__CONSTRUCTOR_HEADER,
				 QvtoperationalFactory.eINSTANCE.createConstructorHeader()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.CONSTRUCTOR__EXPRESSION_BLOCK,
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
			childFeature == EmofPackage.Literals.OPERATION__OWNED_PARAMETER ||
			childFeature == QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__CONTEXT ||
			childFeature == QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__RESULT ||
			childFeature == QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE ||
			childFeature == EmofPackage.Literals.PACKAGE__OWNED_TYPE ||
			childFeature == EmofPackage.Literals.PACKAGE__NESTED_PACKAGE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
