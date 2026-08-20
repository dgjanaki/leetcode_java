public class ceiling{
    public static void main(String[] args) {
        char[] arr = {'x','x','y','y','z'};
        char target = 'z';
        // char ans = ceiling_num(arr,target);
        // System.out.prcharln("found at the index " +arr[ans]);
        System.out.println(ceiling_num(arr, target));
    }

    static char ceiling_num(char[] arr,char target){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid =start+(end-start)/2;  //instead of using (s+e) we use s+(e-s)/2 cause sometimes mid values exceeds than chareger value
           
            if(arr[mid]<=target){  //end has same index but staart will be veries
                start = mid +1;
            }
            else { //start has same index but end will be veries
                end =mid-1;
            }
            
            
        }
            return arr[start%arr.length];
        
    }
}

