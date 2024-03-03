package test;
import static org.junit.Assert.*;

import org.junit.Test;

public class PremierJUnitTestTest {

	@Test //c'est une anotation, that says to the compilateur "what comes next is a test!"
	public void testConcatenate() { //les methods de tests are always public
		//visibiliti par defaut est.. idk the name for it but it is just like public.. but in the same package
		PremierJUnitTest test = new PremierJUnitTest();
		String result = test.concatenate("one","two");
		//"one","two": parametres de test.   
		assertEquals("onetwo", result);
		// onetwo: resulta attendu. result: resulta real. 
		// so assertEquals basically compaires them.
	}
	// failures: resulta attendu n egale pas la valeur de resulta
	// erreures: erreur syntaxique or something like that
	// if we only want to test one methode, we should select it (clique on its name) and run

	@Test
	public void testMultiplay() {
		PremierJUnitTest test = new PremierJUnitTest();
		int result = test.multiplay(3,4);
		assertEquals(12, result);
	}

	@Test
	public void testAdd() {
		PremierJUnitTest test = new PremierJUnitTest();
		int result = test.add(4,5);
		assertEquals(9, result);
	}
}