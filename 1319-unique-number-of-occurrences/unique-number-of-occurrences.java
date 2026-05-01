class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> seen = new HashSet<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : map.keySet()){
            if(seen.contains(map.get(num))){
                return false;
            } else{
                seen.add(map.get(num));
            }
        }
        return true;
    }
}