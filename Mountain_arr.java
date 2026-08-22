public class Mountain_arr {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,7,9,7,12,5,3,2};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        int start = 0;
        int end =arr.length-1;
        while (start<end) {
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid-1;
            }
             if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }

        }
        return start;
       
    }
}
