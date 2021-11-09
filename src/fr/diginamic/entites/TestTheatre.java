package fr.diginamic.entites;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTheatre {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testInscriptionClients() {
		Theatre theatre = new Theatre("rondPoint", 250);
		theatre.inscrire(18, 15);
		assertEquals(18, theatre.getTotalClientsInscrits());
		assertEquals(270,theatre.getRecetteTotale());
	}

	@Test
	void test2InscriptionClients() {
		Theatre theatre = new Theatre("rondPoint", 250);
		theatre.inscrire(18, 15);
		theatre.inscrire(10, 15);
		assertEquals(28, theatre.getTotalClientsInscrits());
		assertEquals(420,theatre.getRecetteTotale());

	}
	
	@Test
	void testCapaciteMaxAtteinte() {
		Theatre theatre = new Theatre("rondPoint", 50);
		theatre.inscrire(10, 15);
		theatre.inscrire(20, 15);
		theatre.inscrire(20, 15);
		theatre.inscrire(10, 15);
		assertEquals(50, theatre.getTotalClientsInscrits());
		assertEquals(750, theatre.getRecetteTotale());
	}
	
	@Test
	void testCapaciteMaxDepassee() {
		Theatre theatre = new Theatre("rondPoint", 50);
		theatre.inscrire(10, 15);
		theatre.inscrire(20, 15);
		theatre.inscrire(15, 15);
		theatre.inscrire(10, 15);
		assertEquals(45, theatre.getTotalClientsInscrits());
		assertEquals(675, theatre.getRecetteTotale());
	}
	

}
