package Strings;

import static Strings.ReverseWords.reverse;

public class ReverseStringsTwo {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
       String ans = Reverse(s);
        System.out.println(ans);
    }
    static String Reverse(String s){
        String [] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length; i++){
           sb.append(reverse(words[i]));
            if( i < words.length -1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
