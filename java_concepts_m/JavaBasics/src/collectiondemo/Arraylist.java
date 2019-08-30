package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("fhjfgfjghf");
		al.add("aa");
		al.add(true);
		al.add(346446);
		System.out.println(al);
		System.out.println(al.get(2));
		int siz=al.size();
     //normal for loop
		/*for (int i=0;i<siz;i++){
    	 System.out.println(al.get(i) +"   & on location "+i);
     }
		for(Object ct:al){
			System.out.println("this is:"+ct);
			
		}*/
		Iterator itr= al.iterator();
		while(itr.hasNext())
		{
		Object val=itr.next();
		System.out.println("iterator loop    :"+val);
		}
		
		
		for(int i=0;i<al.size();i++)
		{ System.out.println("content on "+i+" position :"+ al.get(i)); }
		
		for(Object obj:al)
		{ System.out.println(obj.toString());    }
		
		
	}
	

}
