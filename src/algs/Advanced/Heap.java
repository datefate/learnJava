package algs.Advanced;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author datefate
 * @site create 2020-11-29-下午9:13
 *
 *
 * @again 2020-12-1 18:37
 * @end  2020-12-1 20:19
 */
public class Heap {
     private Heap(){}

     // @param pq the array to be sorted
     public static void sort(Comparable[] pq){
         int length = pq.length;
         for (int k = length/2;k>=1;k--){
            sink(k,length,pq);
         }
         int k= length;
         while (k>1){
             exch(1,k--,pq);
             sink(1,k,pq);
         }
}

     private static void  sink(int k, int length,Comparable[] pq){
        while (2*k < length){
            int j = 2*k;
            if(j < length && less(j,j+1,pq)) j++;
            if(!less(k,j,pq))break;
            exch(k,j,pq);
            k = j;
        }
     }


    //i<k
     private static boolean less(int i,int k,Comparable[] pq){
         return pq[k-1].compareTo(pq[i-1])> 0;
     }

     // TODO 接口对象在比较数据时的转变为Object
     private static void exch(int i, int j, Object[] pq){
         Object T;
         T = pq[i-1];
         pq[i-1] = pq[j-1];
         pq[j-1] = T;
     }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }


    public static void main(String[] args) {

//        String[] a = StdIn.readAllStrings();
        String[] a = new String[]{"S" ,"O" ,"R" ,"T" ,"E","X" ,"A" ,"M","P", "L" ,"E"};
        edu.princeton.cs.algs4.Heap.sort(a);
        show(a);
    }
}
