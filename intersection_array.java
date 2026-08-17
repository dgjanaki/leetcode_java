import java.util.Arrays;
import java.util.HashMap;

public class intersection_array {

    public static void main(String[] args) {

        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2, 2};

        System.out.println(Arrays.toString(intersection(num1, num2)));
    }

    static int[] intersection(int[] num1, int[] num2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count elements of num2
        for (int num : num2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] res = new int[Math.min(num1.length, num2.length)];
        int k = 0;

        // Check elements of num1
        for (int num : num1) {

            if (map.containsKey(num) && map.get(num) > 0) {

                res[k] = num;
                k++;

                map.put(num, map.get(num) - 1);
            }
        }

        return Arrays.copyOf(res, k);
    }
}