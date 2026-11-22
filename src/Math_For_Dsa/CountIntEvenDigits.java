package Math_For_Dsa;

public class CountIntEvenDigits {
    public static void main(String[] args) {
        int num = 30;
       int ans = find(num);
        System.out.println(ans);
    }
    //static int count = 0;
    static int find(int num){
        int count = 0;
        for(int i = 1; i <= num; i++){

            if((hasEvenDigitSum(i))){
                count++;
            }

        }
        return count;
    }
    static boolean hasEvenDigitSum(int i){
        int digits = 0;
        while(i > 0){
            int ans = i % 10;
            digits = digits + ans;
            i = i / 10;
        }
        return digits % 2 == 0;
    }
}
