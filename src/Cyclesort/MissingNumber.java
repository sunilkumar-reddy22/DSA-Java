package Cyclesort;
import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args) {
        int [] nums = {4,0,2,1};
       int  ans = Find(nums);
        System.out.println(ans);
    }
    static int Find(int [] nums){
        //Here in the 0 to n 3 is missing and i need to return it.
        int i  = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int [] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
