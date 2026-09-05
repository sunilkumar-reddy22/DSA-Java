package Math_Bitwise_Operators;

public class PrimeorOdd {
    public static void main(String[] args) {
        int n = 77;
       boolean ans = isodd(n);
        System.out.println(ans);
    }
    static boolean isodd(int n){
        return (n & 1) == 1;
    }
}
