class Solution {
    public String digitSum(String s, int k) {
        StringBuilder str = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        while(s.length()>k){
            int i;
            for(i=0;i<s.length();i++){
                str.append(s.charAt(i));
                if(str.length()==k){
                    ans.append(ok(str.toString()));
                    str = new StringBuilder();
                }else if(i==s.length()-1){
                    ans.append(ok(str.toString()));
                    str = new StringBuilder();
                }
            }
            s = ans.toString();
            ans = new StringBuilder();
        }
        return s;
    }
    String ok(String temp){
        int sum=0;
        for(int i = 0;i<temp.length();i++) {
            sum += temp.charAt(i) - '0';
        }
        return Integer.toString(sum);
    }
}