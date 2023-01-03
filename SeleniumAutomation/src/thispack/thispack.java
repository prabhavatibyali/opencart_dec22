package thispack;

public class thispack {
int x,y;
 void test(int x,int y)
 {
	 this.x=x;
	 this.y=y;
 }
 
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		
		thispack th=new thispack();
		th.test(10,20);
		th.display();
	}

}
