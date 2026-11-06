class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0;
        int r=0;
        for(int i:nums){
            l = Math.max(i,l);
            r+=i;
        }
        while(l<=r){
            int mid = r-(r-l)/2;
            if(check(mid,nums,k)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    boolean check(int size, int[] arr, int k){
        int sum = 0,count=1;
        for(int i:arr){
            sum+=i;
            if(sum>size){
                count++;
                sum=i;
            }
        }
        return count<=k;
    }
}