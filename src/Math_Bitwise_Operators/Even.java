package Math_Bitwise_Operators;

public class Even {
    public static void main(String[] args) {
        int n = 71;
       boolean ans = iseven(n);
        System.out.println(ans);
    }
    static boolean iseven(int n){
        return ((n & 1) == 1);
    }

}
