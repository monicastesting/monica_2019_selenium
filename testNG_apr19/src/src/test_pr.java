package src;

import org.testng.annotations.Test;

public class test_pr {
	 @Test
	  public void ac() { System.out.println("AC");
	  }
	  @Test
	  public void bc1() { System.out.println("BC");
	  }
	  @Test (priority = 1)
	  public void bc() { System.out.println("monica");
	  }
	  @Test
	  public void cc() { System.out.println("CC");
	  }
	  @Test(priority=2)
	  public void gc() { System.out.println("GC");
	  }
	  @Test
	  public void ec() { System.out.println("EC");
	  }
	  @Test(priority=3)
	  public void fc() { System.out.println("FC");
	  }
	 
	  @Test
	   public void tc() { System.out.println("TC");
}
}