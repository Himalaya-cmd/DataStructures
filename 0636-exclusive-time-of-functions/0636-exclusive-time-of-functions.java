
class Solution {
    class pair {
        int id, time;

        pair(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }

    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<pair> st = new Stack<>();
        int[] ans = new int[n];
        int prevtime = 0;
        for (int i = 0; i < logs.size(); i++) {
            String[] parts = logs.get(i).split(":");

            int id = Integer.parseInt(parts[0]);
            String type = parts[1];
            int time = Integer.parseInt(parts[2]);

            if (type.equals("start")) {
                if(!st.isEmpty()){
                    ans[st.peek().id] += time - prevtime;
                }
                st.push(new pair(id, time));
                prevtime = time;
            } else {
                pair p = st.pop();
                ans[p.id] += time - prevtime + 1;
                prevtime = time+1;
            }
        }

        return ans;
    }
}
