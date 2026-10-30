class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l=0,r=0;
        int[] arr1 = new int[26];
        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)-'a']++;
        }
        int[] arr2 = new int[26];
        while(r<s2.length()){
            arr2[s2.charAt(r)-'a']++;
            if((r-l+1)>s1.length()){
                arr2[s2.charAt(l)-'a']--;
                l++;
            }
            if((r-l+1)==s1.length()){
                if(Arrays.equals(arr1,arr2))return true;
            }
            r++;
        }
        return false;
    }
}