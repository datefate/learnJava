package algs.baseSort;

/**
 * 插入排序
 * @author datefate
 * @site create 2020-10-09-上午9:03
 */
public class Insert{

    public static void sort(int[] nums){
        for(int i = 1;i<nums.length;i++){
            for (int j=i;j>0 && less(nums[j],nums[j-1]);j--) {
                exch(nums,j,j-1);
            }
        }

    }
    //    交换i、j 元素位置
    private static void exch(int[] nums ,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    //    i<j
    private static boolean less(int i,int j){
        return i<j;
    }
    private static void show(int[] nums){
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
        int[] numbers = {3,1,2,8,7,5,9,2};
        Insert.sort(numbers);
        Insert.show(numbers);
    }

}
