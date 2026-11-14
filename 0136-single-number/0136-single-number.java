class Solution {
    public int singleNumber(int[] nums) {
        int ok = 0;
        for(int i:nums){
            ok^=i;
        }
        return ok;
    }
}