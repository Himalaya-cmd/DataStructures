class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        boolean brackon = false;
        StringBuilder str = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char chur = s.charAt(i);
            if(chur==')'){
                System.out.println(temp);
                if(map.containsKey(temp.toString())){
                    str.append(map.get(temp.toString()));
                }else{
                    str.append("?");
                }
                brackon = false;
                temp = new StringBuilder();
            }else if(brackon){
                temp.append(chur);
            }else if(chur=='('){
                brackon=true;
            }else if(!brackon){
                str.append(chur);
            }
        }
        return str.toString();
    }
}