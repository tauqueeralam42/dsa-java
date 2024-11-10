public class Tilling {
    
    public static int tilling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return tilling(n - 1) + tilling(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(tilling(4));
    }
}
