package jabaBasicProg;

import java.util.Scanner;

public class reverse_number {

	public static void recursnum(int num){
			
		if(num<10)
		{System.out.print(num);
		return;
		}
		else{
		System.out.print(num%10);
		recursnum(num/10);}
	}
	
	
	public static void main(String[] args) {
		int num=0;
	      int reversenum =0;
	      System.out.println("Input your number and press enter: ");
	      Scanner scn=new Scanner(System.in);
	     num= scn.nextInt();
	     
	     
	     // while logic
	     /*while(num!=0)
	     {
	    	 reversenum= reversenum*10;
	    	 reversenum= reversenum + num%10;
	    	 num=num/10;
	     }
	     System.out.println(reversenum);*/
	     
	     
	     //for logic
	     /*for(;num!=0;)
	     {
	    	 reversenum= reversenum*10;
    	 reversenum= reversenum + num%10;
    	 num=num/10;
    	 }
	     System.out.println(reversenum);*/
	     
	     
	     //recursive logic
	     
	     recursnum(num);
	     
	     
	     
	     
	     
	     
	}

}
