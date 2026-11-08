package Math_For_Dsa;

public class Factors {
    public static void main(String[] args) {
        int n = 20;
       // divisor(n);
        factors(n);
    }
    static void divisor(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    static void factors(int n){
        for(int i = 1; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == i){
                    System.out.println(i);
                }
                else{
                    System.out.println(i + " " + n/i);
                }
            }
        }
    }
}
