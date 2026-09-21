public class Container_with_most_water {
    public static void main(String[] args) {
        int[] height = {1,3,4,6};
        System.out.println(MaxArea(height));

    }

    static int MaxArea(int[] height){
        int l = 0;
        int r = height.length - 1;
        int maxarea = 0;
        
        while(l<=r){
            int h = Math.min(height[l],height[r]);
            int w = r-l;
            int area = h*w;
            maxarea = Math.max(maxarea, area);

            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}
