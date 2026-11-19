package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
      int ans =  sum(n);
     int res = product(n);
        System.out.println(ans);
        System.out.println(res);
    }
    static int sum(int n){
     if(n == 1){
         return n;
     }
     return (n%10) + sum(n/10);
    }
    static int product(int n){
        if(n%10 == n){
            //then return n
            return n;
        }
        return (n%10) + product(n/2);
    }
}
