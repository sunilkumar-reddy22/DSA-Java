package Strings;

public class Segments {
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        System.out.println(Segment(s));
    }
    static int Segment(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            //condition to count the segments.
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')){
                count++;
            }
        }
        return count;
    }
}
