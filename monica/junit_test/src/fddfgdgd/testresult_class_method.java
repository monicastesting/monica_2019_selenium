package fddfgdgd;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

public class testresult_class_method extends TestResult{

	
		public  synchronized void adderror(Test test, Throwable t)
		{// super.addError((junit.framework.Test)test, t );
		super.addError((junit.framework.Test)test,t);
		}
		
		public synchronized void addfailure(Test test, AssertionFailedError t)
		{ 
			super.addFailure((junit.framework.Test)test,t);
		}
		
		@Test
		public void test() {
			assertEquals(5, 6);
	}

}
