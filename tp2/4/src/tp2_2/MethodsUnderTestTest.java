package tp2_2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MethodsUnderTestTest {

	@Test
	public void testAdd() {
		MethodsUnderTest test = new MethodsUnderTest();
		assertEquals(7, test.add(3,4), "l'ajout de 2 nombres positifs a échoué !");
		assertEquals(-5, test.add(-2,-3), "l'ajout de 2 nombres négatifs a échoué !");
		assertEquals(-2, test.add(1,-3), "l'ajout de 2 nombres de signes différents a échoué !");
		assertEquals(2, test.add(-3,5), "l'ajout de 2 nombres de signes différents a échoué !");
		assertEquals(3, test.add(3,0), "l'ajout de d' un nombre positif et un zero a échoué !");
		assertEquals(-3, test.add(0,-3), "l'ajout d' un nombre négatif et un zero a échoué !");
		assertEquals(0, test.add(0,0), "l'ajout de 2 zeros a échoué !");
	}
	
	@Test
	public void testMult() {
		MethodsUnderTest test = new MethodsUnderTest();
		assertEquals(6, test.mult(2,3), "le test de multiplication de 2 nombres positifs a échoué !");
		assertEquals(0, test.mult(1,0), "le test de multiplication de 2 nombres de signes différents a échoué !");
		assertEquals(0, test.mult(0,0), "le test de multiplication de 2 nombres de signes différents a échoué !");
	}
	
	@Test
	public void testCalculatePI() {
		MethodsUnderTest test = new MethodsUnderTest();
		assertEquals((-1), test.calculatePI(-1), 0.2, "probleme dans le if !");
		assertEquals(0, test.calculatePI(0), 0.9, "probleme dans le else (exterieur de la boucle) !");
		assertEquals(3.14, test.calculatePI(1), 0.9, "probleme dans le else !");
		assertEquals(3.14, test.calculatePI(2), 0.9, "probleme dans le else !");
		assertEquals(3.14, test.calculatePI(3), 0.9, "probleme dans le else !");
	}

	@Test
	void testVerifiCode() {
		MethodsUnderTest test = new MethodsUnderTest();
		int[] testSerie1 = {0,2,5,9,5,8,7};
		assertFalse(test.verifiCode(testSerie1, 7), "la methode 'verifiCode' ne foction pas correctement !");
		int[] testSerie2 = {5, 4, 3, 2, 1};
		assertFalse(test.verifiCode(testSerie2, 5), "la methode 'verifiCode' ne foction pas correctement !");
		int[] correctSerie = {3, 4, 5, 6, 7, 8, 9, 10};
		assertTrue(test.verifiCode(correctSerie, 8), "la methode 'verifiCode' ne foction pas correctement !");
	}

	@Test
	void testLeftRotation() {
		MethodsUnderTest test = new MethodsUnderTest();
		int[] testSerie = {1, 2, 3, 4, 5};
		int[] expectedSerie = {2, 3, 4, 5, 1};
		assertArrayEquals(expectedSerie, test.leftRotation(testSerie, 5), "la methode 'leftRotation' ne foction pas correctement !");
		int[] testSerie2 = {4, 5, 6, 7, 8};
		int[] expectedSerie2 = {5, 6, 7, 8, 4};
		assertArrayEquals(expectedSerie2, test.leftRotation(testSerie2, 5), "la methode 'leftRotation' ne foction pas correctement !");
	}

	@Test
	void testAddLivre() {
		MethodsUnderTest test = new MethodsUnderTest();
		assertNull(test.addLivre("","",50,50), "la methode 'addLivre' ne foction pas correctement !");
		assertNull(test.addLivre("","auteur",50,50), "la methode 'addLivre' ne foction pas correctement !");
		assertNull(test.addLivre("titre","",50,50), "la methode 'addLivre' ne foction pas correctement !");
		assertNotNull(test.addLivre("titre","auteur",50,50), "la methode 'addLivre' ne foction pas correctement !");
	}

	@Test
	void testGetLivre() {
		MethodsUnderTest test = new MethodsUnderTest();
		assertNull(test.getLivre(), "L'instance l de typr Livre a ete instancier !");
		test.addLivre("","",50,50);
		//une methode que a ete tester, est march bien
		assertNull(test.getLivre(), "la methode 'getLivre' ne foction pas correctement !");
		test.addLivre("","auteur",50,50);
		assertNull(test.getLivre(), "la methode 'getLivre' ne foction pas correctement !");
		test.addLivre("titre","",50,50);
		assertNull(test.getLivre(), "la methode 'getLivre' ne foction pas correctement !");
		test.addLivre("titre","auteur",50,50);
		assertNotNull(test.getLivre(), "la methode 'getLivre' ne foction pas correctement !");
	}

}
