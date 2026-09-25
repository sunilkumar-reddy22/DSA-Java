package Math_Bitwise_Operators;

public class Uniquefour {
    public static void main(String[] args) {
        int [] nums = {2,3,4,2,3};
        int ans = Find(nums);
        System.out.println(ans);
    }
    static int Find(int [] ans ){
        int unique = 0; //starting from the  zero.
        //enhanced for each loop.
        for(int n : ans){
            unique = unique ^ n;
        }
        return unique;
    }
}
