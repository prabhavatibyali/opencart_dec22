package Overridepr;


class Bank
{
	double roi()
	{
		return 0.0;
	}
}

class ICICI extends Bank
{
double roi()
{
	return 10.5;
}
}

class SBI extends Bank
{
	double roi()
	{ return 12.5;
	}
	}
	

public class Overridepr {

	public static void main(String[] args) {
		
ICICI ic=new ICICI();
System.out.println(ic.roi());
SBI sb=new SBI();
System.out.println(sb.roi());
Bank bk=new Bank();
System.out.println(bk.roi());
	}

}
