package chapter1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
public class C113 {
    public static void main(String[] args){
        int num1,num2,num3;
        StdOut.print("input 3 num");
        num1 = StdIn.readInt();
        num2 = StdIn.readInt();
        num3 = StdIn.readInt();
        StdOut.println("输入完毕");
        if(isequal(num1,num2,num3))
            StdOut.println("equal");
        else
            StdOut.println("not equal");


    }

    public static boolean isequal(int a,int b,int c){
        if(a == b && b == c)
            return true;
        else
            return false;
    }
}
