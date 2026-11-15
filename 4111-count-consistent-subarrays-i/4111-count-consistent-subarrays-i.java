class Solution {
    public int countConsistent(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int min = nums[i];
            int ok = nums[i];
            count++;
            for(int j=i+1;j<n;j++){
                ok = ok & nums[j];
                min = Math.min(min,nums[j]);
                if(min==ok)count++;
            }
        }
        return count;
    }
}