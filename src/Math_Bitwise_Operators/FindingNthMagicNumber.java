package Math_Bitwise_Operators;

public class FindingNthMagicNumber {
    public static void main(String[] args) {
        int n = 6;
       int ans = MagicNumber(n);
        System.out.println(ans);
    }
    static int MagicNumber(int n){
        int ans = 0;
        int base = 5;
        //creating condition.
        while(n > 0){
            int last = n & 1; //gives us the last right most bit
            //now remove the right most bit in the "n" using Right shift operator"
            n = n >> 1;
            ans =  ans + last * base;
            base = base * 5;
        }
        return ans;
    }
}
