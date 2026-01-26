class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> resultList = new ArrayList<>();
        int minDis = Integer.MAX_VALUE;

        for(int i=0; i<arr.length-1; i++){
            int diff = Math.abs(arr[i] - arr[i+1]);
            minDis = Math.min(minDis, diff);
        }

        for(int i=0; i<arr.length-1; i++){
            int diff = Math.abs(arr[i] - arr[i+1]);
            if(diff == minDis)
                resultList.add(Arrays.asList(arr[i], arr[i+1]));
        }

        return resultList;
    }
}