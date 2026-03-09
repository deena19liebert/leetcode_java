class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> resultList = new ArrayList<>();
        for(int num : nums){
            if(map.get(num) == 1){
                resultList.add(num);
            }
        }
        int[] result = new int[resultList.size()];
        for(int i=0; i<resultList.size(); i++){
            result[i] = resultList.get(i);
        }
        return result;
    }
}