import java.util.Arrays;

public class highest_altitude {
    public static void main(String[] args) {
        int[] arr ={-4,-3,-2,-1,4,3,2};
        
        System.out.println(Arrays.toString(arr));
        System.out.println(highaltitude(arr));

    }
    static int highaltitude(int[] arr){
        int sum = 0;
        int max=0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum = sum + arr[i];
        //     arr[i] = sum;
        // }
        // return sum;
        //  System.out.println(Arrays.toString(arr));
       
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            // arr[i] = sum;
         
        
           if(sum>max){
                max=sum;
            }
        }
        return max;
    }
    
}
