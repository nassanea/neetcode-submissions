class Solution {
    public int[] twoSum(int[] nums, int target) {
        // hash 
        // map
        // key target-3, value 0
        // if( map.containsKey(nums[i]) )

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target-nums[i];
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            else{
                map.put(diff, i);
            }
        }
        return new int[2];
    }
}
