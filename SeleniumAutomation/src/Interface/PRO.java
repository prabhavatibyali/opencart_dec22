package Interface;

public class PRO extends MNO implements ABC,XYZ
{
public void m1()
{
		System.out.println("this is m1 from ABC");
	}

public void m2()
{
		System.out.println("this is m2 from XYZ");
}
	public static void main(String[] args) {
		PRO mt=new PRO();
		mt.m1();
		mt.m2();
		mt.m3();

	}

}
