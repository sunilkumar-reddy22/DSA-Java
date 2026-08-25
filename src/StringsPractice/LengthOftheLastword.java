package StringsPractice;

public class LengthOftheLastword {
    public static void main(String[] args) {
        String s = "Hello World";
       int ans =  Word(s);
        System.out.println(ans);
    }
    static int Word(String s){
        int count = 0;
        int i = s.length() -1;
        //first while condition to check the value is greater than 0 and if it is equal to space skip it.
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' '){
            i--;
            count++;
        }
        return count;

    }
}
