package java_pattern;

import java.util.Scanner;

public class pat_7 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
        
        for(int i=rows;i>=1;i--)
        	{for(int j=rows;j>=i-1;j--)
        	{System.out.print(j+" ");
        	}System.out.println();
        	
        	}System.out.println();
	}
	}

