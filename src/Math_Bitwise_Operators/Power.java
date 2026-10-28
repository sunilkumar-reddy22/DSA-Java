package Math_Bitwise_Operators;

public class Power {
    public static void main(String[] args) {
        int ans = 1;
        int base = 3;
        int power = 6;
        while(power > 0){
            if(((power & 1) == 1)){
                ans *= base;
            }
            //Doubling the base.
            base *= base;
            //extracting right most bit each time.
           power = power >> 1;
        }
        System.out.println(ans);
    }
}
