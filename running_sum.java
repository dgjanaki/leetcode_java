import java.util.Arrays;

class running_sum {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        runningsum(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] runningsum(int[] arr){
        // int sum=0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum = sum+ arr[i];  //sum=1; a[0]=1
        //     arr[i]=sum;
        // }
        // return sum;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i] + arr[i-1];
        }
        return arr;
    }
    
}