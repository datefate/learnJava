package inherit;

/**
 * @author datefate
 * @site create 2020-09-上午10:34
 */
public class MangerTest {
    public static void main(String[] args) {
        Manger boss =new Manger("fuck algs",10000,2000,1,1);
        boss.setBonus(500);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("harry",10000,2006,4,1);
        staff[2] = new Employee("datefate",8000,1998,4,5);
        for(Employee e: staff){
            System.out.println("name = "+e.getName()+",salary = "
            + e.getSalary());
        }
    }

}
