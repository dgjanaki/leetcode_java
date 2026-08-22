// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

import java.util.Arrays;

public class find_elements {
    public static void main(String[] args) {
        int[] arr = {};
        int target=0;;
        System.out.println(Arrays.toString(foelement(arr, target)));
    }

    static int[] foelement(int[] arr ,int target){
        int[] ans ={-1,-1};
        ans[0] = search(arr, target, true);
        if(ans[0]!=-1){
            ans[1] =search(arr, target, false);
        }
        return ans;
    }

    static int search(int[] arr ,int target,boolean find){

        int start = 0;
        int ans =-1;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
               end=mid-1;
            }
            else if(arr[mid]<target){
                start =mid+1;
            }
            else{
                ans=mid;
                if(find){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

        }
        return ans;
    }

}
