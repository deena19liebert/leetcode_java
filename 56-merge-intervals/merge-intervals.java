// OPTIMAL SOLUTION
class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        // Lambda expression-look at the first element of each interval. e.g) [8,10] vs [1,3] → 8 - 1 = 7 (positive) → [1,3] comes before [8,10]
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        // List whose elements are int[] (arrays of integers).
        // Each int[] here represents one interval, like [start, end].
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0]; //intervals[][] = [[1,3],[2,6],[8,10],[15,18]], then, 0 -> [1,3] 
        for(int i=1; i<n; i++){
                if(intervals[i][0] <= current[1]){
                    current[1] = Math.max(current[1], intervals[i][1]); 
                } else {
                    result.add(current);
                    current = intervals[i];
                }
        } 
        result.add(current);
        return result.toArray(new int[result.size()][]);
    }
}

// // BRUTE FORCE
// class Solution {
//     public int[][] merge(int[][] intervals) {
//         int n = intervals.length;
//         // Lambda expression-look at the first element of each interval. e.g) [8,10] vs [1,3] → 8 - 1 = 7 (positive) → [1,3] comes before [8,10]
//         Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

//         // List whose elements are int[] (arrays of integers).
//         // Each int[] here represents one interval, like [start, end].
//         List<int[]> result = new ArrayList<>();
//         for(int i=0; i<n; i++){
//             int start = intervals[i][0]; // j has only 0 & 1
//             int end = intervals[i][1];

//             for(int j=i+1; j<n; j++){
//                 if(intervals[j][0] <= end){
//                     end = Math.max(end, intervals[j][1]);
//                     i = j; //if i=0, when the outer loop increments, it will move to i = 2 (skipping the already merged) 
//                 } else break;
//             } result.add(new int[]{start, end});
//         }
//         return result.toArray(new int[result.size()][]);
//     }
// }