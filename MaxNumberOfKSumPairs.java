//https://leetcode.com/problems/max-number-of-k-sum-pairs/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int min = 0;
        int max = nums.length-1;
        int counter = 0;
        while(min<max){
            System.out.println(min + " "+ max);
            if(nums[min]+nums[max]>k)max--;
            else if (nums[min]+nums[max]<k)min++;
            else if (nums[min]+nums[max]==k){
                min++;
                max--;
                counter++;
            }
        }
        return counter;
    }
}
