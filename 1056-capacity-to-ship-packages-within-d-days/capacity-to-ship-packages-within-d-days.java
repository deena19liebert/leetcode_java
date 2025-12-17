class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }
        int ans = high;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(canShip(weights, days, mid)) {
                ans = mid;
                high = mid - 1;
            } else low = mid+1;
        }
        return ans;
    }
    private static boolean canShip(int[] weights, int days, int mid) {
        int totalSum = 0;
        int totalDays = 1;
        for(int i = 0; i< weights.length; i++) {
               totalSum += weights[i];
               if ( totalSum > mid) {
                    totalDays++;
                    totalSum = weights[i];
            }
        } return totalDays <= days;
    } 
}