package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "sunil";
        String b = "sunil";
        check(a,b);
    }
    static void check(String a,String b){
        if(a == b){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
