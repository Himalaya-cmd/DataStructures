class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i] = find(i);
        }
        return arr;
    }
    int find(int i){
        int c=0;
        while(i>0){
            if((i & 1)==1)c++;
            i>>=1;
        }
        return c;
    }
}