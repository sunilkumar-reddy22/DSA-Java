package Strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
      int ans = LengthOfWord(s);
        System.out.println(ans);
    }
   static int LengthOfWord(String s){
        //StringBuilder sb = new StringBuilder();
       int count = 0;
       int i = s.length() -1;
       while(i >= 0 && s.charAt(i) == ' '){
           i--;
       }
       while(i >= 0 && s.charAt(i) != ' '){
           count++;
           i--;
       }
       return count;
   }
}

