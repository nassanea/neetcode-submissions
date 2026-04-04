class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right = heights.length-1;
        int maxArea =0;

        while(left<right){
            int area = (right-left)*Math.min(heights[left],heights[right]);

            if(area>maxArea) maxArea = area;

            // 如果左邊比較短 移動左邊
            if(heights[left]<heights[right]) left++;
            // 右邊較短，移動右邊
            else right--;
        }
        return maxArea;
    }
}
