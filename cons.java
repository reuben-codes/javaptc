
package methods;

public class cons {
    String name;
    int age;
    double salary;
    
    cons(String n,int a)
    {
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println(name+""+age);
    }
    public static void main(String[] args) {
        cons ob=new cons("Reuben\n",34);
        ob.display();
        
        
    }
    
}
