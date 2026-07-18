package Leetcode_Sorting;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] nums = {1,2,0};
        int ans = Find(nums);
        System.out.println(ans);
    }
    static int Find(int [] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1; //cause the nums starts from 1 to n.
            //all three conditions should pass.
            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //checking the postive missing number.
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return index +1;
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
