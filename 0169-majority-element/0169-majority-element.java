class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int counte = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                counte++;
            } else {
                counte--;
                if (counte == 0) {
                    majority = nums[i];
                    counte = 1;
                }
            }
        }
        return majority;
    }
}
        
    
