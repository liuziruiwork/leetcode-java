//httpsleetcode.comproblemsincreasing-triplet-subsequenceenvType=study-plan-v2&envId=leetcode-75
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int i = 0;inums.length;i++){
            if(nums[i]=min1)min1=nums[i];
            else if(nums[i]min2)min2=nums[i];
            else if(nums[i]min2)return true;
        }
        return false;
    }
}
