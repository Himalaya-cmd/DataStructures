class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum = sumofdig(nums[i]);
            if(sum==i)return i;
        }
        return -1;
    }
    int sumofdig(int k){
        int c=0;
        while(k>0){
            c+=k%10;
            k/=10;
        }
        return c;
    }
}