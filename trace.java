package methods;
import java.util.*;
public class trace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();
        int square=n*n;
        int temp=n;
        while(temp>0)
        {
            if(temp%10!=square%10)
            {
                System.out.println(n+"is not automorphic");
                return;
            }
            temp=temp/10;
            square=square/10;
        }
      System.out.println(n+"\nIs an auto morphic no");
        
    }
    
}
