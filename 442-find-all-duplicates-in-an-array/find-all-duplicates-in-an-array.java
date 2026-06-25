//OPTIMAL
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //Algorithm

        // For each number:

        // Take its absolute value num = abs(nums[i]).
        // Look at index num - 1.
        // If nums[num - 1] is already negative:
        // We've visited this number before.
        // Add num to the answer.
        // Otherwise:
        // Mark it as visited by making nums[num - 1] negative.

        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<n; i++){
            int num = Math.abs(nums[i]);
            int index = num - 1;
            if(nums[index] < 0){
                result.add(num);
            } else {
                nums[index] =  -nums[index];
            }
        }
        return result;
    }
}

//HASHMAP
// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         int n = nums.length;
//         List<Integer> result = new ArrayList<>();

//         HashMap<Integer, Integer> map = new HashMap<>(); 
//         for(int num : nums){ 
//             map.put(num, map.getOrDefault(num, 0)+1); 
//         } 
//         for(int num : map.keySet()){ 
//             if(map.get(num) == 2){ 
//                 result.add(num); 
//             } 
//         } 
//         return result;
//     }
// }