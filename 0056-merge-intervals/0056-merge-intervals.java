class Solution {
    public int[][] merge(int[][] arr) {
        if(arr.length==1)return arr;
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = arr.length;
        int st = arr[0][0];
        int end = arr[0][1];
        for(int i=1;i<n;i++){
            if(arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(st);
                temp.add(end);
                list.add(temp);
                st = arr[i][0];
                end = arr[i][1];
            }
        }
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(st);
        temp.add(end);
        list.add(temp);
        int n1 = list.size();
        int[][] ans = new int[n1][2];
        for(int i=0;i<n1;i++){
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }
        return ans;
    }
}