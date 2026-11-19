package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
      int ans =  sum(n);
        System.out.println(ans);
    }
    static int sum(int n){
     if(n == 1){
         return n;
     }
     return (n%10) + sum(n/10);
    }
}
