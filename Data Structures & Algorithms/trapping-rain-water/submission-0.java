class Solution {
    public int trap(int[] height) {
        // 同樣取決於最低的邊界以及中間的方格
        // 水量 = [i-1] > [i] && [i] < [i+1]
        // (i+1-i+1)*min([i-1],[i+1])- i

        int maxW = 0;

        for(int i=1; i<height.length-1; i++){ // 對於每個 i 都去找儲水量
            // 找到 i 左右最高的牆，取最高牆中最矮的那個
            //maxW += Math.min(height[i-1], height[i+1]) - height[i];
            
            // 找左最高牆
            int leftMax=0;
            for(int j=0; j<=i; j++){
                leftMax = Math.max(height[j], leftMax);
            }
            // 找右最高牆
            int rightMax =0;
            for(int j=i; j<height.length; j++){
                rightMax = Math.max(height[j], rightMax);
            }

            // 算水量
            int water = Math.min(rightMax, leftMax) - height[i];
            maxW += water;
        }
        return maxW;
    }
}
