package java_pattern;

import java.util.Scanner;

public class pat_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
	       //Taking rows value from the user
	        
	       System.out.println("How many rows you want in this pattern?");
	        
	       int rows = sc.nextInt();
	       
	       for(int a=1;a<=rows;a++)
	       {
	    	   for(int b=a;b>=1;b--)
	    	   {
	    		   System.out.print(b);
	    	   }System.out.println();
	       }
	       
	       
	       
	       sc.close();
	       
	       
	       
	       
	       
	       

	}

}
