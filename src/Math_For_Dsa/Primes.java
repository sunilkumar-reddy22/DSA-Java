package Math_For_Dsa;

public class Primes   {
    public static void main(String[] args) {
             int num = 70;
             //creating boolean array.
        boolean[] prime = new boolean[num + 1];
        FindPrime(num,prime);
    }
    static void FindPrime(int num , boolean [] prime){
        //slashing all the multiples.
        for(int i = 2; i <= num; i++){
            if(!prime[i]){
                for(int j = i*2; j <= num; j += i){
                    prime[j] = true;
                }
            }
        }
        for(int i = 2; i <= num; i++){
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }
    }
}
