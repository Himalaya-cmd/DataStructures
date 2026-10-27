class Solution {
    public int[] twoSum(int[] arr, int k) {
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int sum = arr[l] + arr[r];

            if (sum == k) {
                return new int[]{l + 1, r + 1};
            } else if (sum > k) {
                r--;
            } else {
                l++;
            }
        }

        return new int[]{-1, -1};
    }
}