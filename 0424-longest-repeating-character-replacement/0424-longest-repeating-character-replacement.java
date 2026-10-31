class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0;
        int[] arr = new int[26];
        int ans = 0, maxfreq = 0;
        while(r<s.length()){
            arr[s.charAt(r)-'A']++;
            maxfreq = Math.max(maxfreq,arr[s.charAt(r)-'A']);
            if((r-l+1)-maxfreq>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            if((r-l+1)-maxfreq<=k)ans = Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}