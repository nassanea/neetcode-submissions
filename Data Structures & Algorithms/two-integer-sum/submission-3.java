class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0; i<nums.length-1; i++){
            int j=1;
            while(i+j < nums.length){
                if(nums[i+j] == target - nums[i]){
                    result[0] = i;
                    result[1] = i+j;
                    return result;
                }   
                j++;
            }
            
        }
        return result;
    }
}
