package Math_Bitwise_Operators;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 990;
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }
}
