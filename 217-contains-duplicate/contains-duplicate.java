class Solution {
    public boolean containsDuplicate(int[] nums) {
       // a hashset does not contain duplicates
       // if there is a duplicate, return true or return false
       Set<Integer> intSet = new HashSet<>();
       for(int num : nums){
        if(intSet.contains(num)) {
            return true;
        }
        intSet.add(num);
       }
       return false;
    }
}