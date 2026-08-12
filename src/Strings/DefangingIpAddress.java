package Strings;

public class DefangingIpAddress {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        String result = Change(address);
        System.out.println(result);
    }
    static String Change(String address){
       StringBuilder sb = new StringBuilder(address);
       for(int i = 0; i < sb.length(); i++){
           if(sb.charAt(i) == '.'){
              // sb.setCharAt(i ,)
               sb.replace(i, i+1, "[.]");
               i += 2;
           }
       }
       return sb.toString();
    }
}
//static String change(String address) {
//    return address.replace(".", "[.]");
//}