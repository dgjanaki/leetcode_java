public class even_digit {
    public static void main(String[] args) {
        int[] arr = {12, 234675,345,2,6,7496};
        System.out.println(even(arr));

    }

    static int even(int[] arr){
         int ans = 0;
        for (int i = 0; i < arr.length; i++) {
           int num=arr[i];
           int count=0;
          
           while (num>0) {
                 num = num /10;
                count++ ;
            }
            // System.out.println(count);
            

                // 
                
            if(count%2==0)
                ans++;
              
                
            
             
        }
        return ans;

    }
}

// Shortcut to find the number of digits
// int num =2345678;
//         return (int)(Math.log10(num))+1;