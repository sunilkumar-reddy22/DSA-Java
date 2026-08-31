package Binary_Search;

public class ReturnTarget {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        int target = 7;
       int ans = Find(nums,target);
        System.out.println(ans);
    }
    static int Find(int [] nums, int target){
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start +(end - start) /2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{  //if end is > target the mid - 1;
                end = mid -1;
            }
        }
        return -1;
    }
}
