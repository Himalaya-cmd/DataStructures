class Solution {
    int dp[][];
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new int[n+1][n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        // Arrays.fill(dp[n-1],0);
        // for(int i=n-1;i>=0;i--){
        //     for(int j=i-1;j>=0;j--){

        //     }
        // }
        return ans(nums,-1,0);
    }
    int ans(int[] nums, int prev, int curr){
        if(curr==nums.length)return 0;
        if(dp[prev+1][curr]!=-1)return dp[prev+1][curr];
        int take=0;
        if(prev==-1 || nums[curr]>nums[prev]){
            take = 1 + ans(nums,curr,curr+1);
        }
        int nottake = ans(nums,prev,curr+1);
        return dp[prev+1][curr] = Math.max(take,nottake);
    }
}