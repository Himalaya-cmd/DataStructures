class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            int ok = something(n);
            if(set.contains(ok))return false;
            set.add(ok);
            n=ok;
        }
        if(n==1)return true;
        return false;
    }
    int something(int i){
        int sum=0;
        while(i>0){
            int rem = i%10;
            sum+=rem*rem;
            i/=10;
        }
        return sum;

    }
}