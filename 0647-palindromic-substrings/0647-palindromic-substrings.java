class Solution {
    Boolean[][] dp;
    public int countSubstrings(String s) {
        int n = s.length();
        int c=0;
        dp = new Boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(tell(i,j,s))c++;
            }
        }
        return c;
    }
    boolean tell(int st, int j, String s){
        if(st>=j)return true;
        if(dp[st][j]!=null)return dp[st][j];
        if(s.charAt(st)==s.charAt(j))return dp[st][j]=tell(st+1,j-1,s);
        else dp[st][j] = false;
        return dp[st][j];
    }
}