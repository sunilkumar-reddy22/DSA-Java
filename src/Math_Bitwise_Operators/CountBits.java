package Math_Bitwise_Operators;

public class CountBits {
    public static void main(String[] args) {
        int num = 6;
       int ans = Count(num);
        System.out.println(ans);
    }
    static int Count(int num){
        int count = 0;
        while(num > 0){
            num = num >> 1;
            count++;
        }
        return count;
    }
}
