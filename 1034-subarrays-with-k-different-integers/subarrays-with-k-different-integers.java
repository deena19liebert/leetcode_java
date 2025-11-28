class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k-1);
    }
    private int atMost(int[] nums, int x) {
        // Map<Integer, Integer> map = new HashMap<>();

        int count=0, left=0, distinct=0 ;
        int[] freq = new int[nums.length + 1];

        for(int right=0; right < nums.length; right++){
            if (freq[nums[right]] == 0) distinct++;
            freq[nums[right]]++;

            //int r = nums[right];
            //map.put(r, map.getOrDefault(r, 0) + 1);

            while (distinct > x) {
                freq[nums[left]]--;
                if (freq[nums[left]] == 0) distinct--;
                left++;
            }

            // while(map.size() > x) {
            //     int l = nums[left];
            //     map.put(l, map.getOrDefault(l, 0) - 1);
            //     if(map.get(l) == 0){
            //         map.remove(l);
            //     }
            //     left++; }
            count += right - left + 1;
        }
        return count;
    }
}