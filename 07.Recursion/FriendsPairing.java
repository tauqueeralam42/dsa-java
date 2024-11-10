public class FriendsPairing {

    public static int friendsPairing(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        return friendsPairing(n - 1) + friendsPairing(n - 2) * (n - 1);
    }
    
    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendsPairing(n));
    }
}
