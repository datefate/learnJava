package inherit;

import java.time.LocalDate;

/**
 * @author datefate
 * @site create 2020-09-上午10:23
 */
public class Employee implements Comparable<Employee> {

    private String name;
    public double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public Employee() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

/*
    Double.compare:

    public static int compare(double d1, double d2) {
        if (d1 < d2) {
            return -1;
        } else if (d1 > d2) {
            return 1;
        } else {
            long thisBits = doubleToLongBits(d1);
            long anotherBits = doubleToLongBits(d2);
            return thisBits == anotherBits ? 0 : (thisBits < anotherBits ? -1 : 1);
        }
    }

 */
    public int compareTo(Employee o) {
        return Double.compare(salary,o.salary);
    }
}
