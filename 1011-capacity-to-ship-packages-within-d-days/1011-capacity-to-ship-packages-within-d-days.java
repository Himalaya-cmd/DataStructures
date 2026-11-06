class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int high = 0;
        int low = 0;
        for(int i: arr){
            high+=i;
            low=Math.max(i,low);
        }
        while(low<=high){
            int mid = high-(high-low)/2;
            if(check(mid,arr,days)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    boolean check(int cap,int[] arr, int days){
        int day=1;
        int sum=0;
        for(int i:arr){
            sum+=i;
            if(sum>cap){
                day++;
                sum=i;
            }
        }
        return day<=days;
    }
}