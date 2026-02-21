package overloading;

public class Calculator {
static void calci(int a,int b)
{
	System.out.println(a+b);
	
}
static void calci(double a,double b)
{
	System.out.println(a*b);

}
public static void main(String[] args)
{
	calci(5,8);
	calci(10.2,1.1);
}
}
