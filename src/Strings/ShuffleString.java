package Strings;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int [] index = {4,5,6,7,0,2,1,3};
        String result = Shuffle(s,index);
        System.out.println(result);
    }
    static String Shuffle(String s, int [] indices){
        char [] ch = new char[s.length()];
        for(int i = 0; i <s.length(); i++){
            ch[indices[i]] = s.charAt(i);
        }
        return new String(ch);
    }
}
