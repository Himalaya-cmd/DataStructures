class Solution {
    public int maxArea(int[] arr){
        int n = arr.length;
        int l=0,r=n-1;
        int ans = 0;
        while(l<=r){
            int min = Math.min(arr[l],arr[r]);
            ans = Math.max(ans,(r-l)*min);
            if(arr[l]<=arr[r])l++;
            else r--;
        }
        return ans;
    }
}