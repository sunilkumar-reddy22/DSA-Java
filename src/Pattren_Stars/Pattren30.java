package Pattren_Stars;

public class Pattren30 {
    public static void main(String[] args) {
         int n = 5;
         Triangle(n);
    }
    static void Triangle(int n){
        for(int row = 1; row <= n; row++){
            for(int space = 0; space < n - row; space++){
                System.out.print(" ");
            }
            for(int col = row; col >= 1; col--){ //this condition prints from row number to 1.
                System.out.print(col);

            }
            //This loop for printing 2 to row.
            for (int col = 2; col <= row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
