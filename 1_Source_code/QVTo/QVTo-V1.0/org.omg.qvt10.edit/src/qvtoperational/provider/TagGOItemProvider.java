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

import qvtoperational.QvtoperationalFactory;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.TagGO;

/**
 * This is the item provider adapter for a {@link qvtoperational.TagGO} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TagGOItemProvider extends ModuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagGOItemProvider(AdapterFactory adapterFactory) {
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

			addIsOrderedPropertyDescriptor(object);
			addIsUniquePropertyDescriptor(object);
			addLowerPropertyDescriptor(object);
			addUpperPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addRaisedExceptionPropertyDescriptor(object);
			addOverriddenPropertyDescriptor(object);
			addTagidPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Ordered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOrderedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_isOrdered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_isOrdered_feature", "_UI_MultiplicityElement_type"),
				 EmofPackage.Literals.MULTIPLICITY_ELEMENT__IS_ORDERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_isUnique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_isUnique_feature", "_UI_MultiplicityElement_type"),
				 EmofPackage.Literals.MULTIPLICITY_ELEMENT__IS_UNIQUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_lower_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_lower_feature", "_UI_MultiplicityElement_type"),
				 EmofPackage.Literals.MULTIPLICITY_ELEMENT__LOWER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_upper_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_upper_feature", "_UI_MultiplicityElement_type"),
				 EmofPackage.Literals.MULTIPLICITY_ELEMENT__UPPER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypedElement_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypedElement_type_feature", "_UI_TypedElement_type"),
				 EmofPackage.Literals.TYPED_ELEMENT__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Raised Exception feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRaisedExceptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_raisedException_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_raisedException_feature", "_UI_Operation_type"),
				 EmofPackage.Literals.OPERATION__RAISED_EXCEPTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overridden feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverriddenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImperativeOperation_overridden_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImperativeOperation_overridden_feature", "_UI_ImperativeOperation_type"),
				 QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__OVERRIDDEN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tagid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TagGO_tagid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TagGO_tagid_feature", "_UI_TagGO_type"),
				 QvtoperationalPackage.Literals.TAG_GO__TAGID,
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
			childrenFeatures.add(EmofPackage.Literals.OPERATION__OWNED_PARAMETER);
			childrenFeatures.add(QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__CONTEXT);
			childrenFeatures.add(QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__RESULT);
			childrenFeatures.add(QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__BODY);
			childrenFeatures.add(QvtoperationalPackage.Literals.TAG_GO__SCOPED_IDENTIFIER);
			childrenFeatures.add(QvtoperationalPackage.Literals.TAG_GO__TAGVALUE);
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
	 * This returns TagGO.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TagGO"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TagGO)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TagGO_type") :
			getString("_UI_TagGO_type") + " " + label;
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

		switch (notification.getFeatureID(TagGO.class)) {
			case QvtoperationalPackage.TAG_GO__IS_ORDERED:
			case QvtoperationalPackage.TAG_GO__IS_UNIQUE:
			case QvtoperationalPackage.TAG_GO__LOWER:
			case QvtoperationalPackage.TAG_GO__UPPER:
			case QvtoperationalPackage.TAG_GO__TAGID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QvtoperationalPackage.TAG_GO__OWNED_PARAMETER:
			case QvtoperationalPackage.TAG_GO__CONTEXT:
			case QvtoperationalPackage.TAG_GO__RESULT:
			case QvtoperationalPackage.TAG_GO__BODY:
			case QvtoperationalPackage.TAG_GO__SCOPED_IDENTIFIER:
			case QvtoperationalPackage.TAG_GO__TAGVALUE:
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
				(EmofPackage.Literals.OPERATION__OWNED_PARAMETER,
				 QvtoperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.OPERATION__OWNED_PARAMETER,
				 QvtoperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.OPERATION__OWNED_PARAMETER,
				 QvtoperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EmofPackage.Literals.OPERATION__OWNED_PARAMETER,
				 EmofFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__CONTEXT,
				 QvtoperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__CONTEXT,
				 QvtoperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__CONTEXT,
				 QvtoperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__RESULT,
				 QvtoperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__RESULT,
				 QvtoperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__RESULT,
				 QvtoperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__BODY,
				 QvtoperationalFactory.eINSTANCE.createOperationBody()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__BODY,
				 QvtoperationalFactory.eINSTANCE.createMappingBody()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__BODY,
				 QvtoperationalFactory.eINSTANCE.createConstructorBody()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.TAG_GO__SCOPED_IDENTIFIER,
				 QvtoperationalFactory.eINSTANCE.createScopedIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.TAG_GO__TAGVALUE,
				 QvtoperationalFactory.eINSTANCE.createExpressionGO()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.TAG_GO__TAGVALUE,
				 QvtoperationalFactory.eINSTANCE.createResolveExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.TAG_GO__TAGVALUE,
				 QvtoperationalFactory.eINSTANCE.createResolveInExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.TAG_GO__TAGVALUE,
				 QvtoperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.TAG_GO__TAGVALUE,
				 QvtoperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.TAG_GO__TAGVALUE,
				 QvtoperationalFactory.eINSTANCE.createImperativeCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.TAG_GO__TAGVALUE,
				 QvtoperationalFactory.eINSTANCE.createMappingCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.TAG_GO__TAGVALUE,
				 QvtoperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QvtoperationalPackage.Literals.TAG_GO__TAGVALUE,
				 QvtoperationalFactory.eINSTANCE.createObjectExp()));
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
			childFeature == QvtoperationalPackage.Literals.MODULE__OWNED_VARIABLE ||
			childFeature == QvtoperationalPackage.Literals.TAG_GO__TAGVALUE ||
			childFeature == EmofPackage.Literals.OPERATION__OWNED_PARAMETER ||
			childFeature == QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__CONTEXT ||
			childFeature == QvtoperationalPackage.Literals.IMPERATIVE_OPERATION__RESULT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
