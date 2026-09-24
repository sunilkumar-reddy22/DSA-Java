package Math_Bitwise_Operators;

public class unique {
    public static void main(String[] args) {
        int [] nums = {2,4,5,6,5,4,2};
       int ans = find(nums);
        System.out.println(ans);
    }
    static int find(int [] nums){
        int res = 0;
        for(int n : nums){
            res ^= n;
        }
        return res;
    }

}