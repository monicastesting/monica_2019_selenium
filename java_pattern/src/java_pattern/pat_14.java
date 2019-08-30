package java_pattern;

import java.util.Scanner;

public class pat_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
	         
	    int rows = sc.nextInt();

		
		
			for(int j=1;j<=rows;j++)
			{ for(int i=1;i<=rows-i;i++)
				{
				System.out.print("?");
				}
			for(int i=1;i<=j;i++)
				{
				System.out.print(i);
				
				}System.out.println();	
			}
			
			System.out.println();
	}

}
