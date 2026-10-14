class Solution {
    /*
    Agar sum > 9 * num, toh valid number banana possible nahi hai.
    Agar sum == 0, toh saare digits zero honge.
    Greedily har position par Math.min(9, sum) digit rakh, phir sum se us digit ko subtract kar.
    */
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) return "";

        StringBuilder str = new StringBuilder();

        while (num > 0) {
            int key = Math.min(sum, 9);
            str.append(key);
            sum -= key;
            num--;
        }

        return str.toString();
    }
}