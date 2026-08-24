package StringsPractice;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abcdcba";
       boolean ans = check(s);
        System.out.println(ans);
    }
    static boolean check(String s){
        int start = 0;
        int end = s.length() -1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
