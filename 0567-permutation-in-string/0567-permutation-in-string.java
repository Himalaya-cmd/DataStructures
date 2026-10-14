class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] vis1 = new int[26];
        for(int i=0;i<s1.length();i++){
            vis1[s1.charAt(i)-'a']++;
        }
        int[] vis2 = new int[26];
        int l=0,r=0;
         while (r < s2.length()){
            char ct = s2.charAt(r);
            vis2[ct - 'a']++;
            if (r - l + 1 == s1.length()) {
                if (Arrays.equals(vis1, vis2)) {
                    return true;
                }
                vis2[s2.charAt(l) - 'a']--;
                l++;
            }
            r++;
        }
        return false;
    }
}