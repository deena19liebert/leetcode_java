//OPTIMAL - BINARY SEARCH
class Solution {
    public int findDuplicate(int[] nums) {
        // if length is n, elements present -> n-1
        // if length is 5, elements present -> 1 to 4
        int n = nums.length;

        //eg) n = 5, nums = [1,3,4,2,2]
        int low = 1, high = n - 1; // low = 1, high = 4

        while(low < high){
            int mid = (low + high) / 2; // mid = 2  // mid = 1
            int count = 0;

            for(int num : nums){
                if(num <= mid) count++;  // count = 3 // count = 1
            }
            if(count > mid){
                high = mid; // count(3) > mid(2) // low = 1, high = 2
            }
            else{
                low = mid + 1; //low = 2, high = 2, low !< high, so return low;
            }
        }
        return low;
    }
}

// class Solution {
//     public int findDuplicate(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int num : nums){
//             map.put(num, map.getOrDefault(num, 0)+1);
//         }
//         for(int num : map.keySet()){
//             if(map.get(num) > 1){
//                 return num;
//             }
//         }
//         return -1;
//     }
// }