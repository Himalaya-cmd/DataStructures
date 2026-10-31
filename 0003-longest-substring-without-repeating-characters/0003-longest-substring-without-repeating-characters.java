class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0,r=0;
        int ans = 0;
        while(r<s.length()){
            char chur = s.charAt(r);
            map.put(chur,map.getOrDefault(chur,0)+1);
            if(map.get(chur)>1){
                while(map.get(chur)>1){
                    int temp = map.get(s.charAt(l));
                    if(temp==1)map.remove(s.charAt(l));
                    else map.put(s.charAt(l),temp-1);
                    l++;
                }
            }
            ans = Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}