import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// when we create a subarray there sum  will be 0
public class sum3 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(sum(nums));
    }    

    static List<List<Integer>> sum(int[] nums){
     List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);//Sort an array

     int n =nums.length;
     for (int i = 0; i < n-2; i++) {
        int j=i+1;
        int k = n-1;
        
        
        if(i>0 && nums[i]==nums[i-1]) continue; //checking the duplicate

        while(j<k){
            int sum = nums[i] +nums[j] +nums[k];
            if(sum==0){
                res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                while (j<k && nums[j] == nums[j+1]) {
                    j++;                    
                }
                 while (j<k && nums[k] == nums[k-1]) {
                    k--;                    
                }
                j++;
                k--;
            }
            else if(sum>0){
                k--;
            }
            else{
                j++;
            }
        }
     }
     return res;
    }
}
