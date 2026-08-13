package Pattren_Stars;

public class Pattren28 {
    public static void main(String[] args) {
        int n = 5;
        Diamond(n);
    }
    static void Diamond(int n){
        for(int row = 0; row < 2 * n; row++){
            int totalColsInRow = row > n ? 2 * n - row : row;
            int nOfSpaces = n -  totalColsInRow;
            for(int s = 0; s < nOfSpaces; s++) {
                System.out.print(" ");
            }
            for(int col = 0; col < totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
