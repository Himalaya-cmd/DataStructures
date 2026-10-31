class Solution {
    public String minWindow(String s, String t) {
        int n = s.length(),m=t.length();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<m;i++){
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
        }
        int st=-1,end=-1;
        int l=0,r=0;
        int windowsize = 0;
        HashMap<Character,Integer> map2 = new HashMap<>();
        while(r<n){
            map2.put(s.charAt(r),map2.getOrDefault(s.charAt(r),0)+1);
            while(check(map1,map2)){
                if(windowsize == 0 || r-l+1 < windowsize) {
                    st = l;
                    end = r;
                    windowsize = r-l+1;
                }
                int temp = map2.get(s.charAt(l));
                if(temp==1)map2.remove(s.charAt(l));
                else map2.put(s.charAt(l),temp-1);
                l++;
            }
            r++;
        }
        if(st == -1) return "";
        StringBuilder str = new StringBuilder();
        for(int i=st;i<=end;i++){
            str.append(s.charAt(i));
        }
        return str.toString();
    }
    boolean check(HashMap<Character,Integer> map1,HashMap<Character,Integer> map2){
        int count=0;
        for(Character key : map2.keySet()){
            if(map1.containsKey(key)){
                if(map1.get(key)<=map2.get(key))count++;
                else return false;
            }
        }
        return count==map1.size();
    }
}