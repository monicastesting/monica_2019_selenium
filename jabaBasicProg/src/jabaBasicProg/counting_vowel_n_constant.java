package jabaBasicProg;

import java.util.Scanner;

public class counting_vowel_n_constant {

	public static void main(String[] args) {
		System.out.println("enter String");
		Scanner scn= new Scanner(System.in);
		String word=scn.next();
		scn.close();
		int v_cnt=0;
		int c_cnt=0;
		word= word.toLowerCase();
		
		for(int i=0;i<word.length();i++)
		{   
			char lttr = word.charAt(i);
			if(lttr== 'a' ||lttr== 'e' ||lttr== 'i' ||lttr== 'o' ||lttr=='u')
				{v_cnt++;
				}
			else if((lttr>='a'&&lttr <='z'))
				{c_cnt++;
				}
		}
		
		System.out.println(word+"   vowel count="+v_cnt+"    constant count="+c_cnt);
	}

}
