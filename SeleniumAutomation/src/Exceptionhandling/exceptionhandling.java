package Exceptionhandling;

import java.util.Scanner;

public class exceptionhandling {

	public static void main(String[] args) {
		System.out.println("program started");
		//int a[]=new int[5];
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		
		try {
			System.out.println(100/num);
			}
		catch(Exception e)
		{ 
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println("You have entered invalid input.");
		}
		
		//ex1:arithmetic exception,invalid input 0
		//System.out.println(100/num);
		/*
	
		try
		{
		System.out.println(100/num);  
				}
		catch(Exception e)
		{
			System.out.println("Arithmetic exception thown");
		}
		
	
		
		
		
		//ex2:Arrayindexoutofbound exception,invalid input 6
	/*	System.out.println("enter a position");
		int pos=sc.nextInt();
		
		a[pos]=num;
		System.out.println(a[pos]);
		
		
*/
		//ex3:numberformatexception
	/*	String s="welcome";
		int num=Integer.parseInt(s);
		System.out.println(num);*/
		System.out.println("program completed");
		
	}

}
