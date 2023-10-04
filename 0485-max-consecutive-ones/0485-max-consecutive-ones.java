class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == 1){
                counter += 1;
            }
            else{
                counter = 0;
            }
            res = (res > counter)?res:counter;
        }
        return res;
    }
}