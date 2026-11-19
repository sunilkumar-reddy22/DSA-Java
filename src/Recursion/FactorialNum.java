package Recursion;

public class FactorialNum {
    public static void main(String[] args) {
        long n = 5;
        find(n);
    }
    static void find(long n){
        if(n < 1){
            return;
        }
        long ans = 1;
        for(long i = n; i >= 1; i--){
            ans = ans * i;
        }
        System.out.println(ans);
    }
}
