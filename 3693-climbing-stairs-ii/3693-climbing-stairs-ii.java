class Solution {
    int[] dp;
    public int climbStairs(int n, int[] costs) {
        dp = new int[n];
        Arrays.fill(dp,-1);
        return ans(0,n,costs);
    }
    int ans(int i,int n,int[] costs){
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        int one=costs[i] + (1)*(1) + ans(i+1,n,costs);
        int two = Integer.MAX_VALUE;
        int three = Integer.MAX_VALUE;
        if(i+2<=n)two=costs[i+1]+ (2)*(2) + ans(i+2,n,costs);
        if(i+3<=n)three=costs[i+2] + (3)*(3) + ans(i+3,n,costs);
        return dp[i] =  Math.min(one,Math.min(two,three));
    }
}