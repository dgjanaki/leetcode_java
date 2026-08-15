import java.util.Arrays;

public class shuffle{
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        //System.out.println(Shuffle(arr, n));
        System.out.println(Arrays.toString(Shuffle(arr, n)));
    }

    static int[] Shuffle(int[] arr,int n){
        int res[] = new int[arr.length];
        for (int i = 0; i < n ; i++) {
            res[2 * i] = arr[i];
            res[2*i +1]=arr[i + n];         
        }
        return res;
    }
      
    
    
}