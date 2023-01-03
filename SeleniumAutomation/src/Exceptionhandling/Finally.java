package Exceptionhandling;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		System.out.println("Program is  started..");
		System.out.println("Program is  in progress..");
		
				String s=null; //null,1234
				try
				{
				System.out.println(s.length());
				}
				catch(Exception e)
				{
					System.out.println("exception handled");
				}
				finally
				{
					System.out.println("program completed");
				}
	}

}
