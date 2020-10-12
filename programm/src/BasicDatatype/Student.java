package BasicDatatype;

/**
 * @author datefate
 * @site create 2020-09-18-上午9:43
 */
public class Student implements Person{
    String name;
    public Student(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
