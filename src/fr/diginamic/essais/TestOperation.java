package fr.diginamic.essais;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.diginamic.operations.Operation;

class TestOperation {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testAddition() {
		Operation ope = new Operation(10.0D, 12.0D, '+');

		assertEquals(22.0D, ope.calcul());
	}

	@Test
	void testSoustraction() {
		Operation ope = new Operation(10.0D, 12.0D, '-');

		assertEquals(-2.0D, ope.calcul());
	}

	@Test
	void testMultiplication() {
		Operation ope = new Operation(10.0D, 12.0D, '*');

		assertEquals(120D, ope.calcul());
	}

	@Test
	void testDivision() {
		Operation ope = new Operation(12.0D, 10.0D, '/');

		assertEquals(1.20D, ope.calcul());
	}
}
