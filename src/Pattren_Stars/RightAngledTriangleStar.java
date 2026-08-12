package Pattren_Stars;

public class RightAngledTriangleStar {
    public static void main(String [] args){
        int n = 4;
        Star(n);
    }
    static void Star(int n){
        //outer loop for rows.
        for(int rows = 1; rows <= n; rows++){
            for(int col = 1; col <= rows; col++){
                System.out.print("*" + " " );
            }
            System.out.println();
        }
    }
}
