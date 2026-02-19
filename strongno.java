package javaapplication17;
import java.util.*;
public class strongno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int sum=0;
        while(temp>0)
        {
            int digit=temp%10;
            int fact=1;
            for(int i=1;i<=digit;i++)
            {
                fact=fact*i;
            }
            sum+=fact;
            temp/=10;
                    }
        if(sum==a)
            System.out.println(a+"\nIs a strong no");
        else
            System.out.println(a+"\nIs not a strong number");
        sc.close();
            
            
        }
    }



