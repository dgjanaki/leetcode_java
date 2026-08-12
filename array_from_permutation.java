// This code has O(n) complexity so we want this in O(1)

/*  
import java.util.Arrays;

class array_from_permutation {
    public static void main(String[] args) {
        int[] nums ={0,2,1,5,3,4};
        int res[] = permutation(nums);
        System.out.println(Arrays.toString(res));
    }

    static int[] permutation(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
       
            
        return ans;
      
    }

    
}
*/

import java.util.Arrays;

class array_from_permutation {
    public static void main(String[] args) {

        int[] nums = {0, 2, 1, 5, 3, 4};

        int n = nums.length;

        // Store old value + new value together
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + (nums[nums[i]] % n) * n;
        }

        // Extract the new values
        // for (int i = 0; i < n; i++) {
        //     nums[i] = nums[i] / n;
        // }

        System.out.println(Arrays.toString(nums));
    }
}