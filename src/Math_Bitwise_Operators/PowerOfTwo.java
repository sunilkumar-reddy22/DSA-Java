package Math_Bitwise_Operators;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 32;
       boolean ans = Power(n);
        System.out.println(ans);
    }
    static boolean Power(int n){
        return n > 0 && (n &(n  -1)) == 0;
    }
}
