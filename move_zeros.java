import java.util.Arrays;

public class move_zeros {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        int[] res=move(arr);
        System.out.println(Arrays.toString(res));

    }

    static int[] move(int[] arr){
        // int[] res=new int[arr.length];
        int left = 0;
        
        for (int  right = 0; right < arr.length; right++) {
            if(arr[right]!=0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left]=temp;
                left++;
            }
        }
        return arr;
    }
}
