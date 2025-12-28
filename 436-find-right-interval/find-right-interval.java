class Solution {
    public int[] findRightInterval(int[][] intervals) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<intervals.length; i++){
            map.put(intervals[i][0], i);
        }
        int[] start = new int[intervals.length];
        for(int i=0; i<intervals.length; i++){
            start[i] = intervals[i][0];
        }
        Arrays.sort(start);
        int[] result = new int[intervals.length];
        for(int i=0; i<intervals.length; i++) {
            int temp = getIdx(intervals[i][1], start);
            if(temp == -1) result[i] = -1;
            else result[i] = map.get(start[temp]);
        }
        return result;
    }

private int getIdx(int num, int[] start){
    if(start[start.length - 1] < num){
        return -1;
    }
    int low=0, high=start.length-1;
    while(low < high){
        int mid = low + (high - low)/2;
        if(start[mid] == num) return mid;
        else if(start[mid] > num){
            high = mid;
        } else {
            low = mid + 1;
        }
    }
    return low;
}
}