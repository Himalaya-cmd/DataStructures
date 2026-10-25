class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int k = 201;
        for(String str: strs){
            k = Math.min(str.length(),k);
        }
        int j=0;
        StringBuilder ans = new StringBuilder();
        while(j<k){
            int i=0;
            char ct = strs[i].charAt(j);
            i++;
            while(i<n && strs[i].charAt(j)==ct)i++;
            if(i==n)ans.append(ct);
            else break;
            j++;
        }
        return ans.toString();
    }
}