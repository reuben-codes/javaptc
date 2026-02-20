package methods;
import java.util.*;
public class stronger {
    int factorial(int d)
    {
        int fact=1;
        for(int i=1;i<=d;i++)
        {
            fact=fact*i;
        }
        return fact;
        
    }
        boolean isStrong(int n){
            int temp=n;
            int sum=0;
            while(n!=0){
                int d=n%10;
                sum=sum+factorial(d);
                n=n/10;
            }
            if(sum==temp){
                return true;
            }
            else{
                return false;
            }
            
        }
        public static void main(String[]args)
        {
            stronger ob=new stronger();
            Scanner ob1=new Scanner(System.in);
            System.out.println("Enter the no");
            int n=ob1.nextInt();
            if(ob.isStrong(n))
            {
                System.out.println("strong");
            }
            else
            {
                System.out.println("not strong");
            }
        }
}

