package Rvise_pattrens;

public class Pattren30 {
    public static void main(String[] args){
        int n = 5;
        pattren30(5);
    }
    static void pattren30(int n){
        //creating outer for loop.
        for(int row = 1; row <= n; row++){
            //we need to create space in the console.
            //space is n -row.
            int space = n - row;
            for(int s = 0; s < space; s++){
                System.out.print("  ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
