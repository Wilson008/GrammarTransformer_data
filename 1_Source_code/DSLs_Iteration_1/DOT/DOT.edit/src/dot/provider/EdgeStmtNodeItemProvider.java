/**
 */
package dot.provider;


import dot.DotFactory;
import dot.DotPackage;
import dot.EdgeStmtNode;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dot.EdgeStmtNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EdgeStmtNodeItemProvider extends StmtItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeStmtNodeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(DotPackage.Literals.EDGE_STMT_NODE__NODE);
			childrenFeatures.add(DotPackage.Literals.EDGE_STMT_NODE__EDGE_RHS);
			childrenFeatures.add(DotPackage.Literals.EDGE_STMT_NODE__ATTR_LISTS);
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
	 * This returns EdgeStmtNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EdgeStmtNode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_EdgeStmtNode_type");
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

		switch (notification.getFeatureID(EdgeStmtNode.class)) {
			case DotPackage.EDGE_STMT_NODE__NODE:
			case DotPackage.EDGE_STMT_NODE__EDGE_RHS:
			case DotPackage.EDGE_STMT_NODE__ATTR_LISTS:
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
				(DotPackage.Literals.EDGE_STMT_NODE__NODE,
				 DotFactory.eINSTANCE.createNodeId()));

		newChildDescriptors.add
			(createChildParameter
				(DotPackage.Literals.EDGE_STMT_NODE__EDGE_RHS,
				 DotFactory.eINSTANCE.createEdgeRhs()));

		newChildDescriptors.add
			(createChildParameter
				(DotPackage.Literals.EDGE_STMT_NODE__EDGE_RHS,
				 DotFactory.eINSTANCE.createEdgeRhsNode()));

		newChildDescriptors.add
			(createChildParameter
				(DotPackage.Literals.EDGE_STMT_NODE__EDGE_RHS,
				 DotFactory.eINSTANCE.createEdgeRhsSubgraph()));

		newChildDescriptors.add
			(createChildParameter
				(DotPackage.Literals.EDGE_STMT_NODE__ATTR_LISTS,
				 DotFactory.eINSTANCE.createAttrList()));
	}

}
