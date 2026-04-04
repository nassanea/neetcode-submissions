class Solution {
    public int maxArea(int[] heights) {
        //area = (j-i) * min(heights[j]-heights[i])
        int maxArea=0;

        for(int i=0; i<heights.length-1; i++){
            for(int j=i+1; j<heights.length; j++){
                int area = (j-i) * Math.min(heights[j],heights[i]);
                if(area>maxArea){
                    maxArea = area;
                }
            }   
        }
        return maxArea;
    }
}
