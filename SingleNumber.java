//https://leetcode.com/problems/single-number/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }
            else map.put(nums[i],1);
        }
        for (int i : map.keySet()) {
            return i;
        }
        return 0;
    }
}
