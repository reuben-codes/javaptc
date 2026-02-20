package methods;
public class fibonnaci {
    void fibonacci(int n)
    {
        int a=0,b=1;
        for(int i=1;i<=n;i++)
        {
            System.out.println(a+"");
            int c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        fibonnaci ob=new fibonnaci();
        ob.fibonacci(7);
        
    }
}
