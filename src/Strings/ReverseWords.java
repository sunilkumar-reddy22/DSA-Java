package Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky  is  blue";  //we need to reverse it.
       String ans = reverse(s);
        System.out.println(ans);
    }
    static String reverse(String s){
        //Create string array to store the values and add call methods trim and split to seperete the indexs.
        String [] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length -1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
            return sb.toString();
    }
}
