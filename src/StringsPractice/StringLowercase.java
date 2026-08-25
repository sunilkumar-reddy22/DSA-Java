package StringsPractice;

public class StringLowercase {
    public static void main(String[] args) {
        String s = "HELLO MATE! HOW ARE YOU";
        String ans = LowerCase(s);
        check(s);
        System.out.println(ans);
    }
    static String LowerCase(String s){
        String uppercase = s;
        String res = uppercase.toLowerCase();
        return res;
    }
    static void check(String s){
        String res = s.toLowerCase();
        System.out.println(res);
    }
}
