public class ExponentialPower {
    

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = power(x, n / 2);
        if (n % 2 == 0) {
            return halfPower * halfPower;
        }
        else {
            return x * halfPower * halfPower;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
