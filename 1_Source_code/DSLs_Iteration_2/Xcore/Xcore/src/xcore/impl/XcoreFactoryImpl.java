/**
 */
package xcore.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xcore.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XcoreFactoryImpl extends EFactoryImpl implements XcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XcoreFactory init() {
		try {
			XcoreFactory theXcoreFactory = (XcoreFactory)EPackage.Registry.INSTANCE.getEFactory(XcorePackage.eNS_URI);
			if (theXcoreFactory != null) {
				return theXcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XcorePackage.XANNOTATION: return createXAnnotation();
			case XcorePackage.XANNOTATION_DIRECTIVE: return createXAnnotationDirective();
			case XcorePackage.XATTRIBUTE: return createXAttribute();
			case XcorePackage.XCLASS: return createXClass();
			case XcorePackage.XDATA_TYPE: return createXDataType();
			case XcorePackage.XENUM: return createXEnum();
			case XcorePackage.XENUM_LITERAL: return createXEnumLiteral();
			case XcorePackage.XGENERIC_TYPE: return createXGenericType();
			case XcorePackage.XIMPORT_DIRECTIVE: return createXImportDirective();
			case XcorePackage.XOPERATION: return createXOperation();
			case XcorePackage.XPACKAGE: return createXPackage();
			case XcorePackage.XPARAMETER: return createXParameter();
			case XcorePackage.XREFERENCE: return createXReference();
			case XcorePackage.XSTRING_TO_STRING_MAP_ENTRY: return (EObject)createXStringToStringMapEntry();
			case XcorePackage.XTYPE_PARAMETER: return createXTypeParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XcorePackage.XMULTIPLICITY:
				return createXMultiplicityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XcorePackage.XMULTIPLICITY:
				return convertXMultiplicityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAnnotation createXAnnotation() {
		XAnnotationImpl xAnnotation = new XAnnotationImpl();
		return xAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAnnotationDirective createXAnnotationDirective() {
		XAnnotationDirectiveImpl xAnnotationDirective = new XAnnotationDirectiveImpl();
		return xAnnotationDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAttribute createXAttribute() {
		XAttributeImpl xAttribute = new XAttributeImpl();
		return xAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClass createXClass() {
		XClassImpl xClass = new XClassImpl();
		return xClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDataType createXDataType() {
		XDataTypeImpl xDataType = new XDataTypeImpl();
		return xDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEnum createXEnum() {
		XEnumImpl xEnum = new XEnumImpl();
		return xEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEnumLiteral createXEnumLiteral() {
		XEnumLiteralImpl xEnumLiteral = new XEnumLiteralImpl();
		return xEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XGenericType createXGenericType() {
		XGenericTypeImpl xGenericType = new XGenericTypeImpl();
		return xGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XImportDirective createXImportDirective() {
		XImportDirectiveImpl xImportDirective = new XImportDirectiveImpl();
		return xImportDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XOperation createXOperation() {
		XOperationImpl xOperation = new XOperationImpl();
		return xOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPackage createXPackage() {
		XPackageImpl xPackage = new XPackageImpl();
		return xPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XParameter createXParameter() {
		XParameterImpl xParameter = new XParameterImpl();
		return xParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XReference createXReference() {
		XReferenceImpl xReference = new XReferenceImpl();
		return xReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createXStringToStringMapEntry() {
		XStringToStringMapEntryImpl xStringToStringMapEntry = new XStringToStringMapEntryImpl();
		return xStringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTypeParameter createXTypeParameter() {
		XTypeParameterImpl xTypeParameter = new XTypeParameterImpl();
		return xTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] createXMultiplicityFromString(EDataType eDataType, String initialValue) {
		return (int[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXMultiplicityToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcorePackage getXcorePackage() {
		return (XcorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XcorePackage getPackage() {
		return XcorePackage.eINSTANCE;
	}

} //XcoreFactoryImpl
