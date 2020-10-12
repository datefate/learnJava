package BasicDatatype;

/**
 * I hate java
 * 注意：Java对所有变量的处理和C、C++ 有些不同
 * @author datefate
 * @site create 2020-09-下午6:15
 */
public class ParamTest {
    public static void main(String[] args) {
        System.out.println("Testing numeric parameter");
        double percent =10;
        System.out.println("Before: percent = " + percent);
        tripleValue(percent);
        System.out.println("After: percent = " + percent);

        System.out.println("\nTesting state of object parameters");
        Employee2 harry = new Employee2("Harry", 50000);
        System.out.println("Before: salary = " + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary = " + harry.getSalary());

        System.out.println("Testing object parameters");
        Employee2 a = new Employee2("Asura",1000000);
        Employee2 b = new Employee2("Datefate",250);
        System.out.println("Before: a = " + a.getName()+ "，salary = "+a.getSalary());
        System.out.println("Before: b = " + b.getName()+ "，salary = "+b.getSalary());
        swap(a,b);
        System.out.println("After: a = " + a.getName() +"，salary = "+a.getSalary());
        System.out.println("After: b = " + b.getName() +"，salary = "+b.getSalary());



    }

    public static void tripleValue(double x){
        x*=3;
        System.out.println("End of method:x ="+x);
    }

    public static void tripleSalary(Employee2 e){
        e.raiseSalary(200);
        System.out.println("End of method: salary = " + e.getSalary());
    }
    public static void swap(Employee2 x, Employee2 y) {
        Employee2 tmp = x;
        x = y;
        y = tmp;
        // x = b y = a
        x.raiseSalary(200);
        System.out.println("End of method: salary = " + x.getSalary());
        System.out.println("End of method: E x = " + x.getName());
        System.out.println("End of method: E y = " + y.getName());
    }
}

class Employee2{
    private String name;
    private double salary;

    public Employee2(String n ,double s){
        name = n;
        salary =   s;

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent /100;
        salary += raise;

    }
}
