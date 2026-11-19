package Recursion;

public class basic {
    public static void main(String[] args) {
        int n = 5;
        find(n);
    }
    static void find(int n){
//        int x =  0;
//       x  = n--;
//       x = n;  // what the fuck now it is printing updated one i need to get back to fundamentals
//        System.out.println(n);
//        System.out.println(x);
//        int x = 0;
//        System.out.println(n);
//        x = n--;
//        System.out.println(x);
//        System.out.println(n);
        int x = n--;
        x = n--; //expresion means n = n-1 gotcha
        System.out.println(x);
        System.out.println(x);
        System.out.println(n);
    }
}
