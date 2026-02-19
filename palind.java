package javaapplication17;
import java.util.*;
public class palind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b;
        int temp=a;
        int rev=0;
        while(temp!=0)
        {
            b=temp%10;
            rev=rev*10+b;
            temp=temp/10;
            
        }System.out.println(rev);
        if(rev==a){
            System.out.println("It is a palindrome");
        }
            else
        {System.out.println("NOT A PALINDROME");
        }
    }
    
}
