class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref = new int[nums.length];
        pref[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i] = pref[i-1]*nums[i];
            // System.out.println("pref["+i+"] : " + pref[i]);
        }
        int[] suf = new int[nums.length];
        suf[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suf[i] = suf[i+1]*nums[i];
            // System.out.println("suf["+i+"] : " + suf[i]);
        }
        int[] ans = new int[nums.length];
        ans[0] = suf[1];
        ans[nums.length-1] = pref[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            ans[i] = suf[i+1] * pref[i-1]; 
        }
        return ans;
    }
}