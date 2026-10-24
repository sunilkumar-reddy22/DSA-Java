package Math_Bitwise_Operators;

public class SetRightMostOne {
    public static void main(String[] args){
         int num = 12;
         Twoscompliment(num);
    }
    static void Twoscompliment(int num){
        int result = num & (-num);
        System.out.println(result);
    }
}
