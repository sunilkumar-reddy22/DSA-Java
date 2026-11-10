package Math_For_Dsa;

public class CommonFactors {
    public static void main(String[] args) {
        int a = 25;
        int b = 30;
      int ans =  Factors(a,b);
        System.out.println(ans);
    }
    static int Factors(int a, int b){
        int count = 0;
        int limit = Math.min(a,b);
        for(int i = 1; i <= limit; i++){
            if(a % i == 0 && b % i == 0){
                count++;
            }
        }
        return count;
    }
}
