class Solution {
    // == refernce compare krta hai
    // .equals sirf content compare krta hai
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ct = s.charAt(i);
            if(Character.isLetter(ct) || Character.isDigit(ct))str.append(Character.toLowerCase(ct));
        }
        String temp = new StringBuilder(str).reverse().toString();
        // System.out.println(str + " " + temp);
        return str.toString().equals(temp);
    }
}