package Getsetpack;

public class Getsetpack {
	int a=10;
	  String s;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	  
 /* int a=10;
  String s;
   
  public int geta()
  {
	  return a;
	    }
	public void seta(int a) {
		this.a=a;
	}*/
  
	public static void main(String[] args) {
		
		Getsetpack gs=new Getsetpack();
		//System.out.println(gs.geta());
		System.out.println(gs.getA());
	}

}
