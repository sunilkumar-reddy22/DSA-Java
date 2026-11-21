package Math_For_Dsa;

public class SubtractTheProductAndSum {
    public static void main(String[] args) {
        int n = 4421;
       int ans = find(n);
        System.out.println(ans);
    }
    static int find(int n){
        //For this sorta problems initialize variables at scoping
        int product = 1;
        int sum = 0;
       //using while loop
        while(n > 0){
            int rem = n % 10;
            product = product * rem;
            sum = sum + rem;
            n = n / 10;
        }
        return product - sum;
    }

}
