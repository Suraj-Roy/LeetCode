class Solution {
    public void moveZeroes(int[] nums) {
        int curZeroIndex = -1;
        int curNonZeroIndex = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=0 && curZeroIndex!=-1){
                nums[curZeroIndex] = nums[i];
                nums[i] = 0;
                curZeroIndex += 1;
            }
            else if(curZeroIndex == -1 && nums[i] == 0){
                curZeroIndex = i;
            }
        }
    }
}