package tstng;

import org.testng.annotations.Test;

public class test_priority {
	 @Test
	  public void aaditya() { System.out.println("AC");
	  }
	  @Test 
	  public void bhagyashri() { System.out.println("BC");
	  }
	  
	  @Test (priority = 1)
	  public void priya() { System.out.println("monica");
	  }
	  
	  @Test
	  public void tejaswai() { System.out.println("CC");
	  }
	  
	  

}