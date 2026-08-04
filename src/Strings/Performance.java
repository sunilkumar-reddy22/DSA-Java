package Strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for(int i  = 0; i < 26; i++){
            //we are printing the a to z and converting ascii values to characters.
            char ch = (char)('a' + i);
           // System.out.print(ch  + " , ");
            series = series + ch;  //here it is doing concatination.
        }
        System.out.println(series);
    }
}
