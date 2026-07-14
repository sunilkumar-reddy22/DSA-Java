package Bubble_sort;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int [] nums = {5,-,4,3,1,2};
       int [] ans = sort(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int [] sort(int [] nums){
        for(int i = 0; i < nums.length; i++){
            //Finding the last element for every pass i need to skip the sorted elements.
            int last = nums.length -i -1;
            //now finding the largest maximum index;
            int maxIndex = getIndex(nums,0,last);
            //NowPlacing the correct place with swap function.
            swap(nums,maxIndex,last);
        }
        return nums;
    }
    static void swap(int [] nums,int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        //now the maxIndex value is going to the last index in the respective array.
        nums[second] = temp;

    }
    static int getIndex(int [] nums,int start, int end){
        //finding the max index element.
        int max = start;
        for(int i = start; i <= end; i++){
            if(nums[max] < nums[i]){
                max = i;
            }
        }
        return max;

    }
}