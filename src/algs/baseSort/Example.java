package algs.baseSort;

/**
 * 基于algs4 的模板
 * int 实现
 * @author datefate
 * @site create 2020-10-08-下午8:05
 */
public class Example {

    public static void sort(int[] nums){

    }
//    交换i、j 元素位置
    public static void exch(int[] nums ,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

//    i<j
    public static boolean less(int i,int j){
        return i<j;
    }
    public static void show(int[] nums){
        for(int a : nums){
            System.out.println(a);
        }
    }

    public static boolean isSorted(int[] nums){
        for(int i = 0;i<nums.length;i++){
            if(less(nums[i+1],nums[i]))return false;
        }
        return true;
    }

    public static void main(String[] args) {
    }

}
