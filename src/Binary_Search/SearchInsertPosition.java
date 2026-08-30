package Binary_Search;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 2;
       int ans = Find(nums,target);
        System.out.println(ans);
    }
    static int Find(int [] nums,int target){
        int start = 0;
        int end = nums.length -1;
        while(start < end){
            //finding the middle value for searching.
            int mid = start +(end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}
