class Solution {
    public int minEatingSpeed(int[] piles, int h){
        int n = piles.length;
        int max = 0;
        for(int i:piles){
            max = Math.max(i,max);
        }
        int low = 1;
        while(low<=max){
            int mid = max-(max-low)/2;
            if(check(mid,piles,h)){
                max=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    boolean check(int speed, int[] arr, int h){
        int hour = 0;
        for(int i:arr){
            int rem = i%speed;
            hour+=i/speed;
            if(rem!=0)hour++;
        }
        return hour<=h;
    }
}