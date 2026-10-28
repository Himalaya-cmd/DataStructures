class Solution {
    // har index ka prev greater and next greater
    public int trap(int[] height) {
        int[] nge = nextgreaterele(height);
        // System.out.println(Arrays.toString(nge));
        int[] pge = prevgreaterele(height);
        int ans = 0;
        for(int i=0;i<height.length;i++){
            int pgreat = pge[i];
            int ngreat = nge[i];
            if(pgreat!=-1 && ngreat!=-1){
                // System.out.println(i + " element : " +height[i]+ " nge : " + ngreat + " pge : "+pgreat);
                ans+=Math.abs(height[i] - Math.min(pgreat,ngreat));
            }
        }
        return ans;
    }
    int[] nextgreaterele(int[] height){
        int n = height.length;
        int[] arr = new int[n];
        int max=-1;
        for(int i=n-1;i>=0;i--){
            if(height[i]>max){
                arr[i]=-1;
                max = height[i];
            }
            else arr[i] = max;
        }
        // System.out.println(Arrays.toString(arr));
        return arr;
    }
    int[] prevgreaterele(int[] height){
        // Stack<Integer> st = new Stack<>();
        int n = height.length;
        int[] arr = new int[n];
        int max=-1;
        for(int i=0;i<n;i++){
            if(height[i]>max){
                arr[i]=-1;
                max = height[i];
            }
            else arr[i] = max;
            // while(!st.isEmpty() && st.peek()<=height[i])st.pop();
            // if(st.isEmpty())arr[i]=-1;
            // else arr[i] = st.peek();
            // st.push(height[i]);
        }
        // System.out.println(Arrays.toString(arr));
        return arr;
    }
}