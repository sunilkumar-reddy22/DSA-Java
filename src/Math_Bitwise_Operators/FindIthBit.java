package Math_Bitwise_Operators;

public class FindIthBit {
    public static void main(String[] args) {
          int num = 20;
          int i = 2;
         int ans = IsSet(num,i);
        System.out.println(ans);
    }
    static int IsSet(int num , int i){
        // i need to find the 2nd bit in the 20 integer bits.
        int result = num & 1 << i;
        return result;
    }
}
