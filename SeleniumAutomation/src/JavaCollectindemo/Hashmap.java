package JavaCollectindemo;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		
 HashMap hm=new HashMap();
	//	HashMap <Integer,String>hm=new HashMap<Integer,String>();
 //Map hm=new HashMap();
 
 //adding data pairs to hashmap
 hm.put(101, "john");
 hm.put(102,"david");
 hm.put(106, "canda");
 
 System.out.println(hm);
 
 //size
 System.out.println(hm.size());
 //remove pair
 hm.remove(101);
 System.out.println(hm);
 
 //read value
 System.out.println(hm.get(102));
 

 //insert value for trial myself //dont do
 System.out.println(hm);
 hm.put(103,"pra");
 System.out.println(hm);
 
//print only keys
 System.out.println(hm.keySet());
 //print only values
 for (Object x:hm.keySet())
 {
	 System.out.println(hm.get(x)); 
 }
 
 //clear();
 hm.clear();
 System.out.println(hm);
	}

}
