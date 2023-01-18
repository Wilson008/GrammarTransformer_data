/**
 */
package BIBTEX;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import BIBTEX.impl.BIBTEXPackageImpl;

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
 * @see BIBTEX.BIBTEXFactory
 * @model kind="package"
 * @generated
 */
public interface BIBTEXPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BIBTEX";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bibtex.ecore/bibtex";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bibtex";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BIBTEXPackage eINSTANCE = BIBTEXPackageImpl.init();

	/**
	 * The meta object id for the '{@link BIBTEX.impl.LocatedElementImpl <em>Located Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.LocatedElementImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getLocatedElement()
	 * @generated
	 */
	int LOCATED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__COMMENTS_BEFORE = 1;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__COMMENTS_AFTER = 2;

	/**
	 * The number of structural features of the '<em>Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.BibtexImpl <em>Bibtex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.BibtexImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getBibtex()
	 * @generated
	 */
	int BIBTEX = 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBTEX__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Bibtex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBTEX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bibtex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBTEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.EntryImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__KEY = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__FIELDS = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.ArticleImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__LOCATION = ENTRY__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__COMMENTS_BEFORE = ENTRY__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__COMMENTS_AFTER = ENTRY__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__KEY = ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__FIELDS = ENTRY__FIELDS;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.BookImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__LOCATION = ENTRY__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__COMMENTS_BEFORE = ENTRY__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__COMMENTS_AFTER = ENTRY__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__KEY = ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__FIELDS = ENTRY__FIELDS;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.InbookImpl <em>Inbook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.InbookImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getInbook()
	 * @generated
	 */
	int INBOOK = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK__LOCATION = ENTRY__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK__COMMENTS_BEFORE = ENTRY__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK__COMMENTS_AFTER = ENTRY__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK__KEY = ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK__FIELDS = ENTRY__FIELDS;

	/**
	 * The number of structural features of the '<em>Inbook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inbook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.BookletImpl <em>Booklet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.BookletImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getBooklet()
	 * @generated
	 */
	int BOOKLET = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKLET__LOCATION = ENTRY__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKLET__COMMENTS_BEFORE = ENTRY__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKLET__COMMENTS_AFTER = ENTRY__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKLET__KEY = ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKLET__FIELDS = ENTRY__FIELDS;

	/**
	 * The number of structural features of the '<em>Booklet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKLET_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Booklet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKLET_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.InproceedingsImpl <em>Inproceedings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.InproceedingsImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getInproceedings()
	 * @generated
	 */
	int INPROCEEDINGS = 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROCEEDINGS__LOCATION = ENTRY__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROCEEDINGS__COMMENTS_BEFORE = ENTRY__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROCEEDINGS__COMMENTS_AFTER = ENTRY__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROCEEDINGS__KEY = ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROCEEDINGS__FIELDS = ENTRY__FIELDS;

	/**
	 * The number of structural features of the '<em>Inproceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROCEEDINGS_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inproceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROCEEDINGS_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.ProceedingsImpl <em>Proceedings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.ProceedingsImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getProceedings()
	 * @generated
	 */
	int PROCEEDINGS = 8;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS__LOCATION = ENTRY__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS__COMMENTS_BEFORE = ENTRY__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS__COMMENTS_AFTER = ENTRY__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS__KEY = ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS__FIELDS = ENTRY__FIELDS;

	/**
	 * The number of structural features of the '<em>Proceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.IncollectionImpl <em>Incollection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.IncollectionImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getIncollection()
	 * @generated
	 */
	int INCOLLECTION = 9;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION__LOCATION = ENTRY__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION__COMMENTS_BEFORE = ENTRY__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION__COMMENTS_AFTER = ENTRY__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION__KEY = ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION__FIELDS = ENTRY__FIELDS;

	/**
	 * The number of structural features of the '<em>Incollection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Incollection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.TechreportImpl <em>Techreport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.TechreportImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getTechreport()
	 * @generated
	 */
	int TECHREPORT = 10;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHREPORT__LOCATION = ENTRY__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHREPORT__COMMENTS_BEFORE = ENTRY__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHREPORT__COMMENTS_AFTER = ENTRY__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHREPORT__KEY = ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHREPORT__FIELDS = ENTRY__FIELDS;

	/**
	 * The number of structural features of the '<em>Techreport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHREPORT_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Techreport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHREPORT_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.PhdThesisImpl <em>Phd Thesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.PhdThesisImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getPhdThesis()
	 * @generated
	 */
	int PHD_THESIS = 11;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHD_THESIS__LOCATION = ENTRY__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHD_THESIS__COMMENTS_BEFORE = ENTRY__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHD_THESIS__COMMENTS_AFTER = ENTRY__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHD_THESIS__KEY = ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHD_THESIS__FIELDS = ENTRY__FIELDS;

	/**
	 * The number of structural features of the '<em>Phd Thesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHD_THESIS_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Phd Thesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHD_THESIS_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.MastersThesisImpl <em>Masters Thesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.MastersThesisImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getMastersThesis()
	 * @generated
	 */
	int MASTERS_THESIS = 12;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERS_THESIS__LOCATION = ENTRY__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERS_THESIS__COMMENTS_BEFORE = ENTRY__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERS_THESIS__COMMENTS_AFTER = ENTRY__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERS_THESIS__KEY = ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERS_THESIS__FIELDS = ENTRY__FIELDS;

	/**
	 * The number of structural features of the '<em>Masters Thesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERS_THESIS_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Masters Thesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERS_THESIS_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.ManualImpl <em>Manual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.ManualImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getManual()
	 * @generated
	 */
	int MANUAL = 13;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__LOCATION = ENTRY__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__COMMENTS_BEFORE = ENTRY__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__COMMENTS_AFTER = ENTRY__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__KEY = ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__FIELDS = ENTRY__FIELDS;

	/**
	 * The number of structural features of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.MiscImpl <em>Misc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.MiscImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getMisc()
	 * @generated
	 */
	int MISC = 14;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC__LOCATION = ENTRY__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC__COMMENTS_BEFORE = ENTRY__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC__COMMENTS_AFTER = ENTRY__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC__KEY = ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC__FIELDS = ENTRY__FIELDS;

	/**
	 * The number of structural features of the '<em>Misc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Misc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.FieldImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.AuthorsImpl <em>Authors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.AuthorsImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getAuthors()
	 * @generated
	 */
	int AUTHORS = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Authors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Authors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.AuthorUrlsImpl <em>Author Urls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.AuthorUrlsImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getAuthorUrls()
	 * @generated
	 */
	int AUTHOR_URLS = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_URLS__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Author Urls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_URLS_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Author Urls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_URLS_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.TitleImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.JournalImpl <em>Journal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.JournalImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getJournal()
	 * @generated
	 */
	int JOURNAL = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Journal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Journal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.BookTitleImpl <em>Book Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.BookTitleImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getBookTitle()
	 * @generated
	 */
	int BOOK_TITLE = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TITLE__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Book Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TITLE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Book Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TITLE_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.InstitutionImpl <em>Institution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.InstitutionImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getInstitution()
	 * @generated
	 */
	int INSTITUTION = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Institution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Institution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.OrganizationImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.TypeImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.DayImpl <em>Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.DayImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getDay()
	 * @generated
	 */
	int DAY = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.NumberImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.ChapterImpl <em>Chapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.ChapterImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getChapter()
	 * @generated
	 */
	int CHAPTER = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Chapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.VolumeImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.SeriesImpl <em>Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.SeriesImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getSeries()
	 * @generated
	 */
	int SERIES = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.PagesImpl <em>Pages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.PagesImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getPages()
	 * @generated
	 */
	int PAGES = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGES__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Pages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGES_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGES_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.PublisherImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.HowpublishedImpl <em>Howpublished</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.HowpublishedImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getHowpublished()
	 * @generated
	 */
	int HOWPUBLISHED = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOWPUBLISHED__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Howpublished</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOWPUBLISHED_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Howpublished</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOWPUBLISHED_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.SchoolImpl <em>School</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.SchoolImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getSchool()
	 * @generated
	 */
	int SCHOOL = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.EditorImpl <em>Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.EditorImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getEditor()
	 * @generated
	 */
	int EDITOR = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.EditionImpl <em>Edition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.EditionImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getEdition()
	 * @generated
	 */
	int EDITION = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.AddressImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.YearImpl <em>Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.YearImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getYear()
	 * @generated
	 */
	int YEAR = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.MonthImpl <em>Month</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.MonthImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getMonth()
	 * @generated
	 */
	int MONTH = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.NoteImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.TextImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.AbstractFieldImpl <em>Abstract Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.AbstractFieldImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getAbstractField()
	 * @generated
	 */
	int ABSTRACT_FIELD = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIELD__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Abstract Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.IsbnImpl <em>Isbn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.IsbnImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getIsbn()
	 * @generated
	 */
	int ISBN = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISBN__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Isbn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISBN_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Isbn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISBN_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.IssnImpl <em>Issn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.IssnImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getIssn()
	 * @generated
	 */
	int ISSN = 42;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSN__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Issn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSN_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Issn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSN_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.UrlImpl <em>Url</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.UrlImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getUrl()
	 * @generated
	 */
	int URL = 43;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.DoiImpl <em>Doi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.DoiImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getDoi()
	 * @generated
	 */
	int DOI = 44;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOI__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Doi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOI_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Doi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOI_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link BIBTEX.impl.ConferenceImpl <em>Conference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.ConferenceImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getConference()
	 * @generated
	 */
	int CONFERENCE = 45;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__LOCATION = ENTRY__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__COMMENTS_BEFORE = ENTRY__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__COMMENTS_AFTER = ENTRY__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__KEY = ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__FIELDS = ENTRY__FIELDS;

	/**
	 * The number of structural features of the '<em>Conference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.UnpublishedImpl <em>Unpublished</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.UnpublishedImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getUnpublished()
	 * @generated
	 */
	int UNPUBLISHED = 46;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED__LOCATION = ENTRY__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED__COMMENTS_BEFORE = ENTRY__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED__COMMENTS_AFTER = ENTRY__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED__KEY = ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED__FIELDS = ENTRY__FIELDS;

	/**
	 * The number of structural features of the '<em>Unpublished</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unpublished</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIBTEX.impl.AnnoteImpl <em>Annote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIBTEX.impl.AnnoteImpl
	 * @see BIBTEX.impl.BIBTEXPackageImpl#getAnnote()
	 * @generated
	 */
	int ANNOTE = 47;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTE__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Annote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Annote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTE_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link BIBTEX.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Element</em>'.
	 * @see BIBTEX.LocatedElement
	 * @generated
	 */
	EClass getLocatedElement();

	/**
	 * Returns the meta object for the attribute '{@link BIBTEX.LocatedElement#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see BIBTEX.LocatedElement#getLocation()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_Location();

	/**
	 * Returns the meta object for the attribute list '{@link BIBTEX.LocatedElement#getCommentsBefore <em>Comments Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments Before</em>'.
	 * @see BIBTEX.LocatedElement#getCommentsBefore()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_CommentsBefore();

	/**
	 * Returns the meta object for the attribute list '{@link BIBTEX.LocatedElement#getCommentsAfter <em>Comments After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments After</em>'.
	 * @see BIBTEX.LocatedElement#getCommentsAfter()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_CommentsAfter();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Bibtex <em>Bibtex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bibtex</em>'.
	 * @see BIBTEX.Bibtex
	 * @generated
	 */
	EClass getBibtex();

	/**
	 * Returns the meta object for the containment reference list '{@link BIBTEX.Bibtex#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see BIBTEX.Bibtex#getEntries()
	 * @see #getBibtex()
	 * @generated
	 */
	EReference getBibtex_Entries();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see BIBTEX.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link BIBTEX.Entry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see BIBTEX.Entry#getKey()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link BIBTEX.Entry#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see BIBTEX.Entry#getFields()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Fields();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see BIBTEX.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see BIBTEX.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Inbook <em>Inbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inbook</em>'.
	 * @see BIBTEX.Inbook
	 * @generated
	 */
	EClass getInbook();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Booklet <em>Booklet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booklet</em>'.
	 * @see BIBTEX.Booklet
	 * @generated
	 */
	EClass getBooklet();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Inproceedings <em>Inproceedings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inproceedings</em>'.
	 * @see BIBTEX.Inproceedings
	 * @generated
	 */
	EClass getInproceedings();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Proceedings <em>Proceedings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proceedings</em>'.
	 * @see BIBTEX.Proceedings
	 * @generated
	 */
	EClass getProceedings();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Incollection <em>Incollection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incollection</em>'.
	 * @see BIBTEX.Incollection
	 * @generated
	 */
	EClass getIncollection();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Techreport <em>Techreport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Techreport</em>'.
	 * @see BIBTEX.Techreport
	 * @generated
	 */
	EClass getTechreport();

	/**
	 * Returns the meta object for class '{@link BIBTEX.PhdThesis <em>Phd Thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phd Thesis</em>'.
	 * @see BIBTEX.PhdThesis
	 * @generated
	 */
	EClass getPhdThesis();

	/**
	 * Returns the meta object for class '{@link BIBTEX.MastersThesis <em>Masters Thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Masters Thesis</em>'.
	 * @see BIBTEX.MastersThesis
	 * @generated
	 */
	EClass getMastersThesis();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Manual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual</em>'.
	 * @see BIBTEX.Manual
	 * @generated
	 */
	EClass getManual();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Misc <em>Misc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Misc</em>'.
	 * @see BIBTEX.Misc
	 * @generated
	 */
	EClass getMisc();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see BIBTEX.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link BIBTEX.Field#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see BIBTEX.Field#getValue()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Value();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Authors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authors</em>'.
	 * @see BIBTEX.Authors
	 * @generated
	 */
	EClass getAuthors();

	/**
	 * Returns the meta object for class '{@link BIBTEX.AuthorUrls <em>Author Urls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author Urls</em>'.
	 * @see BIBTEX.AuthorUrls
	 * @generated
	 */
	EClass getAuthorUrls();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see BIBTEX.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Journal <em>Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journal</em>'.
	 * @see BIBTEX.Journal
	 * @generated
	 */
	EClass getJournal();

	/**
	 * Returns the meta object for class '{@link BIBTEX.BookTitle <em>Book Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Title</em>'.
	 * @see BIBTEX.BookTitle
	 * @generated
	 */
	EClass getBookTitle();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Institution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Institution</em>'.
	 * @see BIBTEX.Institution
	 * @generated
	 */
	EClass getInstitution();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see BIBTEX.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see BIBTEX.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day</em>'.
	 * @see BIBTEX.Day
	 * @generated
	 */
	EClass getDay();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see BIBTEX.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Chapter <em>Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chapter</em>'.
	 * @see BIBTEX.Chapter
	 * @generated
	 */
	EClass getChapter();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see BIBTEX.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Series <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Series</em>'.
	 * @see BIBTEX.Series
	 * @generated
	 */
	EClass getSeries();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Pages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pages</em>'.
	 * @see BIBTEX.Pages
	 * @generated
	 */
	EClass getPages();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see BIBTEX.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Howpublished <em>Howpublished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Howpublished</em>'.
	 * @see BIBTEX.Howpublished
	 * @generated
	 */
	EClass getHowpublished();

	/**
	 * Returns the meta object for class '{@link BIBTEX.School <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>School</em>'.
	 * @see BIBTEX.School
	 * @generated
	 */
	EClass getSchool();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Editor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor</em>'.
	 * @see BIBTEX.Editor
	 * @generated
	 */
	EClass getEditor();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Edition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edition</em>'.
	 * @see BIBTEX.Edition
	 * @generated
	 */
	EClass getEdition();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see BIBTEX.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year</em>'.
	 * @see BIBTEX.Year
	 * @generated
	 */
	EClass getYear();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Month <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Month</em>'.
	 * @see BIBTEX.Month
	 * @generated
	 */
	EClass getMonth();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see BIBTEX.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see BIBTEX.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link BIBTEX.AbstractField <em>Abstract Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Field</em>'.
	 * @see BIBTEX.AbstractField
	 * @generated
	 */
	EClass getAbstractField();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Isbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Isbn</em>'.
	 * @see BIBTEX.Isbn
	 * @generated
	 */
	EClass getIsbn();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Issn <em>Issn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issn</em>'.
	 * @see BIBTEX.Issn
	 * @generated
	 */
	EClass getIssn();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Url <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url</em>'.
	 * @see BIBTEX.Url
	 * @generated
	 */
	EClass getUrl();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Doi <em>Doi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doi</em>'.
	 * @see BIBTEX.Doi
	 * @generated
	 */
	EClass getDoi();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Conference <em>Conference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference</em>'.
	 * @see BIBTEX.Conference
	 * @generated
	 */
	EClass getConference();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Unpublished <em>Unpublished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unpublished</em>'.
	 * @see BIBTEX.Unpublished
	 * @generated
	 */
	EClass getUnpublished();

	/**
	 * Returns the meta object for class '{@link BIBTEX.Annote <em>Annote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annote</em>'.
	 * @see BIBTEX.Annote
	 * @generated
	 */
	EClass getAnnote();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BIBTEXFactory getBIBTEXFactory();

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
		 * The meta object literal for the '{@link BIBTEX.impl.LocatedElementImpl <em>Located Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.LocatedElementImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getLocatedElement()
		 * @generated
		 */
		EClass LOCATED_ELEMENT = eINSTANCE.getLocatedElement();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__LOCATION = eINSTANCE.getLocatedElement_Location();

		/**
		 * The meta object literal for the '<em><b>Comments Before</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__COMMENTS_BEFORE = eINSTANCE.getLocatedElement_CommentsBefore();

		/**
		 * The meta object literal for the '<em><b>Comments After</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__COMMENTS_AFTER = eINSTANCE.getLocatedElement_CommentsAfter();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.BibtexImpl <em>Bibtex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.BibtexImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getBibtex()
		 * @generated
		 */
		EClass BIBTEX = eINSTANCE.getBibtex();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBTEX__ENTRIES = eINSTANCE.getBibtex_Entries();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.EntryImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__KEY = eINSTANCE.getEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__FIELDS = eINSTANCE.getEntry_Fields();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.ArticleImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.BookImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.InbookImpl <em>Inbook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.InbookImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getInbook()
		 * @generated
		 */
		EClass INBOOK = eINSTANCE.getInbook();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.BookletImpl <em>Booklet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.BookletImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getBooklet()
		 * @generated
		 */
		EClass BOOKLET = eINSTANCE.getBooklet();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.InproceedingsImpl <em>Inproceedings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.InproceedingsImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getInproceedings()
		 * @generated
		 */
		EClass INPROCEEDINGS = eINSTANCE.getInproceedings();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.ProceedingsImpl <em>Proceedings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.ProceedingsImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getProceedings()
		 * @generated
		 */
		EClass PROCEEDINGS = eINSTANCE.getProceedings();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.IncollectionImpl <em>Incollection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.IncollectionImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getIncollection()
		 * @generated
		 */
		EClass INCOLLECTION = eINSTANCE.getIncollection();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.TechreportImpl <em>Techreport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.TechreportImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getTechreport()
		 * @generated
		 */
		EClass TECHREPORT = eINSTANCE.getTechreport();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.PhdThesisImpl <em>Phd Thesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.PhdThesisImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getPhdThesis()
		 * @generated
		 */
		EClass PHD_THESIS = eINSTANCE.getPhdThesis();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.MastersThesisImpl <em>Masters Thesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.MastersThesisImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getMastersThesis()
		 * @generated
		 */
		EClass MASTERS_THESIS = eINSTANCE.getMastersThesis();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.ManualImpl <em>Manual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.ManualImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getManual()
		 * @generated
		 */
		EClass MANUAL = eINSTANCE.getManual();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.MiscImpl <em>Misc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.MiscImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getMisc()
		 * @generated
		 */
		EClass MISC = eINSTANCE.getMisc();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.FieldImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__VALUE = eINSTANCE.getField_Value();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.AuthorsImpl <em>Authors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.AuthorsImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getAuthors()
		 * @generated
		 */
		EClass AUTHORS = eINSTANCE.getAuthors();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.AuthorUrlsImpl <em>Author Urls</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.AuthorUrlsImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getAuthorUrls()
		 * @generated
		 */
		EClass AUTHOR_URLS = eINSTANCE.getAuthorUrls();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.TitleImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.JournalImpl <em>Journal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.JournalImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getJournal()
		 * @generated
		 */
		EClass JOURNAL = eINSTANCE.getJournal();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.BookTitleImpl <em>Book Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.BookTitleImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getBookTitle()
		 * @generated
		 */
		EClass BOOK_TITLE = eINSTANCE.getBookTitle();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.InstitutionImpl <em>Institution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.InstitutionImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getInstitution()
		 * @generated
		 */
		EClass INSTITUTION = eINSTANCE.getInstitution();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.OrganizationImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.TypeImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.DayImpl <em>Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.DayImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getDay()
		 * @generated
		 */
		EClass DAY = eINSTANCE.getDay();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.NumberImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.ChapterImpl <em>Chapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.ChapterImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getChapter()
		 * @generated
		 */
		EClass CHAPTER = eINSTANCE.getChapter();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.VolumeImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.SeriesImpl <em>Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.SeriesImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getSeries()
		 * @generated
		 */
		EClass SERIES = eINSTANCE.getSeries();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.PagesImpl <em>Pages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.PagesImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getPages()
		 * @generated
		 */
		EClass PAGES = eINSTANCE.getPages();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.PublisherImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.HowpublishedImpl <em>Howpublished</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.HowpublishedImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getHowpublished()
		 * @generated
		 */
		EClass HOWPUBLISHED = eINSTANCE.getHowpublished();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.SchoolImpl <em>School</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.SchoolImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getSchool()
		 * @generated
		 */
		EClass SCHOOL = eINSTANCE.getSchool();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.EditorImpl <em>Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.EditorImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getEditor()
		 * @generated
		 */
		EClass EDITOR = eINSTANCE.getEditor();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.EditionImpl <em>Edition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.EditionImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getEdition()
		 * @generated
		 */
		EClass EDITION = eINSTANCE.getEdition();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.AddressImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.YearImpl <em>Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.YearImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getYear()
		 * @generated
		 */
		EClass YEAR = eINSTANCE.getYear();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.MonthImpl <em>Month</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.MonthImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getMonth()
		 * @generated
		 */
		EClass MONTH = eINSTANCE.getMonth();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.NoteImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.TextImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.AbstractFieldImpl <em>Abstract Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.AbstractFieldImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getAbstractField()
		 * @generated
		 */
		EClass ABSTRACT_FIELD = eINSTANCE.getAbstractField();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.IsbnImpl <em>Isbn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.IsbnImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getIsbn()
		 * @generated
		 */
		EClass ISBN = eINSTANCE.getIsbn();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.IssnImpl <em>Issn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.IssnImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getIssn()
		 * @generated
		 */
		EClass ISSN = eINSTANCE.getIssn();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.UrlImpl <em>Url</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.UrlImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getUrl()
		 * @generated
		 */
		EClass URL = eINSTANCE.getUrl();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.DoiImpl <em>Doi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.DoiImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getDoi()
		 * @generated
		 */
		EClass DOI = eINSTANCE.getDoi();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.ConferenceImpl <em>Conference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.ConferenceImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getConference()
		 * @generated
		 */
		EClass CONFERENCE = eINSTANCE.getConference();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.UnpublishedImpl <em>Unpublished</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.UnpublishedImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getUnpublished()
		 * @generated
		 */
		EClass UNPUBLISHED = eINSTANCE.getUnpublished();

		/**
		 * The meta object literal for the '{@link BIBTEX.impl.AnnoteImpl <em>Annote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIBTEX.impl.AnnoteImpl
		 * @see BIBTEX.impl.BIBTEXPackageImpl#getAnnote()
		 * @generated
		 */
		EClass ANNOTE = eINSTANCE.getAnnote();

	}

} //BIBTEXPackage
