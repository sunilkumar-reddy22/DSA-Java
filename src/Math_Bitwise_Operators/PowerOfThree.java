package Math_Bitwise_Operators;

public class PowerOfThree {
    public static void main(String[] args) {
        int n = 27;
       boolean ans = Find(n);
        System.out.println(ans);
    }
    static boolean Find(int n){
        while(n < 1){
            return false;
        }
        while(n % 3 == 0){
            n = n / 3;
        }
        return n == 1;
    }
}
