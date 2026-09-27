/*
 if '(' -> stack mei push
 if ')' -> toh stack ko pop krke ek stringbuilder mei daaldo aur usse main ans mei add krdo
 kya bracket ko daalenge stack mei?

*/
class Solution {
    public String reverseParentheses(String s) {
        StringBuilder str = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ct = s.charAt(i);
            if(ct=='(')st.push(i);
            if(ct==')'){
                int j = st.pop();
                manipulate(str,j,i);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='(' && str.charAt(i)!=')'){
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
    void manipulate(StringBuilder str, int i, int j) {
        while (i < j) {
            char temp = str.charAt(i);

            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);

            i++;
            j--;
        }
    }
}




















