package Strings;
import java.util.Arrays;
public class ReverseString {
    public static void main(String[] args) {
       //char array
        char [] s = {'h', 'e', 'l', 'l', 'o'};
       char []  ans = Reverse(s);
        System.out.println(Arrays.toString(ans));
    }
    static char [] Reverse(char [] s){
        int left = 0;
        int right = s.length -1;
        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
}
