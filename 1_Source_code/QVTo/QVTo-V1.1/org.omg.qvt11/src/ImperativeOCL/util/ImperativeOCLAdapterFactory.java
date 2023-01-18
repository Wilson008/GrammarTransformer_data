/**
 */
package ImperativeOCL.util;

import EMOF.DataType;
import EMOF.Element;
import EMOF.NamedElement;
import EMOF.Type;
import EMOF.TypedElement;

import EssentialOCL.CallExp;
import EssentialOCL.CollectionType;
import EssentialOCL.FeatureCallExp;
import EssentialOCL.LiteralExp;
import EssentialOCL.LoopExp;
import EssentialOCL.OclExpression;
import EssentialOCL.OperationCallExp;

import ImperativeOCL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ImperativeOCL.ImperativeOCLPackage
 * @generated
 */
public class ImperativeOCLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImperativeOCLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOCLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ImperativeOCLPackage.eINSTANCE;
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
	protected ImperativeOCLSwitch<Adapter> modelSwitch =
		new ImperativeOCLSwitch<Adapter>() {
			@Override
			public Adapter caseAltExp(AltExp object) {
				return createAltExpAdapter();
			}
			@Override
			public Adapter caseAssertExp(AssertExp object) {
				return createAssertExpAdapter();
			}
			@Override
			public Adapter caseAssignExp(AssignExp object) {
				return createAssignExpAdapter();
			}
			@Override
			public Adapter caseBlockExp(BlockExp object) {
				return createBlockExpAdapter();
			}
			@Override
			public Adapter caseBreakExp(BreakExp object) {
				return createBreakExpAdapter();
			}
			@Override
			public Adapter caseCatchExp(CatchExp object) {
				return createCatchExpAdapter();
			}
			@Override
			public Adapter caseComputeExp(ComputeExp object) {
				return createComputeExpAdapter();
			}
			@Override
			public Adapter caseContinueExp(ContinueExp object) {
				return createContinueExpAdapter();
			}
			@Override
			public Adapter caseDictLiteralExp(DictLiteralExp object) {
				return createDictLiteralExpAdapter();
			}
			@Override
			public Adapter caseDictLiteralPart(DictLiteralPart object) {
				return createDictLiteralPartAdapter();
			}
			@Override
			public Adapter caseDictionaryType(DictionaryType object) {
				return createDictionaryTypeAdapter();
			}
			@Override
			public Adapter caseForExp(ForExp object) {
				return createForExpAdapter();
			}
			@Override
			public Adapter caseImperativeExpression(ImperativeExpression object) {
				return createImperativeExpressionAdapter();
			}
			@Override
			public Adapter caseImperativeIterateExp(ImperativeIterateExp object) {
				return createImperativeIterateExpAdapter();
			}
			@Override
			public Adapter caseImperativeLoopExp(ImperativeLoopExp object) {
				return createImperativeLoopExpAdapter();
			}
			@Override
			public Adapter caseInstantiationExp(InstantiationExp object) {
				return createInstantiationExpAdapter();
			}
			@Override
			public Adapter caseListLiteralExp(ListLiteralExp object) {
				return createListLiteralExpAdapter();
			}
			@Override
			public Adapter caseListType(ListType object) {
				return createListTypeAdapter();
			}
			@Override
			public Adapter caseLogExp(LogExp object) {
				return createLogExpAdapter();
			}
			@Override
			public Adapter caseOrderedTupleLiteralExp(OrderedTupleLiteralExp object) {
				return createOrderedTupleLiteralExpAdapter();
			}
			@Override
			public Adapter caseOrderedTupleLiteralPart(OrderedTupleLiteralPart object) {
				return createOrderedTupleLiteralPartAdapter();
			}
			@Override
			public Adapter caseOrderedTupleType(OrderedTupleType object) {
				return createOrderedTupleTypeAdapter();
			}
			@Override
			public Adapter caseRaiseExp(RaiseExp object) {
				return createRaiseExpAdapter();
			}
			@Override
			public Adapter caseReturnExp(ReturnExp object) {
				return createReturnExpAdapter();
			}
			@Override
			public Adapter caseSwitchExp(SwitchExp object) {
				return createSwitchExpAdapter();
			}
			@Override
			public Adapter caseTryExp(TryExp object) {
				return createTryExpAdapter();
			}
			@Override
			public Adapter caseTypedef(Typedef object) {
				return createTypedefAdapter();
			}
			@Override
			public Adapter caseUnlinkExp(UnlinkExp object) {
				return createUnlinkExpAdapter();
			}
			@Override
			public Adapter caseUnpackExp(UnpackExp object) {
				return createUnpackExpAdapter();
			}
			@Override
			public Adapter caseVariableInitExp(VariableInitExp object) {
				return createVariableInitExpAdapter();
			}
			@Override
			public Adapter caseWhileExp(WhileExp object) {
				return createWhileExpAdapter();
			}
			@Override
			public Adapter caseObject(EMOF.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseOclExpression(OclExpression object) {
				return createOclExpressionAdapter();
			}
			@Override
			public Adapter caseLiteralExp(LiteralExp object) {
				return createLiteralExpAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseCollectionType(CollectionType object) {
				return createCollectionTypeAdapter();
			}
			@Override
			public Adapter caseCallExp(CallExp object) {
				return createCallExpAdapter();
			}
			@Override
			public Adapter caseLoopExp(LoopExp object) {
				return createLoopExpAdapter();
			}
			@Override
			public Adapter caseFeatureCallExp(FeatureCallExp object) {
				return createFeatureCallExpAdapter();
			}
			@Override
			public Adapter caseOperationCallExp(OperationCallExp object) {
				return createOperationCallExpAdapter();
			}
			@Override
			public Adapter caseClass(EMOF.Class object) {
				return createClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.AltExp <em>Alt Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.AltExp
	 * @generated
	 */
	public Adapter createAltExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.AssertExp <em>Assert Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.AssertExp
	 * @generated
	 */
	public Adapter createAssertExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.AssignExp <em>Assign Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.AssignExp
	 * @generated
	 */
	public Adapter createAssignExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.BlockExp <em>Block Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.BlockExp
	 * @generated
	 */
	public Adapter createBlockExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.BreakExp <em>Break Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.BreakExp
	 * @generated
	 */
	public Adapter createBreakExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.CatchExp <em>Catch Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.CatchExp
	 * @generated
	 */
	public Adapter createCatchExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.ComputeExp <em>Compute Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.ComputeExp
	 * @generated
	 */
	public Adapter createComputeExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.ContinueExp <em>Continue Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.ContinueExp
	 * @generated
	 */
	public Adapter createContinueExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.DictLiteralExp <em>Dict Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.DictLiteralExp
	 * @generated
	 */
	public Adapter createDictLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.DictLiteralPart <em>Dict Literal Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.DictLiteralPart
	 * @generated
	 */
	public Adapter createDictLiteralPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.DictionaryType <em>Dictionary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.DictionaryType
	 * @generated
	 */
	public Adapter createDictionaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.ForExp <em>For Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.ForExp
	 * @generated
	 */
	public Adapter createForExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.ImperativeExpression <em>Imperative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.ImperativeExpression
	 * @generated
	 */
	public Adapter createImperativeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.ImperativeIterateExp <em>Imperative Iterate Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.ImperativeIterateExp
	 * @generated
	 */
	public Adapter createImperativeIterateExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.ImperativeLoopExp <em>Imperative Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.ImperativeLoopExp
	 * @generated
	 */
	public Adapter createImperativeLoopExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.InstantiationExp <em>Instantiation Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.InstantiationExp
	 * @generated
	 */
	public Adapter createInstantiationExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.ListLiteralExp <em>List Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.ListLiteralExp
	 * @generated
	 */
	public Adapter createListLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.ListType
	 * @generated
	 */
	public Adapter createListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.LogExp <em>Log Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.LogExp
	 * @generated
	 */
	public Adapter createLogExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.OrderedTupleLiteralExp <em>Ordered Tuple Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.OrderedTupleLiteralExp
	 * @generated
	 */
	public Adapter createOrderedTupleLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.OrderedTupleLiteralPart <em>Ordered Tuple Literal Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.OrderedTupleLiteralPart
	 * @generated
	 */
	public Adapter createOrderedTupleLiteralPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.OrderedTupleType <em>Ordered Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.OrderedTupleType
	 * @generated
	 */
	public Adapter createOrderedTupleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.RaiseExp <em>Raise Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.RaiseExp
	 * @generated
	 */
	public Adapter createRaiseExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.ReturnExp <em>Return Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.ReturnExp
	 * @generated
	 */
	public Adapter createReturnExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.SwitchExp <em>Switch Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.SwitchExp
	 * @generated
	 */
	public Adapter createSwitchExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.TryExp <em>Try Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.TryExp
	 * @generated
	 */
	public Adapter createTryExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.Typedef <em>Typedef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.Typedef
	 * @generated
	 */
	public Adapter createTypedefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.UnlinkExp <em>Unlink Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.UnlinkExp
	 * @generated
	 */
	public Adapter createUnlinkExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.UnpackExp <em>Unpack Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.UnpackExp
	 * @generated
	 */
	public Adapter createUnpackExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.VariableInitExp <em>Variable Init Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.VariableInitExp
	 * @generated
	 */
	public Adapter createVariableInitExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImperativeOCL.WhileExp <em>While Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImperativeOCL.WhileExp
	 * @generated
	 */
	public Adapter createWhileExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EMOF.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EMOF.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EMOF.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EMOF.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EMOF.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EMOF.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EMOF.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EMOF.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EssentialOCL.OclExpression <em>Ocl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EssentialOCL.OclExpression
	 * @generated
	 */
	public Adapter createOclExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EssentialOCL.LiteralExp <em>Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EssentialOCL.LiteralExp
	 * @generated
	 */
	public Adapter createLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EMOF.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EMOF.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EMOF.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EMOF.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EssentialOCL.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EssentialOCL.CollectionType
	 * @generated
	 */
	public Adapter createCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EssentialOCL.CallExp <em>Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EssentialOCL.CallExp
	 * @generated
	 */
	public Adapter createCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EssentialOCL.LoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EssentialOCL.LoopExp
	 * @generated
	 */
	public Adapter createLoopExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EssentialOCL.FeatureCallExp <em>Feature Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EssentialOCL.FeatureCallExp
	 * @generated
	 */
	public Adapter createFeatureCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EssentialOCL.OperationCallExp <em>Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EssentialOCL.OperationCallExp
	 * @generated
	 */
	public Adapter createOperationCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EMOF.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EMOF.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
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

} //ImperativeOCLAdapterFactory
