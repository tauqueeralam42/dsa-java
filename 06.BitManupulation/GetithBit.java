public class GetithBit {

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        return (n & bitMask) > 0 ? 1 : 0;
    }
    
    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        System.out.println(getIthBit(n, i));
    }
}
