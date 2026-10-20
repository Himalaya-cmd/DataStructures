class Solution {
    public int maxProfit(int[] nums) {
        int min = nums[0];
        int ans = 0;
        for(int i=1;i<nums.length;i++){
            int profit = nums[i] - min;
            ans = Math.max(ans,profit);
            min = Math.min(min,nums[i]);
        }
        return ans;
    }
}