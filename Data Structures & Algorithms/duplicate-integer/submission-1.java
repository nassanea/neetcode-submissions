class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            if(!map.containsKey(i)) map.put(i, i);
            else return true;
        }
        return false;
    }
}