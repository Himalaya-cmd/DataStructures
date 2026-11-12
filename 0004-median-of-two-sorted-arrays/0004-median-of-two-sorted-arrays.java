class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n1 = nums1.length;
       int n2 = nums2.length; 
       int[] ans = new int[n1+n2];
       int i=0,j=0,k=0;
       while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                ans[k++]=nums1[i];
                i++;
            }else{
                ans[k++]=nums2[j];
                j++;
            }
       }
       while(i<n1){
            ans[k++] = nums1[i++];
       }
       while(j<n2){
            ans[k++] = nums2[j++];
       }
       double kol = 0;
       if((n1+n2)%2==0){
            kol = (double)(ans[(n1+n2)/2] + ans[(n1+n2)/2 - 1])/2;
       }else{
            kol = (double)ans[(n1+n2)/2];
       }
       return kol;
    }
}