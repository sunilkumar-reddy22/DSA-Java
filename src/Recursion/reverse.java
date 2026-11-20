package Recursion;

public class reverse {
    public static void main(String[] args) {
        int n = 321;
        find(n);
        System.out.println(sum);
    }
    static int sum = 0;
    static void find(int n){

        if(n == 0){
            return;
        }
        int ans = n % 10;
        sum = sum * 10 + ans;
         find(n/10);

    }
}
