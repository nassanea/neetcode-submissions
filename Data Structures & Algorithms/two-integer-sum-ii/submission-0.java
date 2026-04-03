class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;

        while(left<right){
            int total = numbers[left]+numbers[right];
            // 每當不合法就跳過
            if(total> target){
                right--;
            }
            if(total < target){
                left++;
            }
            // 以合法
            // 回傳值是由 1 開始（跟存取無關，存取還是由 0 開始）
            if(total == target)return new int[]{left+1, right+1};
        }
        return new int[]{};
    }
}
