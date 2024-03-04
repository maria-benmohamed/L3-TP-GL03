package mesClasses;
import static org.junit.jupiter.api.Assertions.*;
import org.hamcrest.core.*;

import org.junit.jupiter.api.Test;

class FicheTest {
	@Test
	void testFiche() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNom() {
		Fiche f = new Fiche(1, "file name", "file adress");
		assertThat(f.getNom(), startsWith("file"));
	}

	@Test
	void testSetAdresse() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNumero() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNom() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAdresse() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNumero() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
