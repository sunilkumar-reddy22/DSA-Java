package Bubble_sort;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
       int [] nums = {10,20,20,30,10};
      int [] ans = Sort(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Sort(int [] nums){
        int n = nums.length -1;
        //Time complexity O(n2).
        for(int i = 0; i < n; i++){
            for(int j = 0; j < nums.length -i -1; j++){
                if(nums[j + 1] < nums [j]){
                    int temp = nums[j];
                    //now swapping the adjecent sides.
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}
