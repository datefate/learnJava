package algs.baseSort;

/**
 * 选择排序
 * @author datefate
 * @site create 2020-10-08-下午8:22
 */

public class Selection extends Example{

//    increase
    public static void sort(int[] nums){

        // 一下为错误的内容：min 作用域过大，在第一次结束后的过程中，min为发生变更
        /*
        int min = 0 ;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length&&less(nums[j],nums[min]);j++){
                min = j;
            }
            exch(nums,i,min);
        }
*/
        for(int i = 0;i<nums.length;i++){
            int min = i;
            for(int j = i+1;j<nums.length;j++){
                if(less(nums[j],nums[min]))
                min = j;
            }
            exch(nums,i,min);
        }

    }

    public static void main(String[] args) {
        int[] numbers = {3,1,4,8,10,18,9,2};
        Selection.sort(numbers);
        Selection.show(numbers);
    }

}
