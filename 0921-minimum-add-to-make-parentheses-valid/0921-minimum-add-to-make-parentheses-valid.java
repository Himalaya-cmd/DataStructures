class Solution {
    public int minAddToMakeValid(String s) {
        int balance = 0;
        Stack<Character> st = new Stack();
        for(int i=0;i<s.length();i++){
            char ct = s.charAt(i);
            if(ct=='('){
                st.push(ct);
            }else{
                if(st.isEmpty() || st.peek()!='('){
                    st.push(ct);
                }else{
                    st.pop();
                }
            }
        }
        return st.size();
    }
}