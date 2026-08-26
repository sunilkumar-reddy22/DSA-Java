package StringsPractice;
import java.util.Arrays;
public class Split {
    public static void main(String[] args) {
        String [] s = {"please wait", "continue to fight", "continue to win"};
       int ans = check(s);
        System.out.println(ans);
    }
    static int  check(String [] s){
//        StringBuilder sb = new StringBuilder(Arrays.toString(s));
//        System.out.println(sb);
        int max = 0;
        for (String sentence : s) {
            int words = 1;

            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    words++;
                }
            }

            max = Math.max(max, words);
        }
        return max;
    }
}
