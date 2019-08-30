package fddfgdgd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class junit_class_Assert {

	int nm;
	String tmp,str; 
	
	@Before
	public void setUp() throws Exception {
	nm=5;
	tmp=null;
	str="junit is fine";
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("junit is fine", str);

	assertFalse(nm<3);
	assertNotNull(tmp);
	assertTrue(tmp == null);
	assertNull(tmp);
	
	}

}
