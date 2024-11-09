public class Check2power {
    
    public static boolean isPowerOf2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(isPowerOf2(n));
    }
}
