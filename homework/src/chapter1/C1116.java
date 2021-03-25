package chapter1;

public class C1116 {
    public static void main(String[] args) {
        String s = exR1(6);
        System.out.println(s);
    }

    public static String exR1(int N){
        if(N <= 0) return "";
        return exR1(N -3) + N + exR1(N  - 2 )+N;
    }
}
