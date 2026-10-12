class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && prices[st.peek()]>prices[i]){
                st.pop();
            }
            if(st.isEmpty())nge[i] = i;
            else nge[i] = st.peek();
            st.push(i);
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(i!=nge[i])ans[i] = prices[i] - prices[nge[i]];
            else ans[i] = prices[i];
        }
        return ans;
    }
}