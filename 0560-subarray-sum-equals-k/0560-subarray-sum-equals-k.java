/*
[1,2,3,1,2] k=3;
dekh if prefix-k exists krta hai peeche? 
*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefix=0,count=0;
        map.put(0,1);
        for(int i: nums){
            prefix+=i;
            if(map.containsKey(prefix-k))count+=map.get(prefix-k);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
        
    }
}