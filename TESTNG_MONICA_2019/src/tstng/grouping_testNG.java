package tstng;


	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;

	public class grouping_testNG {
	  
		@Test(groups="studernts")
	  public void monica() { System.out.println("ENTER LOGIN PASSWORD AND SELECT LOGIN BUTTON. ");
	  }
	  
	  @Test (priority=1,groups="seed")
	  public void hariom() { System.out.println("all d best. ");
	  }
	  @Test(priority=2,groups="seed")
	  public void swapnil() { System.out.println("something ");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() { System.out.println("ENTER URL WWW.GOOGLE.COM");
	  }

	  @AfterMethod
	  public void afterMethod() { System.out.println("LOG OUT");
	  }

	  @BeforeClass
	  public void beforeClass() { System.out.println("LAUNCH BROWSER");
	  }

	  @AfterClass
	  public void afterClass() { System.out.println("CLOSE BROWSER");
	  }

	  @BeforeTest
	  public void beforeTest() { System.out.println(" SET PROPERTY");
	  }

}
