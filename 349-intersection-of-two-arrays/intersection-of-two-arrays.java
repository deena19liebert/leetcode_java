class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();

        for(int num : nums1){
            set.add(num);
        } 
        List<Integer> newList = new ArrayList<>();
        for(int num : nums2){
            if(set.contains(num)){
                newList.add(num);
                set.remove(num);
            }
        }
        int arr[] = new int[newList.size()];
        int i=0;
        for(int a : newList){
            arr[i++]=a;
        }
        return arr;
    }
}