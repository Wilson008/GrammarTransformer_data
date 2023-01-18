/**
 */
package xcore.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import xcore.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see xcore.XcorePackage
 * @generated
 */
public class XcoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XcorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XcorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XcoreSwitch<Adapter> modelSwitch =
		new XcoreSwitch<Adapter>() {
			@Override
			public Adapter caseXAnnotation(XAnnotation object) {
				return createXAnnotationAdapter();
			}
			@Override
			public Adapter caseXAnnotationDirective(XAnnotationDirective object) {
				return createXAnnotationDirectiveAdapter();
			}
			@Override
			public Adapter caseXAttribute(XAttribute object) {
				return createXAttributeAdapter();
			}
			@Override
			public Adapter caseXClass(XClass object) {
				return createXClassAdapter();
			}
			@Override
			public Adapter caseXClassifier(XClassifier object) {
				return createXClassifierAdapter();
			}
			@Override
			public Adapter caseXDataType(XDataType object) {
				return createXDataTypeAdapter();
			}
			@Override
			public Adapter caseXEnum(XEnum object) {
				return createXEnumAdapter();
			}
			@Override
			public Adapter caseXEnumLiteral(XEnumLiteral object) {
				return createXEnumLiteralAdapter();
			}
			@Override
			public Adapter caseXGenericType(XGenericType object) {
				return createXGenericTypeAdapter();
			}
			@Override
			public Adapter caseXImportDirective(XImportDirective object) {
				return createXImportDirectiveAdapter();
			}
			@Override
			public Adapter caseXMember(XMember object) {
				return createXMemberAdapter();
			}
			@Override
			public Adapter caseXModelElement(XModelElement object) {
				return createXModelElementAdapter();
			}
			@Override
			public Adapter caseXNamedElement(XNamedElement object) {
				return createXNamedElementAdapter();
			}
			@Override
			public Adapter caseXOperation(XOperation object) {
				return createXOperationAdapter();
			}
			@Override
			public Adapter caseXPackage(XPackage object) {
				return createXPackageAdapter();
			}
			@Override
			public Adapter caseXParameter(XParameter object) {
				return createXParameterAdapter();
			}
			@Override
			public Adapter caseXReference(XReference object) {
				return createXReferenceAdapter();
			}
			@Override
			public Adapter caseXStringToStringMapEntry(Map.Entry<String, String> object) {
				return createXStringToStringMapEntryAdapter();
			}
			@Override
			public Adapter caseXStructuralFeature(XStructuralFeature object) {
				return createXStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseXTypedElement(XTypedElement object) {
				return createXTypedElementAdapter();
			}
			@Override
			public Adapter caseXTypeParameter(XTypeParameter object) {
				return createXTypeParameterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link xcore.XAnnotation <em>XAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XAnnotation
	 * @generated
	 */
	public Adapter createXAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XAnnotationDirective <em>XAnnotation Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XAnnotationDirective
	 * @generated
	 */
	public Adapter createXAnnotationDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XAttribute <em>XAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XAttribute
	 * @generated
	 */
	public Adapter createXAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XClass
	 * @generated
	 */
	public Adapter createXClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XClassifier <em>XClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XClassifier
	 * @generated
	 */
	public Adapter createXClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XDataType <em>XData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XDataType
	 * @generated
	 */
	public Adapter createXDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XEnum <em>XEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XEnum
	 * @generated
	 */
	public Adapter createXEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XEnumLiteral <em>XEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XEnumLiteral
	 * @generated
	 */
	public Adapter createXEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XGenericType <em>XGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XGenericType
	 * @generated
	 */
	public Adapter createXGenericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XImportDirective <em>XImport Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XImportDirective
	 * @generated
	 */
	public Adapter createXImportDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XMember <em>XMember</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XMember
	 * @generated
	 */
	public Adapter createXMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XModelElement <em>XModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XModelElement
	 * @generated
	 */
	public Adapter createXModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XNamedElement <em>XNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XNamedElement
	 * @generated
	 */
	public Adapter createXNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XOperation <em>XOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XOperation
	 * @generated
	 */
	public Adapter createXOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XPackage <em>XPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XPackage
	 * @generated
	 */
	public Adapter createXPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XParameter <em>XParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XParameter
	 * @generated
	 */
	public Adapter createXParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XReference <em>XReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XReference
	 * @generated
	 */
	public Adapter createXReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>XString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createXStringToStringMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XStructuralFeature <em>XStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XStructuralFeature
	 * @generated
	 */
	public Adapter createXStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XTypedElement <em>XTyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XTypedElement
	 * @generated
	 */
	public Adapter createXTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xcore.XTypeParameter <em>XType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xcore.XTypeParameter
	 * @generated
	 */
	public Adapter createXTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XcoreAdapterFactory
