/**
 */
package QVTOperational.provider;


import EMOF.EMOFPackage;

import QVTOperational.Library;
import QVTOperational.QVTOperationalFactory;
import QVTOperational.QVTOperationalPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link QVTOperational.Library} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryItemProvider extends ModuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QVTOperationalPackage.Literals.LIBRARY__LIBRARY_H);
			childrenFeatures.add(QVTOperationalPackage.Literals.LIBRARY__MODULE_ELEMENT);
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
	 * This returns Library.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Library"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Library)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Library_type") :
			getString("_UI_Library_type") + " " + label;
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

		switch (notification.getFeatureID(Library.class)) {
			case QVTOperationalPackage.LIBRARY__LIBRARY_H:
			case QVTOperationalPackage.LIBRARY__MODULE_ELEMENT:
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
				(QVTOperationalPackage.Literals.LIBRARY__LIBRARY_H,
				 QVTOperationalFactory.eINSTANCE.createLibraryHeader()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.LIBRARY__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createImperativeOperation()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.LIBRARY__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.LIBRARY__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createContextualProperty()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.LIBRARY__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createEntryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.LIBRARY__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createHelper()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.LIBRARY__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createMappingOperation()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.LIBRARY__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createTagGO()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.LIBRARY__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createAccessDecl()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.LIBRARY__MODULE_ELEMENT,
				 QVTOperationalFactory.eINSTANCE.createTypeDef()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.LIBRARY__MODULE_ELEMENT,
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
			childFeature == QVTOperationalPackage.Literals.LIBRARY__MODULE_ELEMENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
