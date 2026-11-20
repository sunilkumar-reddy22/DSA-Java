package Recursion;

public class concept {
    public static void main(String[] args) {
        int n = 5;
        find(n);
    }
    static void find(int n){
        //base condition.
        if(n == 0){
            return;
        }
        System.out.println(n);
        find(--n); //n-- = n - 1; I think it prints 5 4 3 2 1.
        //gave stack overflow error cause n-- passes the n value not evaluated val.
        //--n does the job upfront
    }
}
