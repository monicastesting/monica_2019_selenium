import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class reverseString_wordwise {

	public static void main(String[] args) {
		//Scanner scr= new Scanner(System.in);
		String userStr= "thane seed";
		//System.out.println("enter STRING");
		//userStr=scr.next();
		StringTokenizer st= new StringTokenizer(userStr);
		
		/*int sbcnt=st.countTokens();
		System.out.println(sbcnt);
		
		String l1=st.nextToken();
		System.out.println(l1);
		*/
		List<String> ls=new ArrayList<>();
		
		while(st.hasMoreTokens())
		{
		ls.add((String) st.nextElement());
		}
		 int cntLs=ls.size();
		for(int i=0;i<cntLs;i++)
		   {
			StringBuilder sb = new StringBuilder(ls.get(i));
			StringBuilder re=sb.reverse();
		    System.out.println(re);
           }
        }

}
