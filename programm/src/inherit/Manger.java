package inherit;

/**
 * @author datefate
 * @site create 2020-09-上午10:23
 */
public class Manger extends Employee {
    private double bonus;
    public Manger(String name,double salary,int year,int month,int day){
        super(name,salary,year,month,day);
        bonus = 0;

    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return super.getSalary()+bonus;
    }
}
