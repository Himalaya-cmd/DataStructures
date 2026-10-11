
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++) {
            String ct = tokens[i];

            if(!ct.equals("+") && !ct.equals("-") && !ct.equals("/") && !ct.equals("*")) {
                st.push(Integer.parseInt(ct));
            } else {
                int temp1 = st.pop();
                int temp2 = st.pop();
                int res;

                if (ct.equals("+")) {
                    res = temp2 + temp1;
                } else if (ct.equals("*")) {
                    res = temp2 * temp1;
                } else if (ct.equals("/")) {
                    res = temp2 / temp1;
                } else {
                    res = temp2 - temp1;
                }

                st.push(res);
            }
        }

        return st.pop();
    }
}
