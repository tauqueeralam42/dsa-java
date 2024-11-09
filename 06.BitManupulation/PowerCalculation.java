public class PowerCalculation {

    public static int powerCalculation(int a, int b) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res *= a;
            }
            a *= a;
            b >>= 1;
        }
        return res;
    }
    
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println(powerCalculation(a,b));
    }
}