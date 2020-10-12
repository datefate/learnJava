package algs.baseSort;

/**
 * @author datefate
 * @site create 2020-10-09-上午9:40
 */

public class Shell {

    public static void sort(int[] nums){
        int N = nums.length;int[] numbers = {3,1,2,8,7,5,9,2};
        int h = 1;
        while (h<N/3) h = h*3+1;
        while (h>=1) {
            for (int i = h; i < N; i++) {
//                注释掉的错误代码会导致数组越界
//                for (int j = i; j > 0 && less(nums[j], nums[j - h]); j-=h) {
                for (int j = i; j >=h && less(nums[j], nums[j - h]); j-=h) {
                    exch(nums, j, j - h);
                }

            }
            h=h/3;
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
        Shell.sort(numbers);
        Shell.show(numbers);
    }

}

