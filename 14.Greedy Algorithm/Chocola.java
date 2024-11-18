import java.util.*;

public class Chocola {

    public static int chocola(int[] vCost, int[] hCost) {
        int h = hCost.length - 1, v = vCost.length - 1;
        int minCost = 0;
        int vp = 1, hp = 1;

        Arrays.sort(vCost);
        Arrays.sort(hCost);

        while (h >= 0 && v >= 0) {
            if (vCost[v] > hCost[h]) {
                minCost += vCost[v] * hp;
                v--;
                vp++;
            } else {
                minCost += hCost[h] * vp;
                h--;
                hp++;
            }
        }

        while (h >= 0) {
            minCost += hCost[h] * vp;
            h--;
            hp++;
        }

        while (v >= 0) {
            minCost += vCost[v] * hp;
            v--;
            vp++;
        }

        return minCost;
    }

    public static void main(String[] args) {
        int[] costVer = { 2, 1, 3, 1, 4 };
        int[] costHor = { 4, 1, 2 };
        System.out.println(chocola(costVer, costHor));
    }
}
