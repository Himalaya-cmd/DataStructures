class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        int balance = 0;
        for(int i=0;i<s.length();i++){
            char ct = s.charAt(i);
            if(ct=='('){
                str.append(ct);
                balance++;
            }else{
                if(balance>0){
                    str.append(ct);
                    balance--;
                }
            }
            if(str.length()>1 && balance==0){
                ans.append(str.substring(1,str.length()-1));
                str = new StringBuilder();
            }
        }
        return ans.toString();
    }
}