package Rvise_pattrens;

public class Pattren17 {
    public static void main(String[] args) {
        int n = 5;
        pattren17(n);
    }
    static void pattren17(int n){
        for(int row = 1; row <= 2 * n; row++){
            //creating space.
            int c = row < n ? row: 2 * n - row;
            for(int space = 0; space < n -c; space++){
                System.out.print("  ");
            }
            //first side of columns
            for(int col = c; col >= 1; col--){
                System.out.print(col + " ");
            }
            //second side columns.
            for(int col = 2; col <= c; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
