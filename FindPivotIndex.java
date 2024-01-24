//https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int num:nums)total+=num;
        int leftsum = 0;
        for(int i = 0;i<nums.length;i++){
            if(total-leftsum-nums[i]==leftsum)return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}
