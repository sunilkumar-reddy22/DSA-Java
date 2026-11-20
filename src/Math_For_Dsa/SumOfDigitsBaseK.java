package Math_For_Dsa;

public class SumOfDigitsBaseK {
    public static void main(String[] args) {
        int n = 10;
        int k = 10;
       int ans = sum(n,k);
        System.out.println(ans);
    }
    static int sum(int n,int k){
        int ans = 0;
        while(n > 0){
//            if(n == 10){
//                return 1;
//            }
           int rem = n % k;
           ans = ans + rem;
           n = n/k;
        }
        return ans;
    }
}
