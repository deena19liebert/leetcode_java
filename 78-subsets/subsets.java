class Solution {
        public static void backtrack(int i, List<List<Integer>> result, List<Integer> subset, int[] nums){
        if(i == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }
        // INCLUDE nums[i]
        subset.add(nums[i]);
        backtrack(i+1, result, subset, nums);
        subset.remove(subset.size() - 1);
        
        // EXCLUDE nums[i]
        backtrack(i+1, result, subset, nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, result, new ArrayList<>(), nums);
        return result;
    }
}