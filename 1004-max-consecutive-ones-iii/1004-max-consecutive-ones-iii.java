class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0;
        int count=0;
        int ans=0,maxfreq=0;
        while(r<nums.length){
            if(nums[r]==0)count++;
            if(count>k){
                if(nums[l]==0)count--;
                l++;
            }
            if(count<=k){
                ans = Math.max(ans,r-l+1);
            }
            r++;
        }
        return ans;
    }
}