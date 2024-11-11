import java.util.ArrayList;

public class ContainerWithMostWater {

    public static int maxArea(ArrayList<Integer> list) {
        int maxArea = 0;
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int area = Math.min(list.get(left), list.get(right)) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (list.get(left) < list.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(maxArea(list));
    }
}
