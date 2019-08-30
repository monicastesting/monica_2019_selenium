package java_pattern;

import java.util.Scanner;

public class pat_9 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();

        for(int i=rows;i>=1;i--)
        {   for(int j=1;j<=i;j++) 
        		{
        	       System.out.print(j+" ");
        		}System.out.println();
        }//System.out.println();
        for(int m=1;m<=rows;m++)
        {
        	for(int n=1;n<=m;n++)
        	{ 
        		 System.out.print(n+" ");
        	}System.out.println();
        }	
        
	}

}
