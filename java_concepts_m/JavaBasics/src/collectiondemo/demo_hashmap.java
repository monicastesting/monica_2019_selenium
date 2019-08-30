package collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class demo_hashmap {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
        hm.put(1,"india");  
        hm.put(2,"england");
        hm.put(3,"south Africa");
        hm.put(4,"west indies");
        hm.put(5,"kenia");
        
        System.out.println(hm.get(1));
        System.out.println(hm.get(0)); //  no exception OUTOFBOUND, only return Null
		
        for(Map.Entry m: hm.entrySet()){
        	System.out.println(m.getValue()+" &&&& "+m.getKey());
        }
        System.out.println(hm);
        hm.remove(3);
        System.out.println(hm);
        
        
        
        
        
        
        
	}

}
