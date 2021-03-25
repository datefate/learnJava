package CollectionL;

import java.util.List;
import java.util.Objects;

/**
 *
 * 正确复写equals 影响对类的使用：
 * 其他类在使用时会调用类的equals方法，覆写不正确会得到错误的结论
 * @author datefate
 * @site create 2020-11-01-上午10:42
 */
public class Equals {


    public static void main(String[] args) {
        List<PersonA> personAList = List.of(new PersonA("liiu",12)
        ,new PersonA("tmd",19)
        );


        System.out.println(personAList.contains(new PersonA(null,19)));
    }


}

class PersonA{
    public String name;
    public int age;

    public PersonA(String name, int i) {
        this.name = name;
        this.age =i ;
    }

    public boolean equals(Object o){
        //如果字符串为null，则equals方法会报错
        /*
        if(o instanceof PersonA){
            PersonA p  = (PersonA) o;
            return this.name.equals(p.name) &&this.age == p.age;

        }*/
        if(o instanceof PersonA){
            PersonA p  = (PersonA) o;
            return Objects.equals(this.name,p.name) &&this.age== p.age;
        }
        return false;
    }
}
