class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        if(nums.length <= 499) {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] <= Math.pow(10, 5) && (String.valueOf(nums[i]).length() % 2 == 0)) {
                 count = count + 1;   
                }
            }
        } return count;
    } 
}
