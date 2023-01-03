package CondStmnt;

public class Condpractise {

	public static void main(String[] args) {
		
		//if stmt
	/*	int age=25;
		if(age>20)
		{
			System.out.println("Eligible for vote");
		}
		*/
		
		//if else stmt
	/*	int num=13;
		if(num%2==0)
		{
			System.out.println("Even no");
		}
		else
			System.out.println("odd no"); */
	
		//pos,negative using if and else
	/*	int num=0;
		if(num>0)
		{
		System.out.println("positive");
		}
        else if(num<0)
         {
        	System.out.println("negative");
         }
         else
         	
        	 System.out.println("zero");
        	 */
		
		//largest no
	/*	int a=500,b=200,c=30;
		if(a>b && a>c)
		{
			System.out.println("a is largest");
		}
		else if (b>c && b>a)
		{ 
			System.out.println("b is largest");
		}
		else
		{ 
			System.out.println("c is largest");
		}	*/
		
		//print week names using nested if
		
		/*int wk=0;
		if(wk==1) {System.out.println("Monday");}
		else if(wk==2) {System.out.println("Tuesday");}
		else if(wk==3) {System.out.println("Wednesday");}
		else if(wk==4) {System.out.println("Thursday");}	         
	     else if(wk==5) {System.out.println("Friday");}
		else if(wk==6) {System.out.println("Saturday");}	
		else if(wk==7) {System.out.println("Sunday");}
		else {System.out.println("invalid");		}
		*/
		
		//switch
		
		int wk=0;
		switch(wk)
		{
		case 1: System.out.println("Monday");break;
		case 2: System.out.println("Tuesday");break;
		case 3: System.out.println("Wednesday");break;
		case 4: System.out.println("Thursday");break;
		case 5: System.out.println("Friday");break;
		case 6: System.out.println("Saturday");break;
		case 7: System.out.println("Sunday");break;
		default: {System.out.println("invalid");
		}
		
		}
		
		}}
	

