class Solution {
    int[][][] dp;
    public boolean hasValidPath(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if ((n + m - 1) % 2 != 0)return false;
        dp = new int[n][m][1000];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        int ok = ans(grid,0,0,n,m,0);
        if(ok==1)return true;
        return false;
    }
    int ans(char[][] grid,int i, int j, int n, int m,int balance){
        if( i>=n || j>=m || balance<0)return 0;
        if(dp[i][j][balance]!=-1)return dp[i][j][balance];
        int originalBalance = balance;
        if(grid[i][j]=='(')balance++;
        else balance--;
        if (balance < 0)return dp[i][j][balance + 1] = 0;
        if(i==n-1 && j==m-1 && balance==0)return 1;
        int one = ans(grid,i+1,j,n,m,balance);
        int two = ans(grid,i,j+1,n,m,balance);
        if(one==1 || two==1)dp[i][j][originalBalance]=1;
        else dp[i][j][originalBalance]=0;
        return dp[i][j][originalBalance];
    }
}