public class SetithBit {

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
    
    public static void main(String[] args){
        int n = 5;
        int i = 1;
        System.out.println(setIthBit(n, i));
    }
}
