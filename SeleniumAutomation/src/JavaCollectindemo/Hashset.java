package JavaCollectindemo;

import java.util.HashSet;
import java.util.Set;

/*
 * 1) Heterogenios data ---> allowed
2) Insertion order  --> Not preserved (Index not supported)
3) Duplicate elements --> Not Allowed
4) Multiple nulls Not allowed/ only single null is allowed


 */
public class Hashset {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
	//	HashSet <String>hs=new HashSet<String>();
		//Set hs=new HashSet();
		
		//add elements
		hs.add(100);
		hs.add("welcome");
		hs.add(true);
		hs.add('A');
		hs.add(10.5);
		hs.add(null);
		hs.add(100);
		hs.add(null);
		
		System.out.println(hs);
		
   //size
		System.out.println(hs.size());
		
		//remove value
		hs.remove(10.5);
		System.out.println(hs);
		
		// insertion is not possible in hashset
		
		//get specific value from hashset - not possible
		
		for(Object x:hs)
		{
			System.out.println(x);
		}
		hs.clear();
		System.out.println(hs);
		}
		
	}


