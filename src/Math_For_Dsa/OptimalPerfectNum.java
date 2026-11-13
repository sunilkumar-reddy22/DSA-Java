package Math_For_Dsa;

public class OptimalPerfectNum {
    public static void main(String[] args) {
        int num = 6;
      boolean ans =  Find(num);
        System.out.println(ans);
    }
    static boolean Find(int num){
        //Initialize result = 1; for not exceeding boundary.
        int result = 1;
        for(int i = 1; i < Math.sqrt(num); i++){
            //My condition.
            if(num % i == 0 && num/i != num){
                result = result + i + (num/i);
            }
        }
        return result == num;
    }
}
