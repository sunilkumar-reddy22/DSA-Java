package Rvise_pattrens;

public class Pattren1 {
    public static void main(String[] args) {
        int n = 5;
        Angle(n);
    }
    static void Angle(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
