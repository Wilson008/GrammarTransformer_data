/**
 */
package BIBTEX.provider;

import BIBTEX.util.BIBTEXAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BIBTEXItemProviderAdapterFactory extends BIBTEXAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIBTEXItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Bibtex} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BibtexItemProvider bibtexItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Bibtex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBibtexAdapter() {
		if (bibtexItemProvider == null) {
			bibtexItemProvider = new BibtexItemProvider(this);
		}

		return bibtexItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Article} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArticleItemProvider articleItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Article}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArticleAdapter() {
		if (articleItemProvider == null) {
			articleItemProvider = new ArticleItemProvider(this);
		}

		return articleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Book} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookItemProvider bookItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Book}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBookAdapter() {
		if (bookItemProvider == null) {
			bookItemProvider = new BookItemProvider(this);
		}

		return bookItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Inbook} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InbookItemProvider inbookItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Inbook}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInbookAdapter() {
		if (inbookItemProvider == null) {
			inbookItemProvider = new InbookItemProvider(this);
		}

		return inbookItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Booklet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookletItemProvider bookletItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Booklet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBookletAdapter() {
		if (bookletItemProvider == null) {
			bookletItemProvider = new BookletItemProvider(this);
		}

		return bookletItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Inproceedings} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InproceedingsItemProvider inproceedingsItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Inproceedings}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInproceedingsAdapter() {
		if (inproceedingsItemProvider == null) {
			inproceedingsItemProvider = new InproceedingsItemProvider(this);
		}

		return inproceedingsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Proceedings} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProceedingsItemProvider proceedingsItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Proceedings}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProceedingsAdapter() {
		if (proceedingsItemProvider == null) {
			proceedingsItemProvider = new ProceedingsItemProvider(this);
		}

		return proceedingsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Incollection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncollectionItemProvider incollectionItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Incollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIncollectionAdapter() {
		if (incollectionItemProvider == null) {
			incollectionItemProvider = new IncollectionItemProvider(this);
		}

		return incollectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Techreport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechreportItemProvider techreportItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Techreport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTechreportAdapter() {
		if (techreportItemProvider == null) {
			techreportItemProvider = new TechreportItemProvider(this);
		}

		return techreportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.PhdThesis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhdThesisItemProvider phdThesisItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.PhdThesis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPhdThesisAdapter() {
		if (phdThesisItemProvider == null) {
			phdThesisItemProvider = new PhdThesisItemProvider(this);
		}

		return phdThesisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.MastersThesis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MastersThesisItemProvider mastersThesisItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.MastersThesis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMastersThesisAdapter() {
		if (mastersThesisItemProvider == null) {
			mastersThesisItemProvider = new MastersThesisItemProvider(this);
		}

		return mastersThesisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Manual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManualItemProvider manualItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Manual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createManualAdapter() {
		if (manualItemProvider == null) {
			manualItemProvider = new ManualItemProvider(this);
		}

		return manualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Misc} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiscItemProvider miscItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Misc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMiscAdapter() {
		if (miscItemProvider == null) {
			miscItemProvider = new MiscItemProvider(this);
		}

		return miscItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Authors} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorsItemProvider authorsItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Authors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAuthorsAdapter() {
		if (authorsItemProvider == null) {
			authorsItemProvider = new AuthorsItemProvider(this);
		}

		return authorsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.AuthorUrls} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorUrlsItemProvider authorUrlsItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.AuthorUrls}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAuthorUrlsAdapter() {
		if (authorUrlsItemProvider == null) {
			authorUrlsItemProvider = new AuthorUrlsItemProvider(this);
		}

		return authorUrlsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Title} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TitleItemProvider titleItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Title}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTitleAdapter() {
		if (titleItemProvider == null) {
			titleItemProvider = new TitleItemProvider(this);
		}

		return titleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Journal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JournalItemProvider journalItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Journal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJournalAdapter() {
		if (journalItemProvider == null) {
			journalItemProvider = new JournalItemProvider(this);
		}

		return journalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.BookTitle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookTitleItemProvider bookTitleItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.BookTitle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBookTitleAdapter() {
		if (bookTitleItemProvider == null) {
			bookTitleItemProvider = new BookTitleItemProvider(this);
		}

		return bookTitleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Institution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstitutionItemProvider institutionItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Institution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstitutionAdapter() {
		if (institutionItemProvider == null) {
			institutionItemProvider = new InstitutionItemProvider(this);
		}

		return institutionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Organization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationItemProvider organizationItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Organization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrganizationAdapter() {
		if (organizationItemProvider == null) {
			organizationItemProvider = new OrganizationItemProvider(this);
		}

		return organizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Type} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItemProvider typeItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeAdapter() {
		if (typeItemProvider == null) {
			typeItemProvider = new TypeItemProvider(this);
		}

		return typeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Day} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DayItemProvider dayItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Day}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDayAdapter() {
		if (dayItemProvider == null) {
			dayItemProvider = new DayItemProvider(this);
		}

		return dayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Number} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberItemProvider numberItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Number}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberAdapter() {
		if (numberItemProvider == null) {
			numberItemProvider = new NumberItemProvider(this);
		}

		return numberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Chapter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChapterItemProvider chapterItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Chapter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChapterAdapter() {
		if (chapterItemProvider == null) {
			chapterItemProvider = new ChapterItemProvider(this);
		}

		return chapterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Volume} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeItemProvider volumeItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVolumeAdapter() {
		if (volumeItemProvider == null) {
			volumeItemProvider = new VolumeItemProvider(this);
		}

		return volumeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Series} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeriesItemProvider seriesItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Series}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeriesAdapter() {
		if (seriesItemProvider == null) {
			seriesItemProvider = new SeriesItemProvider(this);
		}

		return seriesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Pages} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PagesItemProvider pagesItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Pages}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPagesAdapter() {
		if (pagesItemProvider == null) {
			pagesItemProvider = new PagesItemProvider(this);
		}

		return pagesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Publisher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublisherItemProvider publisherItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Publisher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPublisherAdapter() {
		if (publisherItemProvider == null) {
			publisherItemProvider = new PublisherItemProvider(this);
		}

		return publisherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Howpublished} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HowpublishedItemProvider howpublishedItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Howpublished}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHowpublishedAdapter() {
		if (howpublishedItemProvider == null) {
			howpublishedItemProvider = new HowpublishedItemProvider(this);
		}

		return howpublishedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.School} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolItemProvider schoolItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.School}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchoolAdapter() {
		if (schoolItemProvider == null) {
			schoolItemProvider = new SchoolItemProvider(this);
		}

		return schoolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Editor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditorItemProvider editorItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Editor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEditorAdapter() {
		if (editorItemProvider == null) {
			editorItemProvider = new EditorItemProvider(this);
		}

		return editorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Edition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditionItemProvider editionItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Edition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEditionAdapter() {
		if (editionItemProvider == null) {
			editionItemProvider = new EditionItemProvider(this);
		}

		return editionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Address} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressItemProvider addressItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddressAdapter() {
		if (addressItemProvider == null) {
			addressItemProvider = new AddressItemProvider(this);
		}

		return addressItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Year} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YearItemProvider yearItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Year}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createYearAdapter() {
		if (yearItemProvider == null) {
			yearItemProvider = new YearItemProvider(this);
		}

		return yearItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Month} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonthItemProvider monthItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Month}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMonthAdapter() {
		if (monthItemProvider == null) {
			monthItemProvider = new MonthItemProvider(this);
		}

		return monthItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Note} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteItemProvider noteItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Note}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNoteAdapter() {
		if (noteItemProvider == null) {
			noteItemProvider = new NoteItemProvider(this);
		}

		return noteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Text} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextItemProvider textItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextAdapter() {
		if (textItemProvider == null) {
			textItemProvider = new TextItemProvider(this);
		}

		return textItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.AbstractField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFieldItemProvider abstractFieldItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.AbstractField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbstractFieldAdapter() {
		if (abstractFieldItemProvider == null) {
			abstractFieldItemProvider = new AbstractFieldItemProvider(this);
		}

		return abstractFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Isbn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsbnItemProvider isbnItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Isbn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIsbnAdapter() {
		if (isbnItemProvider == null) {
			isbnItemProvider = new IsbnItemProvider(this);
		}

		return isbnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Issn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssnItemProvider issnItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Issn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIssnAdapter() {
		if (issnItemProvider == null) {
			issnItemProvider = new IssnItemProvider(this);
		}

		return issnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Url} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UrlItemProvider urlItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Url}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUrlAdapter() {
		if (urlItemProvider == null) {
			urlItemProvider = new UrlItemProvider(this);
		}

		return urlItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Doi} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoiItemProvider doiItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Doi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoiAdapter() {
		if (doiItemProvider == null) {
			doiItemProvider = new DoiItemProvider(this);
		}

		return doiItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Conference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConferenceItemProvider conferenceItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Conference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConferenceAdapter() {
		if (conferenceItemProvider == null) {
			conferenceItemProvider = new ConferenceItemProvider(this);
		}

		return conferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Unpublished} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnpublishedItemProvider unpublishedItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Unpublished}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnpublishedAdapter() {
		if (unpublishedItemProvider == null) {
			unpublishedItemProvider = new UnpublishedItemProvider(this);
		}

		return unpublishedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link BIBTEX.Annote} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnoteItemProvider annoteItemProvider;

	/**
	 * This creates an adapter for a {@link BIBTEX.Annote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnoteAdapter() {
		if (annoteItemProvider == null) {
			annoteItemProvider = new AnnoteItemProvider(this);
		}

		return annoteItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (bibtexItemProvider != null) bibtexItemProvider.dispose();
		if (articleItemProvider != null) articleItemProvider.dispose();
		if (bookItemProvider != null) bookItemProvider.dispose();
		if (inbookItemProvider != null) inbookItemProvider.dispose();
		if (bookletItemProvider != null) bookletItemProvider.dispose();
		if (inproceedingsItemProvider != null) inproceedingsItemProvider.dispose();
		if (proceedingsItemProvider != null) proceedingsItemProvider.dispose();
		if (incollectionItemProvider != null) incollectionItemProvider.dispose();
		if (techreportItemProvider != null) techreportItemProvider.dispose();
		if (phdThesisItemProvider != null) phdThesisItemProvider.dispose();
		if (mastersThesisItemProvider != null) mastersThesisItemProvider.dispose();
		if (manualItemProvider != null) manualItemProvider.dispose();
		if (miscItemProvider != null) miscItemProvider.dispose();
		if (authorsItemProvider != null) authorsItemProvider.dispose();
		if (authorUrlsItemProvider != null) authorUrlsItemProvider.dispose();
		if (titleItemProvider != null) titleItemProvider.dispose();
		if (journalItemProvider != null) journalItemProvider.dispose();
		if (bookTitleItemProvider != null) bookTitleItemProvider.dispose();
		if (institutionItemProvider != null) institutionItemProvider.dispose();
		if (organizationItemProvider != null) organizationItemProvider.dispose();
		if (typeItemProvider != null) typeItemProvider.dispose();
		if (dayItemProvider != null) dayItemProvider.dispose();
		if (numberItemProvider != null) numberItemProvider.dispose();
		if (chapterItemProvider != null) chapterItemProvider.dispose();
		if (volumeItemProvider != null) volumeItemProvider.dispose();
		if (seriesItemProvider != null) seriesItemProvider.dispose();
		if (pagesItemProvider != null) pagesItemProvider.dispose();
		if (publisherItemProvider != null) publisherItemProvider.dispose();
		if (howpublishedItemProvider != null) howpublishedItemProvider.dispose();
		if (schoolItemProvider != null) schoolItemProvider.dispose();
		if (editorItemProvider != null) editorItemProvider.dispose();
		if (editionItemProvider != null) editionItemProvider.dispose();
		if (addressItemProvider != null) addressItemProvider.dispose();
		if (yearItemProvider != null) yearItemProvider.dispose();
		if (monthItemProvider != null) monthItemProvider.dispose();
		if (noteItemProvider != null) noteItemProvider.dispose();
		if (textItemProvider != null) textItemProvider.dispose();
		if (abstractFieldItemProvider != null) abstractFieldItemProvider.dispose();
		if (isbnItemProvider != null) isbnItemProvider.dispose();
		if (issnItemProvider != null) issnItemProvider.dispose();
		if (urlItemProvider != null) urlItemProvider.dispose();
		if (doiItemProvider != null) doiItemProvider.dispose();
		if (conferenceItemProvider != null) conferenceItemProvider.dispose();
		if (unpublishedItemProvider != null) unpublishedItemProvider.dispose();
		if (annoteItemProvider != null) annoteItemProvider.dispose();
	}

}