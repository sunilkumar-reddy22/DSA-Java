package Rvise_pattrens;

public class Pattren3 {
    public static void main(String[] args) {
        int n = 4;
        angle(n);
    }
    static void angle(int n){
      for(int row = 0; row < n * 2; row++){
          int totalColsInRow;
          if(row < n){
              totalColsInRow = row +  1;
          }
          else{
              totalColsInRow =  2 * n - row - 1; //totalrows -  current  row -1col down.
          }
          for(int j = 0; j < totalColsInRow; j++){
              System.out.print("* ");
          }
          System.out.println();
      }
    }
}
