//https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double window = 0;

        for(int i = 0;i<k;i++){
            window+=nums[i];
        }
        double max = window;
        for(int i = k;i<nums.length;i++){
            window += nums[i];
            window -= nums[i-k];
            if(window>max)max=window;
        }

        return max/k;
    }
}
