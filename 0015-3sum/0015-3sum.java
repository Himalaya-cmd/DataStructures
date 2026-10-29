class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int third = -(nums[i] + nums[j]);
                if (set.contains(third)) {
                    List<Integer> triplet = Arrays.asList(
                        nums[i], nums[j], third
                    );
                    Collections.sort(triplet);
                    ans.add(triplet);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}