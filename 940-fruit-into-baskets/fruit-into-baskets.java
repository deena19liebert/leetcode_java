class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left=0, maxLen = 0;

        for(int right = 0; right < fruits.length; right++){
            int r = fruits[right];
            map.put(r, map.getOrDefault(r, 0) + 1);

            while(map.size() > 2){
                int l = fruits[left];
                map.put(l, map.getOrDefault(l, 0) - 1);
                if(map.get(l) == 0) map.remove(l);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}