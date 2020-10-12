package reflection;

import inherit.Employee;

/**
 *
 * @author datefate
 * @site create 2020-10-04-上午11:05
 */
public class Main {
    public static void main(String[] args)throws Exception {
        //
        Class cla = Employee.class;
        System.out.println(cla);
        /**/
        Employee employee =new Employee();
        Class cla2 = employee.getClass();
        System.out.println(cla2);
        //
//        Class cla3 = Class.forName("Employee");
//        System.out.println(cla3);
    }
}
