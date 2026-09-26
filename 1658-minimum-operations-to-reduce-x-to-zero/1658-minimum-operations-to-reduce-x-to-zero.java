class Solution {
    // find largest subarray with sum k-x ( k is total sum of array)
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        int ans = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        int totalsum = 0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        int key = totalsum-x;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(!map.containsKey(sum))map.put(sum, i);
            if(map.containsKey(sum-key)){
                ans = Math.max(ans,i-map.get(sum-key));
            }
        }
        return ans==-1 ?-1:nums.length-ans;
    }
}