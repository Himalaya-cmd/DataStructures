class Solution {
    public int countPrimes(int n) {
        if(n<=1)return 0;
        boolean[] arr = new boolean[n];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false; 
        for(int i=2;i*i<n;i++){
            if(arr[i]){
                for(int j=2;i*j<n;j++){
                    arr[i*j]=false;
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i])c++;
        }
        return c;
    }
}