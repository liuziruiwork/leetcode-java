//https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int num:nums){
            if(num!=0){
                nums[i]=num;
                i++;
            }
        }
        while(i<nums.length){
            nums[i]=0;
            i++;
        }
    }
}
