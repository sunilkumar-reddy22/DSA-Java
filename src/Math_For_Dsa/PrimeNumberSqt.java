package Math_For_Dsa;

public class PrimeNumberSqt {
    public static void main(String[] args) {
        int num = 13;
        for(int i = 1; i <= num; i++){
            System.out.println(i + " " + isPrime(i));
        }
    }
    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        int c = 2;
        while( c * c <= num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
       return true;

    }
}
