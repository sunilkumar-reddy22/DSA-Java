package StringsPractice;

public class ReverseWordsInaString {
    public static void main(String[] args) {
        String s = "the sky is blue";
       Reverse(s);
       //System.out.println(ans);
    }
    static void Reverse(String s){
        //creating a new string array.
        String [] word = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = word.length -1; i >= 0; i--){
            sb.append(word[i]);
            //creating space for every word after ending.
            if(i != 0){
                sb.append(" ");
            }
        }
       // return sb.toString();
        System.out.println(sb);
    }
}
