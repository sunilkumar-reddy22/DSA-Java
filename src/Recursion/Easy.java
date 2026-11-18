package Recursion;

public class Easy {
    public static void main(String[] args) {
        int n = 5;
        print(n);

    }
    static void  print(int n){
        //this is the base condition,where this proves true it breaks the condition
       if(n == 0){
          // System.out.println(n);
           return;
       }
        System.out.println(n);
       //every rotation it reduces the number.
       print(n-1);
    }
}
