package Cyclesort;
import java.util.ArrayList;
import java.util.List;
public class FindAllDuplicates {
    public static void main(String[] args) {
         int [] nums = {4,3,2,7,8,2,3,1};
        List <Integer> ans = Find(nums);
        System.out.println(ans);
    }
    static List<Integer> Find(int [] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1; //Because the values are starting from 1 to n.
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index]);
            }
        }
        return ans;
    }
    static void swap(int [] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
