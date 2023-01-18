/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Package Key</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getPackageKey()
 * @model
 * @generated
 */
public enum PackageKey implements Enumerator {
	/**
	 * The '<em><b>Package Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGE_ONLY(0, "PackageOnly", "PackageOnly"),

	/**
	 * The '<em><b>Package Optionally</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_OPTIONALLY_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGE_OPTIONALLY(1, "PackageOptionally", "PackageOptionally"),

	/**
	 * The '<em><b>Package Zero Or More</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_ZERO_OR_MORE_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGE_ZERO_OR_MORE(2, "PackageZeroOrMore", "PackageZeroOrMore"),

	/**
	 * The '<em><b>Package One Or More</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_ONE_OR_MORE_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGE_ONE_OR_MORE(3, "PackageOneOrMore", "PackageOneOrMore");

	/**
	 * The '<em><b>Package Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_ONLY
	 * @model name="PackageOnly"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Package Optionally</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_OPTIONALLY
	 * @model name="PackageOptionally"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_OPTIONALLY_VALUE = 1;

	/**
	 * The '<em><b>Package Zero Or More</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_ZERO_OR_MORE
	 * @model name="PackageZeroOrMore"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_ZERO_OR_MORE_VALUE = 2;

	/**
	 * The '<em><b>Package One Or More</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_ONE_OR_MORE
	 * @model name="PackageOneOrMore"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_ONE_OR_MORE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Package Key</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PackageKey[] VALUES_ARRAY =
		new PackageKey[] {
			PACKAGE_ONLY,
			PACKAGE_OPTIONALLY,
			PACKAGE_ZERO_OR_MORE,
			PACKAGE_ONE_OR_MORE,
		};

	/**
	 * A public read-only list of all the '<em><b>Package Key</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PackageKey> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Package Key</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PackageKey get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PackageKey result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Package Key</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PackageKey getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PackageKey result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Package Key</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PackageKey get(int value) {
		switch (value) {
			case PACKAGE_ONLY_VALUE: return PACKAGE_ONLY;
			case PACKAGE_OPTIONALLY_VALUE: return PACKAGE_OPTIONALLY;
			case PACKAGE_ZERO_OR_MORE_VALUE: return PACKAGE_ZERO_OR_MORE;
			case PACKAGE_ONE_OR_MORE_VALUE: return PACKAGE_ONE_OR_MORE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PackageKey(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PackageKey
