/**
 */
package xenia;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xenia.XeniaFactory
 * @model kind="package"
 * @generated
 */
public interface XeniaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xenia";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.foliage.com/xenia/Xenia";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xenia";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XeniaPackage eINSTANCE = xenia.impl.XeniaPackageImpl.init();

	/**
	 * The meta object id for the '{@link xenia.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xenia.impl.ModelImpl
	 * @see xenia.impl.XeniaPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HEADERS = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Mapped entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MAPPED_ENTITIES = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xenia.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xenia.impl.HeaderImpl
	 * @see xenia.impl.XeniaPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 1;

	/**
	 * The feature id for the '<em><b>App Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__APP_NAME = 0;

	/**
	 * The feature id for the '<em><b>Sites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__SITES = 1;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xenia.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xenia.impl.EntityImpl
	 * @see xenia.impl.XeniaPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TECH = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PATH = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__MODE = 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xenia.impl.SuperSiteImpl <em>Super Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xenia.impl.SuperSiteImpl
	 * @see xenia.impl.XeniaPackageImpl#getSuperSite()
	 * @generated
	 */
	int SUPER_SITE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SITE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Super Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SITE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Super Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xenia.impl.SiteWithModalImpl <em>Site With Modal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xenia.impl.SiteWithModalImpl
	 * @see xenia.impl.XeniaPackageImpl#getSiteWithModal()
	 * @generated
	 */
	int SITE_WITH_MODAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_WITH_MODAL__NAME = SUPER_SITE__NAME;

	/**
	 * The feature id for the '<em><b>Sites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_WITH_MODAL__SITES = SUPER_SITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Site With Modal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_WITH_MODAL_FEATURE_COUNT = SUPER_SITE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Site With Modal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_WITH_MODAL_OPERATION_COUNT = SUPER_SITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xenia.impl.MappedEntityImpl <em>Mapped Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xenia.impl.MappedEntityImpl
	 * @see xenia.impl.XeniaPackageImpl#getMappedEntity()
	 * @generated
	 */
	int MAPPED_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Info Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ENTITY__INFO_PROPS = 0;

	/**
	 * The feature id for the '<em><b>Linked Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ENTITY__LINKED_PROPS = 1;

	/**
	 * The number of structural features of the '<em>Mapped Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapped Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xenia.impl.InfoPropertyImpl <em>Info Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xenia.impl.InfoPropertyImpl
	 * @see xenia.impl.XeniaPackageImpl#getInfoProperty()
	 * @generated
	 */
	int INFO_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_PROPERTY__PAGE = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_PROPERTY__ENTITIES = 1;

	/**
	 * The number of structural features of the '<em>Info Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Info Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xenia.impl.InfoEntityImpl <em>Info Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xenia.impl.InfoEntityImpl
	 * @see xenia.impl.XeniaPackageImpl#getInfoEntity()
	 * @generated
	 */
	int INFO_ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ENTITY__ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Info Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ENTITY__INFO_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Info Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Info Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xenia.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xenia.impl.SiteImpl
	 * @see xenia.impl.XeniaPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__NAME = SUPER_SITE__NAME;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = SUPER_SITE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_OPERATION_COUNT = SUPER_SITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xenia.impl.LinkedPropertyImpl <em>Linked Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xenia.impl.LinkedPropertyImpl
	 * @see xenia.impl.XeniaPackageImpl#getLinkedProperty()
	 * @generated
	 */
	int LINKED_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_PROPERTY__PAGE = 1;

	/**
	 * The number of structural features of the '<em>Linked Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Linked Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xenia.impl.RedirectPageImpl <em>Redirect Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xenia.impl.RedirectPageImpl
	 * @see xenia.impl.XeniaPackageImpl#getRedirectPage()
	 * @generated
	 */
	int REDIRECT_PAGE = 10;

	/**
	 * The feature id for the '<em><b>Site</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECT_PAGE__SITE = 0;

	/**
	 * The number of structural features of the '<em>Redirect Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECT_PAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Redirect Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECT_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xenia.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xenia.Mode
	 * @see xenia.impl.XeniaPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 11;

	/**
	 * The meta object id for the '{@link xenia.InfoEntry <em>Info Entry</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xenia.InfoEntry
	 * @see xenia.impl.XeniaPackageImpl#getInfoEntry()
	 * @generated
	 */
	int INFO_ENTRY = 12;


	/**
	 * Returns the meta object for class '{@link xenia.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see xenia.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link xenia.Model#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see xenia.Model#getHeaders()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Headers();

	/**
	 * Returns the meta object for the containment reference list '{@link xenia.Model#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see xenia.Model#getEntities()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link xenia.Model#getMapped_entities <em>Mapped entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapped entities</em>'.
	 * @see xenia.Model#getMapped_entities()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Mapped_entities();

	/**
	 * Returns the meta object for class '{@link xenia.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see xenia.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link xenia.Header#getAppName <em>App Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Name</em>'.
	 * @see xenia.Header#getAppName()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_AppName();

	/**
	 * Returns the meta object for the containment reference list '{@link xenia.Header#getSites <em>Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sites</em>'.
	 * @see xenia.Header#getSites()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Sites();

	/**
	 * Returns the meta object for class '{@link xenia.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see xenia.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link xenia.Entity#getTech <em>Tech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tech</em>'.
	 * @see xenia.Entity#getTech()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Tech();

	/**
	 * Returns the meta object for the attribute '{@link xenia.Entity#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see xenia.Entity#getPath()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Path();

	/**
	 * Returns the meta object for the attribute '{@link xenia.Entity#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see xenia.Entity#getMode()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Mode();

	/**
	 * Returns the meta object for class '{@link xenia.SuperSite <em>Super Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Site</em>'.
	 * @see xenia.SuperSite
	 * @generated
	 */
	EClass getSuperSite();

	/**
	 * Returns the meta object for the attribute '{@link xenia.SuperSite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xenia.SuperSite#getName()
	 * @see #getSuperSite()
	 * @generated
	 */
	EAttribute getSuperSite_Name();

	/**
	 * Returns the meta object for class '{@link xenia.SiteWithModal <em>Site With Modal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site With Modal</em>'.
	 * @see xenia.SiteWithModal
	 * @generated
	 */
	EClass getSiteWithModal();

	/**
	 * Returns the meta object for the containment reference list '{@link xenia.SiteWithModal#getSites <em>Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sites</em>'.
	 * @see xenia.SiteWithModal#getSites()
	 * @see #getSiteWithModal()
	 * @generated
	 */
	EReference getSiteWithModal_Sites();

	/**
	 * Returns the meta object for class '{@link xenia.MappedEntity <em>Mapped Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapped Entity</em>'.
	 * @see xenia.MappedEntity
	 * @generated
	 */
	EClass getMappedEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link xenia.MappedEntity#getInfoProps <em>Info Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Info Props</em>'.
	 * @see xenia.MappedEntity#getInfoProps()
	 * @see #getMappedEntity()
	 * @generated
	 */
	EReference getMappedEntity_InfoProps();

	/**
	 * Returns the meta object for the containment reference list '{@link xenia.MappedEntity#getLinkedProps <em>Linked Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linked Props</em>'.
	 * @see xenia.MappedEntity#getLinkedProps()
	 * @see #getMappedEntity()
	 * @generated
	 */
	EReference getMappedEntity_LinkedProps();

	/**
	 * Returns the meta object for class '{@link xenia.InfoProperty <em>Info Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Property</em>'.
	 * @see xenia.InfoProperty
	 * @generated
	 */
	EClass getInfoProperty();

	/**
	 * Returns the meta object for the reference '{@link xenia.InfoProperty#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page</em>'.
	 * @see xenia.InfoProperty#getPage()
	 * @see #getInfoProperty()
	 * @generated
	 */
	EReference getInfoProperty_Page();

	/**
	 * Returns the meta object for the containment reference list '{@link xenia.InfoProperty#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see xenia.InfoProperty#getEntities()
	 * @see #getInfoProperty()
	 * @generated
	 */
	EReference getInfoProperty_Entities();

	/**
	 * Returns the meta object for class '{@link xenia.InfoEntity <em>Info Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Entity</em>'.
	 * @see xenia.InfoEntity
	 * @generated
	 */
	EClass getInfoEntity();

	/**
	 * Returns the meta object for the attribute list '{@link xenia.InfoEntity#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entries</em>'.
	 * @see xenia.InfoEntity#getEntries()
	 * @see #getInfoEntity()
	 * @generated
	 */
	EAttribute getInfoEntity_Entries();

	/**
	 * Returns the meta object for the attribute '{@link xenia.InfoEntity#getInfoValue <em>Info Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info Value</em>'.
	 * @see xenia.InfoEntity#getInfoValue()
	 * @see #getInfoEntity()
	 * @generated
	 */
	EAttribute getInfoEntity_InfoValue();

	/**
	 * Returns the meta object for class '{@link xenia.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see xenia.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for class '{@link xenia.LinkedProperty <em>Linked Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linked Property</em>'.
	 * @see xenia.LinkedProperty
	 * @generated
	 */
	EClass getLinkedProperty();

	/**
	 * Returns the meta object for the reference '{@link xenia.LinkedProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see xenia.LinkedProperty#getName()
	 * @see #getLinkedProperty()
	 * @generated
	 */
	EReference getLinkedProperty_Name();

	/**
	 * Returns the meta object for the containment reference '{@link xenia.LinkedProperty#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page</em>'.
	 * @see xenia.LinkedProperty#getPage()
	 * @see #getLinkedProperty()
	 * @generated
	 */
	EReference getLinkedProperty_Page();

	/**
	 * Returns the meta object for class '{@link xenia.RedirectPage <em>Redirect Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redirect Page</em>'.
	 * @see xenia.RedirectPage
	 * @generated
	 */
	EClass getRedirectPage();

	/**
	 * Returns the meta object for the reference list '{@link xenia.RedirectPage#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Site</em>'.
	 * @see xenia.RedirectPage#getSite()
	 * @see #getRedirectPage()
	 * @generated
	 */
	EReference getRedirectPage_Site();

	/**
	 * Returns the meta object for enum '{@link xenia.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see xenia.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the meta object for enum '{@link xenia.InfoEntry <em>Info Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Info Entry</em>'.
	 * @see xenia.InfoEntry
	 * @generated
	 */
	EEnum getInfoEntry();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XeniaFactory getXeniaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link xenia.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xenia.impl.ModelImpl
		 * @see xenia.impl.XeniaPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HEADERS = eINSTANCE.getModel_Headers();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ENTITIES = eINSTANCE.getModel_Entities();

		/**
		 * The meta object literal for the '<em><b>Mapped entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MAPPED_ENTITIES = eINSTANCE.getModel_Mapped_entities();

		/**
		 * The meta object literal for the '{@link xenia.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xenia.impl.HeaderImpl
		 * @see xenia.impl.XeniaPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>App Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__APP_NAME = eINSTANCE.getHeader_AppName();

		/**
		 * The meta object literal for the '<em><b>Sites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__SITES = eINSTANCE.getHeader_Sites();

		/**
		 * The meta object literal for the '{@link xenia.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xenia.impl.EntityImpl
		 * @see xenia.impl.XeniaPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Tech</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__TECH = eINSTANCE.getEntity_Tech();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__PATH = eINSTANCE.getEntity_Path();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__MODE = eINSTANCE.getEntity_Mode();

		/**
		 * The meta object literal for the '{@link xenia.impl.SuperSiteImpl <em>Super Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xenia.impl.SuperSiteImpl
		 * @see xenia.impl.XeniaPackageImpl#getSuperSite()
		 * @generated
		 */
		EClass SUPER_SITE = eINSTANCE.getSuperSite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_SITE__NAME = eINSTANCE.getSuperSite_Name();

		/**
		 * The meta object literal for the '{@link xenia.impl.SiteWithModalImpl <em>Site With Modal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xenia.impl.SiteWithModalImpl
		 * @see xenia.impl.XeniaPackageImpl#getSiteWithModal()
		 * @generated
		 */
		EClass SITE_WITH_MODAL = eINSTANCE.getSiteWithModal();

		/**
		 * The meta object literal for the '<em><b>Sites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_WITH_MODAL__SITES = eINSTANCE.getSiteWithModal_Sites();

		/**
		 * The meta object literal for the '{@link xenia.impl.MappedEntityImpl <em>Mapped Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xenia.impl.MappedEntityImpl
		 * @see xenia.impl.XeniaPackageImpl#getMappedEntity()
		 * @generated
		 */
		EClass MAPPED_ENTITY = eINSTANCE.getMappedEntity();

		/**
		 * The meta object literal for the '<em><b>Info Props</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_ENTITY__INFO_PROPS = eINSTANCE.getMappedEntity_InfoProps();

		/**
		 * The meta object literal for the '<em><b>Linked Props</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_ENTITY__LINKED_PROPS = eINSTANCE.getMappedEntity_LinkedProps();

		/**
		 * The meta object literal for the '{@link xenia.impl.InfoPropertyImpl <em>Info Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xenia.impl.InfoPropertyImpl
		 * @see xenia.impl.XeniaPackageImpl#getInfoProperty()
		 * @generated
		 */
		EClass INFO_PROPERTY = eINSTANCE.getInfoProperty();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_PROPERTY__PAGE = eINSTANCE.getInfoProperty_Page();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_PROPERTY__ENTITIES = eINSTANCE.getInfoProperty_Entities();

		/**
		 * The meta object literal for the '{@link xenia.impl.InfoEntityImpl <em>Info Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xenia.impl.InfoEntityImpl
		 * @see xenia.impl.XeniaPackageImpl#getInfoEntity()
		 * @generated
		 */
		EClass INFO_ENTITY = eINSTANCE.getInfoEntity();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_ENTITY__ENTRIES = eINSTANCE.getInfoEntity_Entries();

		/**
		 * The meta object literal for the '<em><b>Info Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_ENTITY__INFO_VALUE = eINSTANCE.getInfoEntity_InfoValue();

		/**
		 * The meta object literal for the '{@link xenia.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xenia.impl.SiteImpl
		 * @see xenia.impl.XeniaPackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '{@link xenia.impl.LinkedPropertyImpl <em>Linked Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xenia.impl.LinkedPropertyImpl
		 * @see xenia.impl.XeniaPackageImpl#getLinkedProperty()
		 * @generated
		 */
		EClass LINKED_PROPERTY = eINSTANCE.getLinkedProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKED_PROPERTY__NAME = eINSTANCE.getLinkedProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKED_PROPERTY__PAGE = eINSTANCE.getLinkedProperty_Page();

		/**
		 * The meta object literal for the '{@link xenia.impl.RedirectPageImpl <em>Redirect Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xenia.impl.RedirectPageImpl
		 * @see xenia.impl.XeniaPackageImpl#getRedirectPage()
		 * @generated
		 */
		EClass REDIRECT_PAGE = eINSTANCE.getRedirectPage();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDIRECT_PAGE__SITE = eINSTANCE.getRedirectPage_Site();

		/**
		 * The meta object literal for the '{@link xenia.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xenia.Mode
		 * @see xenia.impl.XeniaPackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '{@link xenia.InfoEntry <em>Info Entry</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xenia.InfoEntry
		 * @see xenia.impl.XeniaPackageImpl#getInfoEntry()
		 * @generated
		 */
		EEnum INFO_ENTRY = eINSTANCE.getInfoEntry();

	}

} //XeniaPackage
