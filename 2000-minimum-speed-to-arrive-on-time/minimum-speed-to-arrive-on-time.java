class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if(hour <= dist.length - 1) return -1;
        int low=1, high=10_000_000;
        int result = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(canArrive(dist, hour, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    private static boolean canArrive(int[] dist, double hour, int mid){
        double time = 0.0;
        for (int i=0; i < dist.length; i++) {
            if(i == dist.length - 1) {
                time += (double) dist[i] / mid;
            } else {
                time += Math.ceil((double) dist[i] / mid);
            }
            if(time > hour) return false;
        }
        return time <= hour;
    }
}