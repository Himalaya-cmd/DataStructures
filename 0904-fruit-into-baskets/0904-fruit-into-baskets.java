class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l=0,r=0;
        int ans = 0;
        while(r<fruits.length){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size()<=2){
                ans = Math.max(ans,r-l+1);
            }
            while(map.size()>2){
                int temp = map.get(fruits[l]);
                if(temp==1)map.remove(fruits[l]);
                else map.put(fruits[l],temp-1);
                l++;
            }
            r++;
        }
        return ans;
    }
}