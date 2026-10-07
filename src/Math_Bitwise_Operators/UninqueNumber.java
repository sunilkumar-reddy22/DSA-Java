package Math_Bitwise_Operators;
import java.util.Arrays;
public class UninqueNumber {
    public static void main(String[] args) {
        int [] nums = {2,3,4,2,3};
       // Find(nums);
        System.out.println((Find(nums)));
    }
    static int Find(int [] nums){
        int unique = 0;
        for(int n : nums){
            unique = unique ^ n;
        }
        return unique;
    }
}
