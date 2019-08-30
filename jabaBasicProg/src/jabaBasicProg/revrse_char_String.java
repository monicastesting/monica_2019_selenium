package jabaBasicProg;

import java.util.ArrayList;
import java.util.List;

public class revrse_char_String {

	public static void main(String[] args) {
		String str=" this is java";
		String rev="";

		/*for(int i=str.length()-1;i>=0;i--){
			System.out.println(str.charAt(i));
		     rev=rev+ str.charAt(i);
		     //System.out.println(rev);
		}
		System.out.println("final:"+ rev);*/
		
		// %%%%%%%%%%%%%%%%%%%%%%%%%  javabuilder functions
		
		/* StringBuilder sb = new StringBuilder();
	        
	        for(int i = str.length() - 1; i >= 0; i--)
	        {
	            sb.append(str.charAt(i));
	        }
	        System.out.println(sb.toString())*/;
		
		
		
		
		  List<String> data=new ArrayList<String>();
		  String revrs= "";
		data.add("this");
		data.add("is");
		data.add("java");
		
		for (String i:data)
		{     StringBuilder sbr=new StringBuilder(i);
			 revrs=sbr.reverse().toString();
			 System.out.print(" "+revrs);
		//System.out.println(sbr.reverse().toString());
			 
		}
		
	}

}
