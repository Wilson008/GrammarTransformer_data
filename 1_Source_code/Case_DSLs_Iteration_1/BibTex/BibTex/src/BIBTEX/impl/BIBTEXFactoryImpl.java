/**
 */
package BIBTEX.impl;

import BIBTEX.AbstractField;
import BIBTEX.Address;
import BIBTEX.Annote;
import BIBTEX.Article;
import BIBTEX.AuthorUrls;
import BIBTEX.Authors;
import BIBTEX.BIBTEXFactory;
import BIBTEX.BIBTEXPackage;
import BIBTEX.Bibtex;
import BIBTEX.Book;
import BIBTEX.BookTitle;
import BIBTEX.Booklet;
import BIBTEX.Chapter;
import BIBTEX.Conference;
import BIBTEX.Day;
import BIBTEX.Doi;
import BIBTEX.Edition;
import BIBTEX.Editor;
import BIBTEX.Howpublished;
import BIBTEX.Inbook;
import BIBTEX.Incollection;
import BIBTEX.Inproceedings;
import BIBTEX.Institution;
import BIBTEX.Isbn;
import BIBTEX.Issn;
import BIBTEX.Journal;
import BIBTEX.Manual;
import BIBTEX.MastersThesis;
import BIBTEX.Misc;
import BIBTEX.Month;
import BIBTEX.Note;
import BIBTEX.Organization;
import BIBTEX.Pages;
import BIBTEX.PhdThesis;
import BIBTEX.Proceedings;
import BIBTEX.Publisher;
import BIBTEX.School;
import BIBTEX.Series;
import BIBTEX.Techreport;
import BIBTEX.Text;
import BIBTEX.Title;
import BIBTEX.Type;
import BIBTEX.Unpublished;
import BIBTEX.Url;
import BIBTEX.Volume;
import BIBTEX.Year;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BIBTEXFactoryImpl extends EFactoryImpl implements BIBTEXFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BIBTEXFactory init() {
		try {
			BIBTEXFactory theBIBTEXFactory = (BIBTEXFactory)EPackage.Registry.INSTANCE.getEFactory(BIBTEXPackage.eNS_URI);
			if (theBIBTEXFactory != null) {
				return theBIBTEXFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BIBTEXFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIBTEXFactoryImpl() {
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
			case BIBTEXPackage.BIBTEX: return createBibtex();
			case BIBTEXPackage.ARTICLE: return createArticle();
			case BIBTEXPackage.BOOK: return createBook();
			case BIBTEXPackage.INBOOK: return createInbook();
			case BIBTEXPackage.BOOKLET: return createBooklet();
			case BIBTEXPackage.INPROCEEDINGS: return createInproceedings();
			case BIBTEXPackage.PROCEEDINGS: return createProceedings();
			case BIBTEXPackage.INCOLLECTION: return createIncollection();
			case BIBTEXPackage.TECHREPORT: return createTechreport();
			case BIBTEXPackage.PHD_THESIS: return createPhdThesis();
			case BIBTEXPackage.MASTERS_THESIS: return createMastersThesis();
			case BIBTEXPackage.MANUAL: return createManual();
			case BIBTEXPackage.MISC: return createMisc();
			case BIBTEXPackage.AUTHORS: return createAuthors();
			case BIBTEXPackage.AUTHOR_URLS: return createAuthorUrls();
			case BIBTEXPackage.TITLE: return createTitle();
			case BIBTEXPackage.JOURNAL: return createJournal();
			case BIBTEXPackage.BOOK_TITLE: return createBookTitle();
			case BIBTEXPackage.INSTITUTION: return createInstitution();
			case BIBTEXPackage.ORGANIZATION: return createOrganization();
			case BIBTEXPackage.TYPE: return createType();
			case BIBTEXPackage.DAY: return createDay();
			case BIBTEXPackage.NUMBER: return createNumber();
			case BIBTEXPackage.CHAPTER: return createChapter();
			case BIBTEXPackage.VOLUME: return createVolume();
			case BIBTEXPackage.SERIES: return createSeries();
			case BIBTEXPackage.PAGES: return createPages();
			case BIBTEXPackage.PUBLISHER: return createPublisher();
			case BIBTEXPackage.HOWPUBLISHED: return createHowpublished();
			case BIBTEXPackage.SCHOOL: return createSchool();
			case BIBTEXPackage.EDITOR: return createEditor();
			case BIBTEXPackage.EDITION: return createEdition();
			case BIBTEXPackage.ADDRESS: return createAddress();
			case BIBTEXPackage.YEAR: return createYear();
			case BIBTEXPackage.MONTH: return createMonth();
			case BIBTEXPackage.NOTE: return createNote();
			case BIBTEXPackage.TEXT: return createText();
			case BIBTEXPackage.ABSTRACT_FIELD: return createAbstractField();
			case BIBTEXPackage.ISBN: return createIsbn();
			case BIBTEXPackage.ISSN: return createIssn();
			case BIBTEXPackage.URL: return createUrl();
			case BIBTEXPackage.DOI: return createDoi();
			case BIBTEXPackage.CONFERENCE: return createConference();
			case BIBTEXPackage.UNPUBLISHED: return createUnpublished();
			case BIBTEXPackage.ANNOTE: return createAnnote();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bibtex createBibtex() {
		BibtexImpl bibtex = new BibtexImpl();
		return bibtex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Article createArticle() {
		ArticleImpl article = new ArticleImpl();
		return article;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book createBook() {
		BookImpl book = new BookImpl();
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inbook createInbook() {
		InbookImpl inbook = new InbookImpl();
		return inbook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booklet createBooklet() {
		BookletImpl booklet = new BookletImpl();
		return booklet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inproceedings createInproceedings() {
		InproceedingsImpl inproceedings = new InproceedingsImpl();
		return inproceedings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proceedings createProceedings() {
		ProceedingsImpl proceedings = new ProceedingsImpl();
		return proceedings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Incollection createIncollection() {
		IncollectionImpl incollection = new IncollectionImpl();
		return incollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Techreport createTechreport() {
		TechreportImpl techreport = new TechreportImpl();
		return techreport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhdThesis createPhdThesis() {
		PhdThesisImpl phdThesis = new PhdThesisImpl();
		return phdThesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MastersThesis createMastersThesis() {
		MastersThesisImpl mastersThesis = new MastersThesisImpl();
		return mastersThesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manual createManual() {
		ManualImpl manual = new ManualImpl();
		return manual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Misc createMisc() {
		MiscImpl misc = new MiscImpl();
		return misc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authors createAuthors() {
		AuthorsImpl authors = new AuthorsImpl();
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorUrls createAuthorUrls() {
		AuthorUrlsImpl authorUrls = new AuthorUrlsImpl();
		return authorUrls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Title createTitle() {
		TitleImpl title = new TitleImpl();
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Journal createJournal() {
		JournalImpl journal = new JournalImpl();
		return journal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookTitle createBookTitle() {
		BookTitleImpl bookTitle = new BookTitleImpl();
		return bookTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Institution createInstitution() {
		InstitutionImpl institution = new InstitutionImpl();
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Day createDay() {
		DayImpl day = new DayImpl();
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIBTEX.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chapter createChapter() {
		ChapterImpl chapter = new ChapterImpl();
		return chapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Series createSeries() {
		SeriesImpl series = new SeriesImpl();
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pages createPages() {
		PagesImpl pages = new PagesImpl();
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher createPublisher() {
		PublisherImpl publisher = new PublisherImpl();
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Howpublished createHowpublished() {
		HowpublishedImpl howpublished = new HowpublishedImpl();
		return howpublished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public School createSchool() {
		SchoolImpl school = new SchoolImpl();
		return school;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Editor createEditor() {
		EditorImpl editor = new EditorImpl();
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edition createEdition() {
		EditionImpl edition = new EditionImpl();
		return edition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year createYear() {
		YearImpl year = new YearImpl();
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Month createMonth() {
		MonthImpl month = new MonthImpl();
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractField createAbstractField() {
		AbstractFieldImpl abstractField = new AbstractFieldImpl();
		return abstractField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isbn createIsbn() {
		IsbnImpl isbn = new IsbnImpl();
		return isbn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issn createIssn() {
		IssnImpl issn = new IssnImpl();
		return issn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url createUrl() {
		UrlImpl url = new UrlImpl();
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doi createDoi() {
		DoiImpl doi = new DoiImpl();
		return doi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conference createConference() {
		ConferenceImpl conference = new ConferenceImpl();
		return conference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unpublished createUnpublished() {
		UnpublishedImpl unpublished = new UnpublishedImpl();
		return unpublished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annote createAnnote() {
		AnnoteImpl annote = new AnnoteImpl();
		return annote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIBTEXPackage getBIBTEXPackage() {
		return (BIBTEXPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BIBTEXPackage getPackage() {
		return BIBTEXPackage.eINSTANCE;
	}

} //BIBTEXFactoryImpl
