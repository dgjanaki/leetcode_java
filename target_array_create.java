import java.util.Arrays;

public class target_array_create {
    public static void main(String[] args) {
        int[] nums ={0,1,2,3,4};
        int[] index ={0,1,2,2,1};
        System.out.println(Arrays.toString(create(nums, index)));
    }
    static int[] create(int[] nums,int[] index){
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // index[i]=nums[i];
            // res[i] = index[i];
        
            for (int j = i; j > index[i]; j--) {
                res[j] =res[j-1];
                // res[index[i]] = nums[i];
            }
            res[index[i]] = nums[i];
        }
        return res;
    }
}
