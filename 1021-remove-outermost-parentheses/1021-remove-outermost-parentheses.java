class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        // Stack<Character> st = new Stack<>();
        int balance = 0;
        for(int i=0;i<s.length();i++){
            char ct = s.charAt(i);
            // System.out.println(balance + " " + str);
            if(ct=='('){
                // st.push(ct);
                str.append(ct);
                balance++;
            }else{
                if(balance>0){
                    str.append(ct);
                    balance--;
                }
            }
            if(str.length()>1 && balance==0){
                list.add(str.substring(1,str.length()-1));
                // System.out.println(list);
                str = new StringBuilder();
            }
        }
        // System.out.print(list);
        str = new StringBuilder();
        for(int i=0;i<list.size();i++){
            str.append(list.get(i));
        }
        return str.toString();
    }
}