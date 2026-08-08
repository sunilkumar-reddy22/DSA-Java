package Strings;

public class ValidStringPalimdrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
       boolean ans = check(s);
        System.out.println(ans);
    }
    static boolean check(String s){
        //Firstly convert to lowercase.
        s = s.toLowerCase();
        StringBuilder sb  = new StringBuilder();
        //now store the strings to Charat
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }
       //Now checking it is palimdrome or not.
        int left = 0;
        int right = sb.length() -1;
        while(left < right){
            if(sb.charAt(left) != sb.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
