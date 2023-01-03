package Arrays;

public class Arrpractise {

	public static void main(String[] args) {
	
		/* int a[]=new int[5];  //declare
		a[0]=100;
		a[1]=200;
		a[3]=300;
		a[4]=400;
		System.out.println(a[1]);
         */
		
	/*	int a[]= {100,200,300,400,500,600};
		System.out.println(a[3]);
		System.out.println(a.length);  //length
		//System.out.println(Arrays.toString(a));
	
		for(int i=0;i<a.length;i++) ///using for loop
			System.out.println(a[i]);
			
		int a[]= {100,200,300,400,500,600};
		for(int x:a)     //using for each loop(enhanced for loop)
		{
			System.out.println(x);
		
		}
		*/
/* int a[][]=new int[3][2];
a[0][0]=100;
a[0][1]=200;
a[1][0]=300;
a[1][1]=400;
a[2][0]=500;
a[2][1]=600;
System.out.println(a[0][1]);
System.out.println(a[2][1]);
System.out.println(a.length);//rows
System.out.println(a[0].length);//columns
System.out.println(a[2][0]);
*/
	/*	 int a[][]=new int[3][2];
		 a[0][0]=100;
		 a[0][1]=200;
		 a[1][0]=300;
		 a[1][1]=400;
		 a[2][0]=500;
		 a[2][1]=600;		 
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				
				System.out.print(a[r][c]+" ");
				
						}
			System.out.println(" ");
		}
		*/
		/* int a[][]=new int[3][2];
		for(int x[]:a)
		{for (int v:x)
		{System.out.print(v+" ");}
		System.out.println(" ");
		}*/
		
		//int a[]=new int[5]
			//	string a[]=new string[5];
		 //int a[][]=new int[3][2];
		Object a[]=new Object[5];
		a[0]=10;a[1]=10.5;a[2]="welcome";a[3]=true;
		/*for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}*/
		for(Object x:a)
		{ 
			System.out.println(x);
		}
		
		
		}
		
	}

