package overloading;

public class Bank {
	void interest()
	{
		System.out.println("Bank provides interest of deposits");
	}
	void interest(double rate)
	{
		System.out.println("Interest Rate"+rate);
	}


}
