class Solution {
    public int[] twoSum(int[] nums, int target) {
        // hash 
        // map
        // key target-3, value 0
        // if( map.containsKey(nums[i]) )

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(target-nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]) && i!=map.get(nums[i])){
                return new int[]{Math.min(i, map.get(nums[i])), Math.max(i, map.get(nums[i]))};
            }
        }
        return new int[2];
    }
}
