package Strings;

public class CallingIndexOf {
    public static void main(String[] args) {
        String name = "sunil kumar reddy";
        index(name);
    }
    static void index(String name){
        StringBuilder sb = new StringBuilder(name);
      int ans =  sb.lastIndexOf("u");
        System.out.println(ans);
        System.out.println(sb.toString());
        int res = sb.indexOf("u");
        System.out.println(res);
    }
}
