// BRUTE FORCE
class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        // Lambda expression-look at the first element of each interval. e.g) [8,10] vs [1,3] → 8 - 1 = 7 (positive) → [1,3] comes before [8,10]
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        // List whose elements are int[] (arrays of integers).
        // Each int[] here represents one interval, like [start, end].
        List<int[]> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            int start = intervals[i][0]; // j has only 0 & 1
            int end = intervals[i][1];

            for(int j=i+1; j<n; j++){
                if(intervals[j][0] <= end){
                    end = Math.max(end, intervals[j][1]);
                    i = j;
                } else break;
            } result.add(new int[]{start, end});
        }
        return result.toArray(new int[result.size()][]);
    }
}