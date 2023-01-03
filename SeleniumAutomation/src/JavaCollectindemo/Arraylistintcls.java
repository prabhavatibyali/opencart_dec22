package JavaCollectindemo;

import java.util.ArrayList;
import java.util.List;

/*1) Heterogenious data - allowed
2) Insertion order- preserved(Index)
3) Duplicate elements -- allowed
4) multiple nulls -- allowed */


public class Arraylistintcls {

	public static void main(String[] args) {
		//add elements
		ArrayList ar=new ArrayList();
		//ArrayList <Integer>ar=new ArrayList<Integer>();
		//List ar=new ArrayList();
		ar.add(100);
		ar.add("welcome");
		ar.add(true);
		ar.add('A');
		ar.add(10.5);
		ar.add(null);
		ar.add(100);
		ar.add(null);
		
		System.out.println(ar);
		
		//size of element
		System.out.println(ar.size());
		//remove value from arraylist
		
		ar.remove(null);
		System.out.println(ar);
		
		ar.remove(2);
		System.out.println(ar);
		
		//inserting new element in middle of list
		ar.add(5,"hi");
		System.out.println(ar);
		
		//get specific value
		System.out.println(ar.get(2));
		//read all data from list one ny one
		System.out.println(ar);
		for(Object x:ar)
		{
			System.out.println(x);
		}
		//clear
		ar.clear();
		System.out.println(ar);
	}

}
