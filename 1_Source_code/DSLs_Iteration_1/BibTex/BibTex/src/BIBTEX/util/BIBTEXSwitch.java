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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see BIBTEX.BIBTEXPackage
 * @generated
 */
public class BIBTEXSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BIBTEXPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIBTEXSwitch() {
		if (modelPackage == null) {
			modelPackage = BIBTEXPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BIBTEXPackage.LOCATED_ELEMENT: {
				LocatedElement locatedElement = (LocatedElement)theEObject;
				T result = caseLocatedElement(locatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.BIBTEX: {
				Bibtex bibtex = (Bibtex)theEObject;
				T result = caseBibtex(bibtex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.ENTRY: {
				Entry entry = (Entry)theEObject;
				T result = caseEntry(entry);
				if (result == null) result = caseLocatedElement(entry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.ARTICLE: {
				Article article = (Article)theEObject;
				T result = caseArticle(article);
				if (result == null) result = caseEntry(article);
				if (result == null) result = caseLocatedElement(article);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.BOOK: {
				Book book = (Book)theEObject;
				T result = caseBook(book);
				if (result == null) result = caseEntry(book);
				if (result == null) result = caseLocatedElement(book);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.INBOOK: {
				Inbook inbook = (Inbook)theEObject;
				T result = caseInbook(inbook);
				if (result == null) result = caseEntry(inbook);
				if (result == null) result = caseLocatedElement(inbook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.BOOKLET: {
				Booklet booklet = (Booklet)theEObject;
				T result = caseBooklet(booklet);
				if (result == null) result = caseEntry(booklet);
				if (result == null) result = caseLocatedElement(booklet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.INPROCEEDINGS: {
				Inproceedings inproceedings = (Inproceedings)theEObject;
				T result = caseInproceedings(inproceedings);
				if (result == null) result = caseEntry(inproceedings);
				if (result == null) result = caseLocatedElement(inproceedings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.PROCEEDINGS: {
				Proceedings proceedings = (Proceedings)theEObject;
				T result = caseProceedings(proceedings);
				if (result == null) result = caseEntry(proceedings);
				if (result == null) result = caseLocatedElement(proceedings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.INCOLLECTION: {
				Incollection incollection = (Incollection)theEObject;
				T result = caseIncollection(incollection);
				if (result == null) result = caseEntry(incollection);
				if (result == null) result = caseLocatedElement(incollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.TECHREPORT: {
				Techreport techreport = (Techreport)theEObject;
				T result = caseTechreport(techreport);
				if (result == null) result = caseEntry(techreport);
				if (result == null) result = caseLocatedElement(techreport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.PHD_THESIS: {
				PhdThesis phdThesis = (PhdThesis)theEObject;
				T result = casePhdThesis(phdThesis);
				if (result == null) result = caseEntry(phdThesis);
				if (result == null) result = caseLocatedElement(phdThesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.MASTERS_THESIS: {
				MastersThesis mastersThesis = (MastersThesis)theEObject;
				T result = caseMastersThesis(mastersThesis);
				if (result == null) result = caseEntry(mastersThesis);
				if (result == null) result = caseLocatedElement(mastersThesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.MANUAL: {
				Manual manual = (Manual)theEObject;
				T result = caseManual(manual);
				if (result == null) result = caseEntry(manual);
				if (result == null) result = caseLocatedElement(manual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.MISC: {
				Misc misc = (Misc)theEObject;
				T result = caseMisc(misc);
				if (result == null) result = caseEntry(misc);
				if (result == null) result = caseLocatedElement(misc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.AUTHORS: {
				Authors authors = (Authors)theEObject;
				T result = caseAuthors(authors);
				if (result == null) result = caseField(authors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.AUTHOR_URLS: {
				AuthorUrls authorUrls = (AuthorUrls)theEObject;
				T result = caseAuthorUrls(authorUrls);
				if (result == null) result = caseField(authorUrls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.TITLE: {
				Title title = (Title)theEObject;
				T result = caseTitle(title);
				if (result == null) result = caseField(title);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.JOURNAL: {
				Journal journal = (Journal)theEObject;
				T result = caseJournal(journal);
				if (result == null) result = caseField(journal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.BOOK_TITLE: {
				BookTitle bookTitle = (BookTitle)theEObject;
				T result = caseBookTitle(bookTitle);
				if (result == null) result = caseField(bookTitle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.INSTITUTION: {
				Institution institution = (Institution)theEObject;
				T result = caseInstitution(institution);
				if (result == null) result = caseField(institution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseField(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseField(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.DAY: {
				Day day = (Day)theEObject;
				T result = caseDay(day);
				if (result == null) result = caseField(day);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.NUMBER: {
				BIBTEX.Number number = (BIBTEX.Number)theEObject;
				T result = caseNumber(number);
				if (result == null) result = caseField(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.CHAPTER: {
				Chapter chapter = (Chapter)theEObject;
				T result = caseChapter(chapter);
				if (result == null) result = caseField(chapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.VOLUME: {
				Volume volume = (Volume)theEObject;
				T result = caseVolume(volume);
				if (result == null) result = caseField(volume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.SERIES: {
				Series series = (Series)theEObject;
				T result = caseSeries(series);
				if (result == null) result = caseField(series);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.PAGES: {
				Pages pages = (Pages)theEObject;
				T result = casePages(pages);
				if (result == null) result = caseField(pages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.PUBLISHER: {
				Publisher publisher = (Publisher)theEObject;
				T result = casePublisher(publisher);
				if (result == null) result = caseField(publisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.HOWPUBLISHED: {
				Howpublished howpublished = (Howpublished)theEObject;
				T result = caseHowpublished(howpublished);
				if (result == null) result = caseField(howpublished);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.SCHOOL: {
				School school = (School)theEObject;
				T result = caseSchool(school);
				if (result == null) result = caseField(school);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.EDITOR: {
				Editor editor = (Editor)theEObject;
				T result = caseEditor(editor);
				if (result == null) result = caseField(editor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.EDITION: {
				Edition edition = (Edition)theEObject;
				T result = caseEdition(edition);
				if (result == null) result = caseField(edition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.ADDRESS: {
				Address address = (Address)theEObject;
				T result = caseAddress(address);
				if (result == null) result = caseField(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.YEAR: {
				Year year = (Year)theEObject;
				T result = caseYear(year);
				if (result == null) result = caseField(year);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.MONTH: {
				Month month = (Month)theEObject;
				T result = caseMonth(month);
				if (result == null) result = caseField(month);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.NOTE: {
				Note note = (Note)theEObject;
				T result = caseNote(note);
				if (result == null) result = caseField(note);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseField(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.ABSTRACT_FIELD: {
				AbstractField abstractField = (AbstractField)theEObject;
				T result = caseAbstractField(abstractField);
				if (result == null) result = caseField(abstractField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.ISBN: {
				Isbn isbn = (Isbn)theEObject;
				T result = caseIsbn(isbn);
				if (result == null) result = caseField(isbn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.ISSN: {
				Issn issn = (Issn)theEObject;
				T result = caseIssn(issn);
				if (result == null) result = caseField(issn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.URL: {
				Url url = (Url)theEObject;
				T result = caseUrl(url);
				if (result == null) result = caseField(url);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.DOI: {
				Doi doi = (Doi)theEObject;
				T result = caseDoi(doi);
				if (result == null) result = caseField(doi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.CONFERENCE: {
				Conference conference = (Conference)theEObject;
				T result = caseConference(conference);
				if (result == null) result = caseEntry(conference);
				if (result == null) result = caseLocatedElement(conference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.UNPUBLISHED: {
				Unpublished unpublished = (Unpublished)theEObject;
				T result = caseUnpublished(unpublished);
				if (result == null) result = caseEntry(unpublished);
				if (result == null) result = caseLocatedElement(unpublished);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BIBTEXPackage.ANNOTE: {
				Annote annote = (Annote)theEObject;
				T result = caseAnnote(annote);
				if (result == null) result = caseField(annote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedElement(LocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibtex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibtex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibtex(Bibtex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntry(Entry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Article</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Article</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticle(Article object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBook(Book object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inbook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inbook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInbook(Inbook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booklet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booklet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooklet(Booklet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inproceedings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inproceedings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInproceedings(Inproceedings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proceedings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proceedings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceedings(Proceedings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incollection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incollection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncollection(Incollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Techreport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Techreport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechreport(Techreport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phd Thesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phd Thesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhdThesis(PhdThesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Masters Thesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Masters Thesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMastersThesis(MastersThesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManual(Manual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Misc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Misc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMisc(Misc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthors(Authors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Urls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Urls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorUrls(AuthorUrls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitle(Title object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJournal(Journal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookTitle(BookTitle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Institution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Institution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstitution(Institution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Day</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Day</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDay(Day object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(BIBTEX.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChapter(Chapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolume(Volume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Series</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeries(Series object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pages</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePages(Pages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisher(Publisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Howpublished</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Howpublished</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHowpublished(Howpublished object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>School</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>School</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchool(School object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditor(Editor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdition(Edition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Year</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYear(Year object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Month</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Month</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonth(Month object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNote(Note object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractField(AbstractField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Isbn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Isbn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsbn(Isbn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssn(Issn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrl(Url object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoi(Doi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConference(Conference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unpublished</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unpublished</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnpublished(Unpublished object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnote(Annote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BIBTEXSwitch
