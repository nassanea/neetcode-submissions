class Solution {
    public int search(int[] nums, int target) {

        return  searchReverse(nums, target, 0, nums.length-1);
        
    }
    public int searchReverse(int[] nums, int target, int left, int right){
        if(left > right)  return -1;

        int mid = (left+right)/2;
        if(target < nums[mid]){
            return searchReverse(nums, target, left, mid-1);
        }
        else if(target > nums[mid]){
            return searchReverse(nums, target, mid+1, right);
        }
        else{
            return mid;
        }
        
    }
}
