class Solution {
    class pair{
        int st,end;
        pair(int st, int end){
            this.st = st;
            this.end = end;
        }
    }
    public int longestValidParentheses(String s) {
        int ans=0;
        ArrayList<pair> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(') {
                st.push(i);
            }
            else {
                if(st.isEmpty())continue;
                int idx = st.pop();
                list.add(new pair(idx,i));
            }
        }
        Collections.sort(list,(a, b) -> Integer.compare(a.st, b.st));
        if(list.isEmpty())return 0;
        int start = list.get(0).st;
        int end = list.get(0).end;
        for (int i = 1; i < list.size(); i++) {
            pair curr = list.get(i);
            if (curr.st <= end + 1) {
                end = Math.max(end, curr.end);
            } else {
                ans = Math.max(ans, end - start + 1);
                start = curr.st;
                end = curr.end;
            }
        }
        ans = Math.max(ans, end - start + 1);
        return ans;
    }
}