/**
 */
package spectra.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import spectra.SpectraFactory;
import spectra.SpectraPackage;
import spectra.TemporalPrimaryExpr;

/**
 * This is the item provider adapter for a {@link spectra.TemporalPrimaryExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalPrimaryExprItemProvider extends TemporalExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalPrimaryExprItemProvider(AdapterFactory adapterFactory) {
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

			addPredPattPropertyDescriptor(object);
			addOperatorPropertyDescriptor(object);
			addPointerPropertyDescriptor(object);
			addRegexpPointerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pred Patt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredPattPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemporalPrimaryExpr_predPatt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemporalPrimaryExpr_predPatt_feature", "_UI_TemporalPrimaryExpr_type"),
				 SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemporalPrimaryExpr_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemporalPrimaryExpr_operator_feature", "_UI_TemporalPrimaryExpr_type"),
				 SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__OPERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pointer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemporalPrimaryExpr_pointer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemporalPrimaryExpr_pointer_feature", "_UI_TemporalPrimaryExpr_type"),
				 SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__POINTER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Regexp Pointer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegexpPointerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemporalPrimaryExpr_regexpPointer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemporalPrimaryExpr_regexpPointer_feature", "_UI_TemporalPrimaryExpr_type"),
				 SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__REGEXP_POINTER,
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
			childrenFeatures.add(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS);
			childrenFeatures.add(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE);
			childrenFeatures.add(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX);
			childrenFeatures.add(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION);
			childrenFeatures.add(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__REGEXP);
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
	 * This returns TemporalPrimaryExpr.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TemporalPrimaryExpr"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TemporalPrimaryExpr)object).getOperator();
		return label == null || label.length() == 0 ?
			getString("_UI_TemporalPrimaryExpr_type") :
			getString("_UI_TemporalPrimaryExpr_type") + " " + label;
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

		switch (notification.getFeatureID(TemporalPrimaryExpr.class)) {
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS:
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__TPE:
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__INDEX:
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION:
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP:
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
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS,
				 SpectraFactory.eINSTANCE.createTemporalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS,
				 SpectraFactory.eINSTANCE.createTemporalInExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS,
				 SpectraFactory.eINSTANCE.createTemporalImpExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS,
				 SpectraFactory.eINSTANCE.createTemporalIffExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS,
				 SpectraFactory.eINSTANCE.createTemporalOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS,
				 SpectraFactory.eINSTANCE.createTemporalAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS,
				 SpectraFactory.eINSTANCE.createTemporalRelationalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS,
				 SpectraFactory.eINSTANCE.createTemporalRemainderExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS,
				 SpectraFactory.eINSTANCE.createTemporalAdditiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS,
				 SpectraFactory.eINSTANCE.createTemporalMultiplicativeExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS,
				 SpectraFactory.eINSTANCE.createTemporalBinaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS,
				 SpectraFactory.eINSTANCE.createTemporalUnaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS,
				 SpectraFactory.eINSTANCE.createTemporalPrimaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS,
				 SpectraFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS,
				 SpectraFactory.eINSTANCE.createQuantifierExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE,
				 SpectraFactory.eINSTANCE.createTemporalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE,
				 SpectraFactory.eINSTANCE.createTemporalInExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE,
				 SpectraFactory.eINSTANCE.createTemporalImpExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE,
				 SpectraFactory.eINSTANCE.createTemporalIffExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE,
				 SpectraFactory.eINSTANCE.createTemporalOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE,
				 SpectraFactory.eINSTANCE.createTemporalAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE,
				 SpectraFactory.eINSTANCE.createTemporalRelationalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE,
				 SpectraFactory.eINSTANCE.createTemporalRemainderExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE,
				 SpectraFactory.eINSTANCE.createTemporalAdditiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE,
				 SpectraFactory.eINSTANCE.createTemporalMultiplicativeExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE,
				 SpectraFactory.eINSTANCE.createTemporalBinaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE,
				 SpectraFactory.eINSTANCE.createTemporalUnaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE,
				 SpectraFactory.eINSTANCE.createTemporalPrimaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE,
				 SpectraFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE,
				 SpectraFactory.eINSTANCE.createQuantifierExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX,
				 SpectraFactory.eINSTANCE.createTemporalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX,
				 SpectraFactory.eINSTANCE.createTemporalInExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX,
				 SpectraFactory.eINSTANCE.createTemporalImpExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX,
				 SpectraFactory.eINSTANCE.createTemporalIffExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX,
				 SpectraFactory.eINSTANCE.createTemporalOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX,
				 SpectraFactory.eINSTANCE.createTemporalAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX,
				 SpectraFactory.eINSTANCE.createTemporalRelationalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX,
				 SpectraFactory.eINSTANCE.createTemporalRemainderExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX,
				 SpectraFactory.eINSTANCE.createTemporalAdditiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX,
				 SpectraFactory.eINSTANCE.createTemporalMultiplicativeExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX,
				 SpectraFactory.eINSTANCE.createTemporalBinaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX,
				 SpectraFactory.eINSTANCE.createTemporalUnaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX,
				 SpectraFactory.eINSTANCE.createTemporalPrimaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX,
				 SpectraFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX,
				 SpectraFactory.eINSTANCE.createQuantifierExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION,
				 SpectraFactory.eINSTANCE.createTemporalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION,
				 SpectraFactory.eINSTANCE.createTemporalInExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION,
				 SpectraFactory.eINSTANCE.createTemporalImpExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION,
				 SpectraFactory.eINSTANCE.createTemporalIffExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION,
				 SpectraFactory.eINSTANCE.createTemporalOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION,
				 SpectraFactory.eINSTANCE.createTemporalAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION,
				 SpectraFactory.eINSTANCE.createTemporalRelationalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION,
				 SpectraFactory.eINSTANCE.createTemporalRemainderExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION,
				 SpectraFactory.eINSTANCE.createTemporalAdditiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION,
				 SpectraFactory.eINSTANCE.createTemporalMultiplicativeExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION,
				 SpectraFactory.eINSTANCE.createTemporalBinaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION,
				 SpectraFactory.eINSTANCE.createTemporalUnaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION,
				 SpectraFactory.eINSTANCE.createTemporalPrimaryExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION,
				 SpectraFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION,
				 SpectraFactory.eINSTANCE.createQuantifierExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__REGEXP,
				 SpectraFactory.eINSTANCE.createRegExp()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__REGEXP,
				 SpectraFactory.eINSTANCE.createBinaryRegExp()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__REGEXP,
				 SpectraFactory.eINSTANCE.createUnaryRegExp()));

		newChildDescriptors.add
			(createChildParameter
				(SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__REGEXP,
				 SpectraFactory.eINSTANCE.createCompRegExp()));
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
			childFeature == SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS ||
			childFeature == SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TPE ||
			childFeature == SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__INDEX ||
			childFeature == SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
