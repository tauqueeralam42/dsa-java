import java.util.*;
import java.util.Collection;

public class CoinChange {

    public static void findMinCoins(int[] coins, int amount) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = coins.length;
        int count = 0;

        Arrays.sort(coins);

        for (int i = n - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                result.add(coins[i]);
                count++;
            }
        }

        System.out.println("Minimum number of coins required: " + count);
        System.out.println("Coins are: " + result);
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
        int amount = 93;
        findMinCoins(coins, amount);
    }
}
