package StringsPractice;

public class Practice {
    public static void main(String [] args){
     String a = "sunil";
     String b = "sunil";
       // System.out.println(a == b);
        if(a == b){
            System.out.println(true);
        }
      //  String c = a;
       // System.out.println(c == a);
        //here the reference variables are not pointing to the same object.
        //They are living in the heap not in the string pool.
        String name = new String("sunil");
        String name1 = new String("sunil");
        System.out.println(name == name1);
        System.out.println(name.equals(name1));//here the .equals is an method for strings it wont care about what is pointing to ehat it checks the values are == are!
        System.out.println(name.charAt(0));
    }
}

