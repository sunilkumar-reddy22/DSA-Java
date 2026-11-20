package Recursion;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 2345;
        int ans =reverse(n);
        System.out.println(ans);
    }
    static int reverse(int n){
        if(n < 0){
            return negative(n);
        }
        int ans = 0;
        while(n > 0){
             int rev = n % 10;
            ans = ans * 10 + rev;
            n = n/10;
        }
        return ans;
    }
    static int negative(int n){
        return 0;
    }
}
