class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            // System.out.println(Arrays.toString(arr));
            String temp = new String(arr);
            if(!map.containsKey(temp)){
                map.put(temp,new ArrayList<String>());
            }
            map.get(temp).add(s);
            // System.out.println(map.get(temp));
        }
        List<List<String>> list = new ArrayList<>();
        for (Map.Entry<String,ArrayList<String>> entry : map.entrySet()) {
            ArrayList<String> temp = entry.getValue();
            list.add(temp);
        }
        // System.out.println(list);
        return list;
    }
}