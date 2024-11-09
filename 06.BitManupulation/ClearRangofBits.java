public class ClearRangofBits {
        
        public static int clearRangeOfBits(int n, int i, int j) {
            int a = -1 << (j + 1);
            int b = (1 << i) - 1;
            int bitMask = a | b;
            return n & bitMask;
        }
        
        public static void main(String[] args) {
            int n = 10;
            int i = 2;
            int j = 4;
            System.out.println(clearRangeOfBits(n, i, j));
        }
}
