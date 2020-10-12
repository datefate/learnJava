package algs.baseSort;

/**
 * 插入排序
 *
 * @author datefate
 * @site create 2020-10-09-上午9:03
 */
public class Insert extends Example{


    public static void sort(int[] nums){
        for(int i = 1;i<nums.length;i++){
            for (int j=i;j>0 && less(nums[j],nums[j-1]);j--) {
                exch(nums,j,j-1);
            }
        }

    }

    public static void main(String[] args) {
        int[] numbers = {3,1,2,8,7,5,9,2};
        Insert.sort(numbers);
        Insert.show(numbers);
    }

}
