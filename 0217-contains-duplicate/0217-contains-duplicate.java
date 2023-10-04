class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> uniqueCheck = new HashSet<Integer>();

       for(int i=0;i<nums.length;i++){
           uniqueCheck.add(nums[i]);
       }

       return uniqueCheck.size() != nums.length;
    }
}