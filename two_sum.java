package leetcodes;

import java.util.Scanner;
public class two_sum{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        int target = input.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (nums[i] + nums[j] == target) {

                    System.out.println("[" + i + "," + j + "]");
                    return;
                }
            }
        }

        input.close();
    }
}