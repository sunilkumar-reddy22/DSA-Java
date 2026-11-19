package Recursion;

public class FactRecursion {
    public static void main(String[] args) {
        long n = 5;
       // factorial(n);
       long ans = fact(n);
        System.out.println(ans);
    }
    static void factorial(long n){
        long ans = 1;
        if(n == 0){
            return;
            //vase condition.
        }

       ans =  ans *= n;
        System.out.println(ans);
        factorial(n -1);
        //System.out.println(ans);
    }
    static long fact(long n){
        if(n == 1){
            return 1;
        }
        return n * fact(n-1);
    }

}
