package inherit;

import java.util.Arrays;

/**
 * @author datefate
 * @site create 2020-09-18-上午10:38
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("datefate",22000,1998,4,10);
        staff[1] = new Employee("Asura",8000,2000,1,1);
        staff[2] = new Employee("GG",100000,2000,6,1);
        Arrays.sort(staff);
        for(Employee e:staff)
        System.out.println("name:"+e.getName()+"salary:"+e.getSalary() );
    }
}
