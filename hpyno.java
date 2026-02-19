/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;
import java.util.*;
public class hpyno {
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        while(temp!=1 && temp!=4){
            int sum=0;
            while(temp!=0){
                int dig=temp%10;
                sum+=dig*dig;
                temp/=10;
            }
            temp=sum;
        }if(temp==1){
            System.out.println("It is happy number");
        }else{
            System.out.println("It is not a happy number");
        }
    }
}
