package Math_For_Dsa;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 7;
       boolean ans = Find(num);
        System.out.println(ans);
    }
    static boolean Find(int num){
        int result = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                result = result + i;
            }
        }
        return result == num;
    }
}
