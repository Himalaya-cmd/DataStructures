class Solution {
    public int search(int[] arr, int target) {
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(target==arr[mid])return mid;
            if(arr[l] <= arr[mid]) {
                if(target >= arr[l] && target < arr[mid]) {
                    r = mid - 1;
                }else {
                    l = mid + 1;
                }
            }else {
                if(target > arr[mid] && target <= arr[r]) {
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}