class Solution {
    public void backtrack(int index, int target, List<List<Integer>> result, int[] candidates, List<Integer> ds){
        if(index == candidates.length){
            if(target == 0) result.add(new ArrayList<>(ds));
            return;
        }
        if(candidates[index] <= target){
            ds.add(candidates[index]);
            backtrack(index, target - candidates[index], result, candidates, ds);
            ds.remove(ds.size() - 1);
        }
        backtrack(index+1, target, result, candidates, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, target, result, candidates, new ArrayList<>());

        return result;

    }
}