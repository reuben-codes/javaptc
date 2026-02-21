package overloading;

class Car extends Vehicle{
	void speed(String mode)
	{
		System.out.println("Car is running in"+mode+"mode");
	}
	public static void main(String[] args)
	{
		Car ob=new Car();
		ob.speed();
		ob.speed(100);
		
	}

}
