package fddfgdgd;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class testRunner_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result result=JUnitCore.runClasses( msgClass_test.class);
		   for(Failure fail:result.getFailures()){
			   System.out.println(fail.toString());
		   }
		System.out.println(result.wasSuccessful());
		
	}

}