class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temp[st.peek()]<=temp[i]){
                st.pop();
            }
            if(st.isEmpty())nge[i] = 0;
            else nge[i] = st.peek();
            st.push(i);
        }
        // System.out.println(Arrays.toString(nge));
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = nge[i]-i;
            if(ans[i]<0)ans[i]=0;
        }
        return ans;
    }
}