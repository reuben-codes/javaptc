package overloading;

public class SBI extends Bank {
	void interest(double rate,int years)
	{
		double principal=10000;
		double totalInterest=(principal*rate*years)/100;
		System.out.println("Total interest for"+years+"years"+totalInterest);
	}
	public static void main(String []args)
	{
		SBI ob=new SBI();
		ob.interest();
		ob.interest(7.5);
		ob.interest(7.5,3);
	}
	
				
	}


