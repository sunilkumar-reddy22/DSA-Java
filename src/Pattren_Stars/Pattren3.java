package Pattren_Stars;

public class Pattren3 {
    public static void main(String [] args){
        int n = 5;
        Angle(n);
    }
    static void Angle(int n){
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= n -row+1 ; col++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
    }
}
