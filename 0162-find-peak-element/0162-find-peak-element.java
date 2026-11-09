class Solution {
    public int findPeakElement(int[] nums) {
        int l=0,r=nums.length-1;
        if(nums.length==1)return 0;
        while(l<=r){
            int mid = (l+r)/2;
            if(mid-1==-1){
                if(nums[mid]>nums[mid+1])return mid;
                l=mid+1;
            }else if(mid+1==nums.length){
                if(nums[mid]>nums[mid-1])return mid;
                r=mid-1;
            }else if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                return mid;
            }else if(nums[mid]>nums[mid-1]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return 0;
    }
}