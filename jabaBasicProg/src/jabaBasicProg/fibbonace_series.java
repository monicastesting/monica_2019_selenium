package jabaBasicProg;

import java.util.Scanner;

public class fibbonace_series {

	public static void main(String[] args) {
		
int num;
System.out.println("enter number");
Scanner scn= new Scanner(System.in);

num=scn.nextInt();

scn.close();
int n1=0;
int n2=1;
int adtn;
for (int i=0; i<=num;i++)
{    System.out.println(n1);
	adtn=n1+n2;
	n1=n2;
	n2=adtn;
 //System.out.print(n1+"  "+n2);

}



	}

}
