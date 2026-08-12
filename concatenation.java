import java.util.Arrays;

public class concatenation {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3};
        int[] merged =new int[arr1.length+arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            merged[i]=arr1[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            merged[arr1.length+i] =arr1[i];
        }
        System.out.println(Arrays.toString(merged));
    }
    
}