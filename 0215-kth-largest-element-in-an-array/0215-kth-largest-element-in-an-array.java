class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int i:nums)q.offer(i);
        while(k>0){
            int temp = q.peek();
            k--;
            if(k==0)return temp;
            q.poll(); 
        }
        return 0;
    }
}