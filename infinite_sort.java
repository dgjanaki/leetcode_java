import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class infinite_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr =   {3, 4, 5, 6, 7, 8, 9, 10, 23, 45, 50, 60, 70, 80, 90};
        // for (int i = 0; i <10; i++) {
        //     arr[i]=input.nextInt();
        // }
        // System.out.println("Array : ");
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(arr[i]);
        // }
        // System.out.println("Enter the target");
        // int target = input.nextInt();
        int target = 9;
        int start=0;
        int end = 1;
        while(target>arr[end]){
            int temp = end +1;
            end = end +(end-start+1)*2;
            start=temp;
        }
        
        System.out.println(search(arr, target,start,end));
    }

    static int search(int[] arr, int target ,int start,int end){
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start= mid+1;
            }
            else
                return mid;
        }
        return -1;
    }
}
