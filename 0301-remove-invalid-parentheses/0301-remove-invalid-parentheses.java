class Solution {
    int maxLength = -1;
    public List<String> removeInvalidParentheses(String s) {
        Set<String> result = new HashSet<>();
        backtrack(s, 0, new StringBuilder(), result);
        return new ArrayList<>(result);
    }
    private void backtrack(String s, int index,StringBuilder current,Set<String> result) {

        if (index == s.length()) {
            if (isValid(current)) {
                if (current.length() > maxLength) {
                    maxLength = current.length();
                    result.clear();
                }

                if (current.length() == maxLength) {
                    result.add(current.toString());
                }
            }
            return;
        }
        char ch = s.charAt(index);
        current.append(ch);
        backtrack(s, index + 1, current, result);
        current.deleteCharAt(current.length() - 1);
        if (ch == '(' || ch == ')') {
            backtrack(s, index + 1, current, result);
        }
    }

    private boolean isValid(StringBuilder s) {
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                balance++;
            } else if (s.charAt(i) == ')') {
                if (--balance < 0) {
                    return false;
                }
            }
        }
        return balance == 0;
    }
}