//https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length==1)return 0;
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        int currlength = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==1){
                currlength++;
            }
            else if(nums[i-1]==1){
                lengths.add(currlength);
                currlength=0;
            }
            else {
                currlength=0;
                lengths.add(currlength);
            }
        }
        lengths.add(currlength);
        if(lengths.size()==1)return lengths.get(0)-nums[0];
        else{
            int max = lengths.get(0);
            for(int i = 1;i<lengths.size();i++){
                max = Math.max(max,lengths.get(i-1)+lengths.get(i));
            }
            return max;
        }
    }
}
