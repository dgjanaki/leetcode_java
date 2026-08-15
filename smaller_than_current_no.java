// Given the array nums, for each nums[i] find out how many numbers 
// in the array are smaller than it. That is, 
// for each nums[i] you have to count the number of valid j's such that
//  j != i and nums[j] < nums[i].

import java.util.Arrays;

public class smaller_than_current_no {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(current(arr)));
    }
    static int[] current(int[] arr){
       
       int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            
            int count = 0;
            for (int j = 0;  j < arr.length; j++) {
                if(arr[i]>arr[j])
                     count++;
               
            }
          
            res[i] = count;
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(count);
            
        // }
        return res;
    }
    
}
