public class richest_customer_wealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1,5},
            {7,3},{3,5} 
        };
        System.out.println(add(arr));
    }

    static int add(int arr[][]){
        // int sum =0;
        int ans =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int  sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                 sum = sum+arr[i][j];
            }
              if(sum>ans){
                ans=sum;
              }
           
        }
        
        
        return ans;
    }

    
}
