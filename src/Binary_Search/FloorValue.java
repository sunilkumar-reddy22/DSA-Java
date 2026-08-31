package Binary_Search;

public class FloorValue {
    public static void main(String[] args) {
        int [] nums = {1,3,4,5,7};
        int target = 6; //in floor ans need to give 5.
       int ans = Floor(nums,target);
        System.out.println(ans);
    }
    static int Floor(int [] nums,int target){
        int ans = 0;
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start +(end - start)/2;
            if(nums[mid] == target){
                return target;
            }
            else if(nums[mid] < target){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return ans;
    }
}
