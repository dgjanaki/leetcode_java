public class trapping_rain_water {
    public static void main(String[] args) {
        int[] height =  { 4,2,0,3,2,5};
        System.out.println(Trapping(height));
    }
    
    static int Trapping(int[] height){
        int left = 0;
        int right = height.length-1;
        int water = 0;
        int left_max = height[left];
        int right_max = height[right];

        while(left<right){
            if(left_max<right_max){
                left++;
                left_max = Math.max(left_max, height[left]);
                water = water + left_max  - height[left];
            }
            else{
                right--;
                right_max = Math.max(right_max,height[right]);
                water = water + right_max - height[right];
            }
           
        }
         return water;
    }
}
