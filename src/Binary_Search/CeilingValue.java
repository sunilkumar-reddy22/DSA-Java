package Binary_Search;

public class CeilingValue {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,9};
        int target = 8;
       int ans = Ceiling(nums,target);
        System.out.println(ans);
    }
    static int Ceiling(int [] nums , int target){
        int ans = 0;
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start +(end - start)/2;
            if(target > nums[nums.length -1]){
                return -1;
            }
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                ans = mid;
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;

    }
}
