class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        StringBuilder str = new StringBuilder();
        generate(ans,str,0,0,n);
        return ans;
    }
    void generate(List<String> ans,StringBuilder str, int open, int close, int max){
        if(str.length()==2*max && open==close){
            if(!ans.contains(str.toString()))ans.add(str.toString());
            return;
        }
        if(open<max){
            str.append('(');
            generate(ans,str,open+1,close,max);
            str.deleteCharAt(str.length()-1);
        }
        if(close<open){
            str.append(')');
            generate(ans,str,open,close+1,max);
            str.deleteCharAt(str.length()-1);
        }
    }
}