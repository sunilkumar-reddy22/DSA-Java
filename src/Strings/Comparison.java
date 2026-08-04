package Strings;

public class Comparison {
     public static void main(String[] args) {
        String a = "sunil";
        String b = "sunil";
        check(a,b);
        String name1 = new String("sunil");
        String name2 = new String("sunil");
        compare(name1,name2);
    }
    static void check(String a,String b){
        if(a == b){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    static void compare(String name1,String name2){
        //if(name1.equals == name2.equals);
        //Here we are checking the object values are equals,using equals method which java provided"
        if(name1.equals(name2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("Nope!");
        }
    }

}
