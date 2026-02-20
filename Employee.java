package methods;

public class Employee {
    String name;
    int id;
    double salary;
    
    Employee(String n,int i,double s)
    {
        name=n;
        id=i;
        salary=s;
    }
    void display()
    {
        System.out.println("Name="+name);
        System.out.println("id="+id);
        System.out.println("salary="+salary);


    }
    
    public static void main(String[] args) {
        Employee e1=new Employee("Reuben",1,10000);
        Employee e2=new Employee("Vyshnav",2,40000);
        e1.display();
        e2.display();

        
    }
}
