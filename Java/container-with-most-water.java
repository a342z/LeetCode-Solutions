class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1;
        int area = Math.min(height[l], height[r]) * (r-l),tempArea;
        while(l<r){
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
            area= Math.max(Math.min(height[l], height[r]) * (r-l),area);
         
        }
        return area;
    }
}