package Math_For_Dsa;

public class CountTheDigitsDividesNumber {
    public static void main(String[] args) {
        int num = 121;
       int ans = Find(num);
        System.out.println(ans);
    }
    static int Find(int num){
        int count = 0;
        int orignal = num;
        while(num > 0){
            int val = 0;
            val = num % 10;
            if(orignal % val == 0){
                count++;
            }
            //remove last digit;
            num = num / 10;
        }
        return count;
    }
}
