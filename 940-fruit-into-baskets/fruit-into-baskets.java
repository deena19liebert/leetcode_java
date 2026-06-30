class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        HashMap<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int maxFruitCount = 0;
        for(int right=0; right<n; right++){
            int r = fruits[right];
            basket.put(r, basket.getOrDefault(r, 0) + 1);

            while(basket.size() > 2){
                int l = fruits[left];
                basket.put(l, basket.getOrDefault(l, 0) - 1);
                if(basket.get(l) == 0) basket.remove(l);
                left++;
            }
            maxFruitCount = Math.max(maxFruitCount, right - left + 1);
        }
        return maxFruitCount;
    }
}