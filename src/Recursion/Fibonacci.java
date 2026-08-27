package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int r = 3;
       int ans = fibo(r);
        System.out.println(ans);
    }
    static int fibo(int n){
        //base condition.
        if(n <= 1){
            return n;
        }//recursive call.
      return  fibo(n -1) + fibo(n - 2);
    }
}
