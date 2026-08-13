package Pattren_Stars;

public class Pattren5 {
    public static void main(String[] args) {
        int n = 5;
        Star(n);
    }
    static void Star(int n){
        for(int row = 0; row < 2 * n; row++){
            int totalColsInRow;
            if(row < n){
                totalColsInRow = row + 1;
            }
            else{
                totalColsInRow = 2 * n - row - 1;
            }
            for(int col = 0; col <= totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
