package Cyclesort;
import java.util.Arrays;
public class SortNumbers {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
         Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int [] nums){
        //let my index pointer be i = 0.
        int i = 0;
        while(i < nums.length){
            //correct it is in the correct index or not.
            int correct = nums[i] -1; //it gives the value of the index should be in which place.
            //write a if condition,It should be if the current number is not = to the index that means it is at the wrong index.
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            } else{
                i++;
            }
        }

    }
    static void swap(int [] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
