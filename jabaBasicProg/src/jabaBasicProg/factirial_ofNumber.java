package jabaBasicProg;

import java.util.Scanner;

public class factirial_ofNumber {

	public static void main(String[] args) {
		int num;
		System.out.println("enter number");
		Scanner scn= new Scanner(System.in);

		num=scn.nextInt();

		scn.close();
		int result = facto(num);
		System.out.println(result);
	
	}
	 public static int facto(int num){
		  int res;
		 if(num==1)
				return 1;
		else
		 res= num *facto(num-1);
		 return res;
		 
	 }

}
