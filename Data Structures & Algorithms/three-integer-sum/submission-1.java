class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            // 針對第一個元素去重
            if(i>0 && nums[i]==nums[i-1]) continue; // 跳過

            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[left]+nums[right]+nums[i];
                if(sum==0){
                    result.add(
                        Arrays.asList(nums[left],nums[right],nums[i])
                    );
                    // left 去重
                    while(left<right && nums[left]==nums[left+1]) left++;
                    while(left<right && nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                }
                else if(sum>0){
                    right--;
                }
                else{left++; }
            }
        }
        return result;
    }
}
