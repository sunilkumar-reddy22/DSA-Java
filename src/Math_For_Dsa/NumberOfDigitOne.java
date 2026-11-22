package Math_For_Dsa;

public class NumberOfDigitOne {
    public static void main(String[] args) {
        int n = 13;
      int ans = findone(n);
        System.out.println(ans);
    }
    static int count = 0;
    static int findone(int n){
        //base condition.
        if(n == 0){
            return n;
        }
        for(int i = 1; i <= n; i++){
            if(i == 1 || i == 11){
                count++;
            }
            if(i >= 10){
                return check(i);
            }

        }
        return count;
    }
    static int check(int i){
       // int ans = 0;
        while(i > 0) {
            int ans = i % 10;
            if (ans == 1) {
                count++;
            }
            i = i / 10;
        }
        return count;
    }
}
