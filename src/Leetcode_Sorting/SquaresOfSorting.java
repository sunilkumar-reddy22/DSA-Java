package Leetcode_Sorting;
import java.util.Arrays;
public class SquaresOfSorting {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
       int [] ans = Square(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Square(int[] nums) {
        //creating an new array to store the square values.
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] * nums[i];
        }
        return Sort(arr);
    }
    static int [] Sort(int [] arr){
        for(int i = 0; i < arr.length -1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
    static void swap(int [] arr, int start,int max){
        int temp = arr[start];
        arr[start] = arr[max];
        arr[max] = temp;
    }
}