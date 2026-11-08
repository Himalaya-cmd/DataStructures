class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(nums[b], nums[a]));
        for(int r = 0; r < n; r++) {
            pq.offer(r);
            //top window ke bahar hai
            while(!pq.isEmpty() && pq.peek() <= r - k) {
                pq.poll();
            }
            if(r>=k-1) {
                ans[r - k + 1] = nums[pq.peek()];
            }
        }
        return ans;
    }
}