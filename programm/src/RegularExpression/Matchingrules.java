package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author datefate
 * @site create 2021-03-04-下午4:36
 */
public class Matchingrules {
    public static void main(String[] args) {
//        String s = "\\w*dendrix_frequency.\\w*";
//        String s2 = "cesc_dendrix_frequency.txt";
//        System.out.println(s2.matches(s));
//        System.out.println(s);

        getSome();


    }

    public static void getSome(){
        String s = "/winDiskD/D/Graduate/results/ACC/cesc_dendrix_frequency.txt";
        Pattern p  = Pattern.compile("()([a-z]{1,4})\\_(\\w*.*)");
        Matcher m = p.matcher(s);
        if (m.matches()) {
            String s1 = m.group(1);
            System.out.println(s1);

        }else System.out.println("nullshift");
    }
}
