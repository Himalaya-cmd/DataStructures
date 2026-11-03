class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int i:nums)max = Math.max(i,max);
        int c=0;
        for(int i:nums){
            int diff = max-i;
            c+=diff;
        }
        return c;

    }
}