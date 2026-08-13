package Pattren_Stars;

public class Pattren4 {
    public static void main(String[] args) {
        int n = 5;
        Angle(n);
    }
    static void  Angle(int n){
        //In this Example each row = col.
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
