package fddfgdgd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class sop_trail {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("this is before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is After class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("   this is After");
	}

	@Test
	public void test1() {
		System.out.println("   this is TEST1");
	}

	@Test
	public void test2() {
		System.out.println("   this is TEST2");
	}@Test
	public void test3() {
		System.out.println("this is TEST3");
	}
}