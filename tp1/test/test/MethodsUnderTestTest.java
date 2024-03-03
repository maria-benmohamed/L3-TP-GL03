package test;
import static org.junit.Assert.*;
import org.junit.Test;

public class MethodsUnderTestTest {

	@Test
	public void testAdd() {
		MethodsUnderTest test = new MethodsUnderTest();
		assertEquals(4, test.add(2,2));
		assertEquals(7, test.add(3,4));
		assertEquals(12, test.add(1,11));
		assertEquals(-5, test.add(-2,-3));
		assertEquals(-2, test.add(1,-3));
		assertEquals(2, test.add(-3,5));
	}
	
	@Test
	public void testMult() {
		MethodsUnderTest test = new MethodsUnderTest();
		assertEquals(6, test.mult(2,3));
		assertEquals(12, test.mult(3,4));
		assertEquals(11, test.mult(11,1));
		assertEquals(-6, test.mult(-2,-3));
		assertEquals(-3, test.mult(1,-3));
		assertEquals(-15, test.mult(-3,5));
	}
	
	@Test
	public void testCalculatePI() {
		MethodsUnderTest test = new MethodsUnderTest();
		assertEquals((-1), test.calculatePI(-1), 0.9);
		assertEquals(1, test.calculatePI(0), 0.9);
		//                                  tolerance daymen tkon fi assertEquals mabin les doubles
	}
}