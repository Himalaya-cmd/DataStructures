class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int totaloperation = k1 + k2;
        long sum = 0;
        int[] freq = new int[100001];
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            freq[diff]++;
        }
        for(int i=100000;i>0 && totaloperation>0;i--){
            int countops = Math.min(freq[i],totaloperation);
            freq[i]-=countops;
            freq[i-1]+=countops;
            totaloperation-=countops;
        }
        for(int i=1;i<=100000;i++) {
            sum+=(long)freq[i] * i * i;
        }
        return sum;
    }
}
