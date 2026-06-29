class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if(n == 0) return new int[0];
        int[] result = new int[n-k+1];

        Deque<Integer> q = new LinkedList<>();
        int j = 0;

        for(int i=0; i<n; i++){
            // 1. Remove indices that are out of the current window bounds
            if(!q.isEmpty() && q.peek() < i-k + 1){
                q.poll();
            }
            // 2. Remove elements from the back that are smaller than the current element nums[i]
            // because they can never be the maximum in this or any future window
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }
            // 3. Add current element's index to the back of the queue
            q.offer(i);
            // 4. If the window has reached size k, the front of the queue is our max
            if(i >= k-1){
                result[j++] = nums[q.peek()];
            }
        }
        
        return result;
    }
}