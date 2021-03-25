package algs.Advanced;

/**
 * @author datefate
 * @site create 2020-10-14-下午8:33
 */
public class Quick{
    public static  void sort(Comparable[] comparables){
        int hi = comparables.length -1;
        sort(comparables,0,hi);


    }

//    此处递归
//    lo hi 指针的变化
    private static void sort(Comparable[] a,int lo,int hi){
        if(lo>= hi) return;
        int i = lo;
        int j = getPartition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);

    }

    private static int getPartition(Comparable[] a,int lo,int hi){
        int i = lo;
        int j = hi +1 ;
        Comparable v = a[lo];
        while (true){
            if(less(a[++i],v)){
                if(i == hi)break;
            }
            if(less(v,a[--j])){
                if(i == lo)break;
            }
            if(i >= j)break;
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
    }

    private static boolean less(Comparable v, Comparable w) {
        if(v == w) return false;
        return v.compareTo(w) < 0 ;
    }

//    Comparable 接口数据转换为Object类
    private static void exch(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}
