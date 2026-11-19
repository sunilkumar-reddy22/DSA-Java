package Recursion;

public class ReverseFunction {
    public static void main(String[] args) {
        int n = 5;
        funrev(n);
       // merge(n);
    }
    static void funrev(int n){
        //print nums 5 to 1.
        //base condition
        if(n == 0){
            return;
        }
        //recursive function
        System.out.print(n + " ");
        funrev(n-1); //this is called tail recursion
        System.out.print(n + " ");
    }
    static void merge(int n) {
        //print nums 5 to 1.
        //base condition
        if (n == 0) {
            return;
        }
        //recursive function
       // System.out.print(n + " ");
        merge(n - 1);
        //I add print stream after recursive function this won't print's instantly.
        //it does all the function calls and returns the val where is it called from and prints it pop off from the stack memeory.
        System.out.print(n + " ");
    }
}
