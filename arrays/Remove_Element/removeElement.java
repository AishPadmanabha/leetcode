class Solution {
    public int removeElement(int[] nums, int val) {
        for(int i = nums.length-1; i >= 0; i--) {
            if(nums[i] == val) {
                nums[i] = nums[i-1];
            }
        } return nums.length;
    } 
}
