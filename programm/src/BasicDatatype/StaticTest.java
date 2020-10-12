package BasicDatatype;

/**
 * @author datefate
 * @site create 2020-09-下午5:58
 */
public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);
        for(Employee e:staff){
            e.setId();
            System.out.println("name:"+e.getName()+"id="+
                    e.getId()+",salary = " + e.getSalary());
        }
        System.out.println("nextid = "+Employee.getNextid());
    }


}

class Employee{
    private static int nextid = 1;
    private String name;
    private double salary;
    private int id;
    public Employee(String n ,double s){
        name = n;
        s = s;
        id = 0;
    }

    public static void setNextid(int nextid) {
        Employee.nextid = nextid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId() {
      this.id = nextid++;
    }

    public static int getNextid() {
        return nextid;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("HarryPoter",10000);
        System.out.println(employee.getName()+ ""+ employee.getSalary());
    }
}
