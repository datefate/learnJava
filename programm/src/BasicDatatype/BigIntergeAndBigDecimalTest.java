package BasicDatatype;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * @author datefate
 * @site create 2020-09-17-上午10:42
 */
public class BigIntergeAndBigDecimalTest {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("100000000000");
        BigInteger bigInteger1 = new BigInteger("7878787897");
        bigInteger = bigInteger.add(bigInteger1);//add
        System.out.println("bigInteger+bigInteger1:"+bigInteger);
        //减法:subtract()  negate()返回负数,
        System.out.println(bigInteger1.negate());
        BigInteger de = bigInteger.add(bigInteger1.negate());
        System.out.println("big:"+bigInteger);
        System.out.println("大数减法："+ de );
        BigInteger subtract1= bigInteger.subtract(bigInteger1);
        System.out.println(subtract1);

        //multiply :*
        BigInteger multiplyResult =bigInteger.multiply(bigInteger1);
        System.out.println("multiply :"+multiplyResult);

        //divide:指定精度
        /*
        RoundingMode {
    UP(0),
    DOWN(1),
    CEILING(2),
    FLOOR(3),
    HALF_UP(4),------------四舍五入
    HALF_DOWN(5),
    HALF_EVEN(6),
    UNNECESSARY(7);
         */
        BigDecimal d1 = new BigDecimal("123.456");
        BigDecimal d2 = new BigDecimal("23.456789");
        BigDecimal d3 = d1.divide(d2, 10, RoundingMode.HALF_UP); // 保留10位小数并四舍五入
        //BigDecimal d4 = d1.divide(d2); // 报错：ArithmeticException，因为除不尽

        System.out.println("divide : "+d3);

        //divideAndRemainder：做除法的同时求余数

        BigDecimal n = new BigDecimal("12.345");
        BigDecimal m = new BigDecimal("0.12");
        BigDecimal[] dr = n.divideAndRemainder(m);
        System.out.println(dr[0]); // 102
        System.out.println(dr[1]); // 0.105



    }
}
