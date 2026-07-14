package Bubble_sort;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5,3,1,2,4};
       int [] ans = sort(nums);
        System.out.println(Arrays.toString(ans));
    }
    static  int [] sort(int[] nums) {
        //starting from 0th element to n-2
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    //if this condition is true and then it's should be swap.
                    swap(nums, j, j - 1);
                }
                else{
                    break;
                }
            }
        }
        return nums;
    }

    static void swap(int[] nums, int start, int large) {
        int temp = nums[start];
        nums[start] = nums[large];
        nums[large] = temp;
    }
}