class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num : nums1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersection = new ArrayList<>();
        for(int num : nums2){
            if(frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                intersection.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }
        
        int[] arr = new int[intersection.size()];
        int i=0;
        for(int element : intersection){
            arr[i++] = element;
        }
        return arr;
    }
}