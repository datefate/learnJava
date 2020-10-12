package BasicDatatype;

import edu.princeton.cs.algs4.StdOut;

import java.time.LocalDate;
import java.util.Date;
/**
 * @author datefate
 * @site create 2020-09-下午3:46
 */
public class DateAndLocalDate {
    public static void main(String[] args){
        Date birth = new Date();
        StdOut.println("date:"+birth);

        LocalDate localDate = LocalDate.now();
        StdOut.println(localDate);

        LocalDate setlocalDate = LocalDate.of(2000,1,1);
        StdOut.println("now Year:"+localDate.getYear());
        StdOut.println(localDate.getDayOfWeek());


    }
}
