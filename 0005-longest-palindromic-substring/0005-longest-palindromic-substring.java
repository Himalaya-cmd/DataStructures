class Solution {
    Boolean[][] dp;
    public String longestPalindrome(String s) {
        String ans = "";
        int n = s.length();
        dp = new Boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(solve(s,i,j)){
                    if(j-i+1>ans.length()){
                        ans = s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
    boolean solve(String s, int start, int end){
        if(start>=end)return true;
        if(dp[start][end]!=null)return dp[start][end];
        if(s.charAt(start)==s.charAt(end)){
            return dp[start][end] = solve(s,start+1,end-1);
        }else{
            dp[start][end] = false;
        }
        return dp[start][end];
    }
}