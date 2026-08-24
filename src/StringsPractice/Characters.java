package StringsPractice;

public class Characters {
    public static void main(String[] args) {
//        String series = "";
//        for(int i = 0; i < 26; i++){
//            char ch = (char)('a' + i);
//            series +=  ch;
//           // System.out.print(ch + " ");
//          //  System.out.println(series + "    ");
//        }
//        System.out.println(series);
//        //lets do with StringBuilder.
//        //StringBuilder is class and it has functions and properties.
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++){
            char ch = (char) ('a' + i);
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        System.out.println(sb.indexOf("s"));
        System.out.println(sb.delete(1,6));
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.indexOf("s",10));
        System.out.println(sb.length());

    }
}
