package Math_For_Dsa;

public class PerfectSquare {
    public static void main(String[] args) {
        int num = 64;
       int ans = Find(num);
        System.out.println(ans);
    }
    static int Find(int num){
        int start = 0;
        int end = num;
        while(start <= end){
            int mid = start +(end -start)/2;
            if(mid * mid > num) {
                end = mid -1;
            }
            else{
                start = mid + 1;
            }

        }
        return end;
    }
}
