package Pattren_Stars;

public class Pattren2 {
    public static void main(String[] args) {
        int n = 5;
        Star(n);
    }
    static void Star(int n){
        for (int row = 1; row <= n ; row++) {
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
