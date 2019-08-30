package collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistdemo {

	public static void main(String[] args) {
		
		LinkedList ll= new LinkedList();
        
		ll.add("tinu");
		ll.add("minu");
		ll.add("chinu");
		System.out.println(ll);
		
		ll.addFirst("names");
		ll.addLast("are girls.");
		System.out.println(ll);
		
		System.out.println(ll.get(1));
		
		ll.set(1, "of the girls");
		System.out.println(ll);
		
		ll.removeLast();
		System.out.println(ll);
		
		for(int i=0;i<ll.size();i++)
		{ System.out.println("content on"+i+"position :"+ ll.get(i)); }
		
		for(Object obj:ll)
		{ System.out.println(obj.toString());    }
		
		Iterator itr= ll.iterator();
		while(itr.hasNext()){
			System.out.println("iterator strings are :"+itr.next());
		}
		
		int cnt=0;
		while(ll.size()>cnt)
		{ System.out.println(ll.get(cnt)+" :  while loop"); cnt++; }
		
		
		
		
		
	}

}
