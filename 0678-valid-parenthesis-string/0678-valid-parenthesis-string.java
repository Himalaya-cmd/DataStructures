class Solution {
    Boolean[][] dp;
    public boolean checkValidString(String s) {
        dp = new Boolean[s.length()][s.length() + 1];
        return solve(s, 0, 0);
    }
    boolean solve(String s, int index, int balance) {
        if(balance<0) {
            return false;
        }
        if(index==s.length()) {
            return balance==0;
        }
        if(dp[index][balance] != null) {
            return dp[index][balance];
        }
        char ch = s.charAt(index);
        boolean ans;
        if(ch=='(') {
            ans = solve(s, index + 1, balance + 1);
        }else if(ch==')') {
            ans = solve(s, index + 1, balance - 1);
        }else{
            ans = solve(s, index + 1, balance + 1) 
                || solve(s, index + 1, balance - 1)   
                || solve(s, index + 1, balance);  
        } 
        return dp[index][balance] = ans;
    }
}