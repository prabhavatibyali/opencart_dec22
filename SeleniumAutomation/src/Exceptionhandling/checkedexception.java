package Exceptionhandling;

public class checkedexception {

	public static void main(String[] args) throws InterruptedException  {
		System.out.println("Program is  started..");
		System.out.println("Program is  in progress..");
		
		Thread.sleep(5000);
		/*
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		System.out.println("program completed");

	}

}
