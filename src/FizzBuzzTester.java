import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTester {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/

	
	
	@Test
	public void test1() {
	assertEquals("1", fizzbuzzClass.fizzBuzzProcess(1));
	
	}
	@Test
	public void test2() {
	assertEquals("2", fizzbuzzClass.fizzBuzzProcess(2));
	
	}
	@Test
	public void test3() {
	assertEquals("fizz", fizzbuzzClass.fizzBuzzProcess(3));
	
}
	@Test
	public void test5() {
	assertEquals("buzz", fizzbuzzClass.fizzBuzzProcess(5));
	}

	@Test
	public void test6() {
	assertEquals("fizz", fizzbuzzClass.fizzBuzzProcess(6));
	}

	@Test
	public void test10() {
	assertEquals("buzz", fizzbuzzClass.fizzBuzzProcess(10));
	
	}
	@Test
	public void test15() {
	assertEquals("fizzbuzz", fizzbuzzClass.fizzBuzzProcess(15));
	
	}
	
}
