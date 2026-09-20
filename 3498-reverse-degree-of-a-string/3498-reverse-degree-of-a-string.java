class Solution {
    /*
    1->26
    2->25
    26-key+1;
    */
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int num = c - 'a' + 1;
            int key = 26-(26-num);
            sum += (i+1)*(26-key+1);
        }
        return sum;
    }
}