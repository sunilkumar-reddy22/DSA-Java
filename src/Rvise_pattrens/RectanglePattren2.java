package Rvise_pattrens;

public class RectanglePattren2 {
    public static void main(String[] args) {
        int n = 5;
        angle(n);
        Triangle(n);
    }
    static void angle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
           // System.out.println();

        }
        System.out.println("\n");
    }
    static void Triangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}


