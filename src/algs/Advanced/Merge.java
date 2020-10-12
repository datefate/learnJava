package algs.Advanced;

/**
 * @author datefate
 * @site create 2020-10-11-上午10:23
 */
public class Merge {

    Merge(){}

    private static void merge(int[] a ,int[] aux,int lo,int mid ,int hig){
        int i = lo;
        int j =mid+1;
        //每次访问数组2次，进行比较，未对指针进行限制：j、k存在越界

        for(int k = lo;k<=hig;k++){
            if(a[i] > a[j]){
                aux[k] = a[j++];
            }
            else{
                aux[k]=a[i++];
            }
        }
    }
}
