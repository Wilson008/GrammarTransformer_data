/**
 * Copyright (c) 2016 Joel Greenyer and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * ScenarioTools-URL: www.scenariotools.org
 *    
 * Contributors:
 *     ScenarioTools Team - Initial API and implementation
 */
package org.scenariotools.sml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scenario Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.scenariotools.sml.SmlPackage#getScenarioKind()
 * @model
 * @generated
 */
public enum ScenarioKind implements Enumerator {
	/**
	 * The '<em><b>Assumption</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSUMPTION_VALUE
	 * @generated
	 * @ordered
	 */
	ASSUMPTION(0, "assumption", "assumption"),

	/**
	 * The '<em><b>Guarantee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUARANTEE_VALUE
	 * @generated
	 * @ordered
	 */
	GUARANTEE(1, "guarantee", "guarantee"), /**
	 * The '<em><b>Existential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXISTENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	EXISTENTIAL(2, "existential", "existential");

	/**
	 * The '<em><b>Assumption</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assumption</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSUMPTION
	 * @model name="assumption"
	 * @generated
	 * @ordered
	 */
	public static final int ASSUMPTION_VALUE = 0;

	/**
	 * The '<em><b>Guarantee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guarantee</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUARANTEE
	 * @model name="guarantee"
	 * @generated
	 * @ordered
	 */
	public static final int GUARANTEE_VALUE = 1;

	/**
	 * The '<em><b>Existential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Existential</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXISTENTIAL
	 * @model name="existential"
	 * @generated
	 * @ordered
	 */
	public static final int EXISTENTIAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Scenario Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ScenarioKind[] VALUES_ARRAY =
		new ScenarioKind[] {
			ASSUMPTION,
			GUARANTEE,
			EXISTENTIAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Scenario Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ScenarioKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scenario Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScenarioKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScenarioKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scenario Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScenarioKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScenarioKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scenario Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScenarioKind get(int value) {
		switch (value) {
			case ASSUMPTION_VALUE: return ASSUMPTION;
			case GUARANTEE_VALUE: return GUARANTEE;
			case EXISTENTIAL_VALUE: return EXISTENTIAL;
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
	private ScenarioKind(int value, String name, String literal) {
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
	
} //ScenarioKind
