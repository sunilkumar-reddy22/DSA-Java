package Math_For_Dsa;

public class OddAndEvenGcd {
    public static void main(String[] args) {
        int n = 8;
       int ans = find(n);
        System.out.println(ans);
    }
    static int find(int n){
        int odd = 0;
        int even = 0;
        for(int i = 1; i <= n * 2; i++){
            if(i % 2 == 0) {
                even = even + i; //for even numbers.
            }
            else{
                odd = odd + i;
            }
        }
        //System.out.println(odd + " " + even);
        return gcd(odd,even);
    }
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
}
