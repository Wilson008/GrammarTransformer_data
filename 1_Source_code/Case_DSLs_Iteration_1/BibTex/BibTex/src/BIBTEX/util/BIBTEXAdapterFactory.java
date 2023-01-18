/**
 */
package BIBTEX.util;

import BIBTEX.AbstractField;
import BIBTEX.Address;
import BIBTEX.Annote;
import BIBTEX.Article;
import BIBTEX.AuthorUrls;
import BIBTEX.Authors;
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
import BIBTEX.Entry;
import BIBTEX.Field;
import BIBTEX.Howpublished;
import BIBTEX.Inbook;
import BIBTEX.Incollection;
import BIBTEX.Inproceedings;
import BIBTEX.Institution;
import BIBTEX.Isbn;
import BIBTEX.Issn;
import BIBTEX.Journal;
import BIBTEX.LocatedElement;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BIBTEX.BIBTEXPackage
 * @generated
 */
public class BIBTEXAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BIBTEXPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIBTEXAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BIBTEXPackage.eINSTANCE;
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
	protected BIBTEXSwitch<Adapter> modelSwitch =
		new BIBTEXSwitch<Adapter>() {
			@Override
			public Adapter caseLocatedElement(LocatedElement object) {
				return createLocatedElementAdapter();
			}
			@Override
			public Adapter caseBibtex(Bibtex object) {
				return createBibtexAdapter();
			}
			@Override
			public Adapter caseEntry(Entry object) {
				return createEntryAdapter();
			}
			@Override
			public Adapter caseArticle(Article object) {
				return createArticleAdapter();
			}
			@Override
			public Adapter caseBook(Book object) {
				return createBookAdapter();
			}
			@Override
			public Adapter caseInbook(Inbook object) {
				return createInbookAdapter();
			}
			@Override
			public Adapter caseBooklet(Booklet object) {
				return createBookletAdapter();
			}
			@Override
			public Adapter caseInproceedings(Inproceedings object) {
				return createInproceedingsAdapter();
			}
			@Override
			public Adapter caseProceedings(Proceedings object) {
				return createProceedingsAdapter();
			}
			@Override
			public Adapter caseIncollection(Incollection object) {
				return createIncollectionAdapter();
			}
			@Override
			public Adapter caseTechreport(Techreport object) {
				return createTechreportAdapter();
			}
			@Override
			public Adapter casePhdThesis(PhdThesis object) {
				return createPhdThesisAdapter();
			}
			@Override
			public Adapter caseMastersThesis(MastersThesis object) {
				return createMastersThesisAdapter();
			}
			@Override
			public Adapter caseManual(Manual object) {
				return createManualAdapter();
			}
			@Override
			public Adapter caseMisc(Misc object) {
				return createMiscAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseAuthors(Authors object) {
				return createAuthorsAdapter();
			}
			@Override
			public Adapter caseAuthorUrls(AuthorUrls object) {
				return createAuthorUrlsAdapter();
			}
			@Override
			public Adapter caseTitle(Title object) {
				return createTitleAdapter();
			}
			@Override
			public Adapter caseJournal(Journal object) {
				return createJournalAdapter();
			}
			@Override
			public Adapter caseBookTitle(BookTitle object) {
				return createBookTitleAdapter();
			}
			@Override
			public Adapter caseInstitution(Institution object) {
				return createInstitutionAdapter();
			}
			@Override
			public Adapter caseOrganization(Organization object) {
				return createOrganizationAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseDay(Day object) {
				return createDayAdapter();
			}
			@Override
			public Adapter caseNumber(BIBTEX.Number object) {
				return createNumberAdapter();
			}
			@Override
			public Adapter caseChapter(Chapter object) {
				return createChapterAdapter();
			}
			@Override
			public Adapter caseVolume(Volume object) {
				return createVolumeAdapter();
			}
			@Override
			public Adapter caseSeries(Series object) {
				return createSeriesAdapter();
			}
			@Override
			public Adapter casePages(Pages object) {
				return createPagesAdapter();
			}
			@Override
			public Adapter casePublisher(Publisher object) {
				return createPublisherAdapter();
			}
			@Override
			public Adapter caseHowpublished(Howpublished object) {
				return createHowpublishedAdapter();
			}
			@Override
			public Adapter caseSchool(School object) {
				return createSchoolAdapter();
			}
			@Override
			public Adapter caseEditor(Editor object) {
				return createEditorAdapter();
			}
			@Override
			public Adapter caseEdition(Edition object) {
				return createEditionAdapter();
			}
			@Override
			public Adapter caseAddress(Address object) {
				return createAddressAdapter();
			}
			@Override
			public Adapter caseYear(Year object) {
				return createYearAdapter();
			}
			@Override
			public Adapter caseMonth(Month object) {
				return createMonthAdapter();
			}
			@Override
			public Adapter caseNote(Note object) {
				return createNoteAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseAbstractField(AbstractField object) {
				return createAbstractFieldAdapter();
			}
			@Override
			public Adapter caseIsbn(Isbn object) {
				return createIsbnAdapter();
			}
			@Override
			public Adapter caseIssn(Issn object) {
				return createIssnAdapter();
			}
			@Override
			public Adapter caseUrl(Url object) {
				return createUrlAdapter();
			}
			@Override
			public Adapter caseDoi(Doi object) {
				return createDoiAdapter();
			}
			@Override
			public Adapter caseConference(Conference object) {
				return createConferenceAdapter();
			}
			@Override
			public Adapter caseUnpublished(Unpublished object) {
				return createUnpublishedAdapter();
			}
			@Override
			public Adapter caseAnnote(Annote object) {
				return createAnnoteAdapter();
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
	 * Creates a new adapter for an object of class '{@link BIBTEX.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.LocatedElement
	 * @generated
	 */
	public Adapter createLocatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Bibtex <em>Bibtex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Bibtex
	 * @generated
	 */
	public Adapter createBibtexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Entry
	 * @generated
	 */
	public Adapter createEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Article
	 * @generated
	 */
	public Adapter createArticleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Book
	 * @generated
	 */
	public Adapter createBookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Inbook <em>Inbook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Inbook
	 * @generated
	 */
	public Adapter createInbookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Booklet <em>Booklet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Booklet
	 * @generated
	 */
	public Adapter createBookletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Inproceedings <em>Inproceedings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Inproceedings
	 * @generated
	 */
	public Adapter createInproceedingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Proceedings <em>Proceedings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Proceedings
	 * @generated
	 */
	public Adapter createProceedingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Incollection <em>Incollection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Incollection
	 * @generated
	 */
	public Adapter createIncollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Techreport <em>Techreport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Techreport
	 * @generated
	 */
	public Adapter createTechreportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.PhdThesis <em>Phd Thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.PhdThesis
	 * @generated
	 */
	public Adapter createPhdThesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.MastersThesis <em>Masters Thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.MastersThesis
	 * @generated
	 */
	public Adapter createMastersThesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Manual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Manual
	 * @generated
	 */
	public Adapter createManualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Misc <em>Misc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Misc
	 * @generated
	 */
	public Adapter createMiscAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Authors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Authors
	 * @generated
	 */
	public Adapter createAuthorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.AuthorUrls <em>Author Urls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.AuthorUrls
	 * @generated
	 */
	public Adapter createAuthorUrlsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Title
	 * @generated
	 */
	public Adapter createTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Journal <em>Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Journal
	 * @generated
	 */
	public Adapter createJournalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.BookTitle <em>Book Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.BookTitle
	 * @generated
	 */
	public Adapter createBookTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Institution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Institution
	 * @generated
	 */
	public Adapter createInstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Day
	 * @generated
	 */
	public Adapter createDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Chapter <em>Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Chapter
	 * @generated
	 */
	public Adapter createChapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Volume
	 * @generated
	 */
	public Adapter createVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Series <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Series
	 * @generated
	 */
	public Adapter createSeriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Pages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Pages
	 * @generated
	 */
	public Adapter createPagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Publisher
	 * @generated
	 */
	public Adapter createPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Howpublished <em>Howpublished</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Howpublished
	 * @generated
	 */
	public Adapter createHowpublishedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.School <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.School
	 * @generated
	 */
	public Adapter createSchoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Editor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Editor
	 * @generated
	 */
	public Adapter createEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Edition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Edition
	 * @generated
	 */
	public Adapter createEditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Year
	 * @generated
	 */
	public Adapter createYearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Month <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Month
	 * @generated
	 */
	public Adapter createMonthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Note
	 * @generated
	 */
	public Adapter createNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.AbstractField <em>Abstract Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.AbstractField
	 * @generated
	 */
	public Adapter createAbstractFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Isbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Isbn
	 * @generated
	 */
	public Adapter createIsbnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Issn <em>Issn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Issn
	 * @generated
	 */
	public Adapter createIssnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Url <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Url
	 * @generated
	 */
	public Adapter createUrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Doi <em>Doi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Doi
	 * @generated
	 */
	public Adapter createDoiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Conference <em>Conference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Conference
	 * @generated
	 */
	public Adapter createConferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Unpublished <em>Unpublished</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Unpublished
	 * @generated
	 */
	public Adapter createUnpublishedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIBTEX.Annote <em>Annote</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIBTEX.Annote
	 * @generated
	 */
	public Adapter createAnnoteAdapter() {
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

} //BIBTEXAdapterFactory
