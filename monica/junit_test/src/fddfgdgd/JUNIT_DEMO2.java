package fddfgdgd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUNIT_DEMO2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("   B:   this is before class");
		}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("   B:   this is After class");
	}

	/*@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}*/

	@Test
	public void test() {
		System.out.println("   B:     this is TEST1");
	}

}
