package Math_For_Dsa;

public class GcdOfAnArray {
    public static void main(String[] args) {
        int [] nums = {2,4,8};
       int ans = Find(nums);
        System.out.println(ans);
    }
    static int Find(int [] nums){
        int a = nums[0];
        int b = nums[0];
        for(int num : nums){
            a = Math.min(a, num);
            b = Math.max(b, num);
        }
        return gcd(a,b);
    }
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
}
