package StringsPractice;

public class ReverseStringII {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
      String ans = Reverse(s,k);
        System.out.println(ans);
    }
    static String Reverse(String s , int k){
        //creating StringBuilder
        StringBuilder sb = new StringBuilder(s);
        for(int start = 0; start < sb.length(); start += 2 * k){
            int right = Math.min(start + k - 1, sb.length() -1); //for getting valid index and not exceeding the limit of the size.
            int left = start; //starting index to reverse.
            while(left < right){
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right , temp);
                left++; //for skipping to next
                right--;
            }
        }
        return sb.toString();

    }
}
