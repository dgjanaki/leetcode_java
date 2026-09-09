public class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1, right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left - 1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 8;
        int result = solution.mySqrt(x);
        System.out.println("The integer square root of " + x + " is: " + result);
    }
}