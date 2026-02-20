package methods;
import java.util.*;
public class neon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        int sum=0;
        int s=n*n;
        while(s!=0)
        {
            int b=s%10;
            sum=sum+b;
            s=s/10;
            
        }
        if(sum==n)
        {
            System.out.println("It is neon");
        }
        else
        {
            System.out.println("not neon");
        }
  
   }
    
}
