package Math_Bitwise_Operators;

public class ZeroToA {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
       int res = xor(b) ^ xor(a -1);
        System.out.println(res);
    }
    static int xor(int a){
        if(a % 4 == 0){
            return a;
        }
        if(a % 4 == 1){
            return 1;
        }
        if(a % 4 == 2) {
            return a+1;
        }
        if(a % 4 == 3) {
            return a;
        }
        return 0;

    }
}
