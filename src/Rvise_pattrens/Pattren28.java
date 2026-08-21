package Rvise_pattrens;

public class Pattren28 {
    public static void main(String[] args) {
        int n = 5;
        Diamond(n);
    }
    static void Diamond(int n){
        for(int row = 0; row < 2 * n; row++){
            int totalColsInRows = row < n ? row : 2 * n - row;
            int TotalSpaces = n - totalColsInRows;
            for(int s = 0; s < TotalSpaces; s++){  //this gives space
                System.out.print(" ");
            }
            for(int col = 0; col < totalColsInRows; col++){
                System.out.print("* "); //This statements stars in right place.
            }
            System.out.println(); //this statement prints new line
        }
    }
}
