class Solution {
    public int trap(int[] height) {
        // 維護左指針和右指針

        int res=0;
        
        int left=0, right=height.length-1;
        // 位置 i 的左邊最高牆和右邊最高牆
        int leftWall=height[left], rightWall=height[right];

        while(left<right){
            // 每次移動比較矮的那邊
            // 比較矮的牆往另一邊掃過去，一定會對應到更高的牆，
            // 所以要移動的旗子是比較矮的牆那根
            if(leftWall < rightWall){ // 左邊比較矮，以左邊為準
                // 處理左邊 右邊不用管
                left++;
                leftWall = Math.max(leftWall, height[left]);
                res += leftWall - height[left];
            }
            else{ // 右邊比較矮 or 一樣矮
                right--;
                rightWall = Math.max(rightWall, height[right]); 
                res += rightWall - height[right];
            }
        }
        return res;
        
    }
}
