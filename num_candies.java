import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class num_candies {
    public static void main(String[] args) {
        int[] arr ={2,3,5,1,3};
        int candy = 3;
        System.out.println(kidsWithCandies(arr,candy));
    }

    static List<Boolean> kidsWithCandies(int[] arr, int candy){
        List<Boolean> res = new ArrayList<>();
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for (int i = 0; i< arr.length; i++) {
            if(arr[i] + candy >=max)
                res.add(true);
            else
                res.add(false);
            
        }
        return res;

    }


        
}
