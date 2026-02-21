package overloading;

public class child extends Parent {
	void show()
	{
		System.out.println("Child static method");
	}
	public static void man(String []args) {
		Parent obj=new child();
		obj.show();
	}

}
