//https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] array = new int[nums.length];
        Arrays.fill(array,1);
        int curr = 1;
        for(int i=0;i<array.length;i++) {
            array[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = array.length - 1; i >= 0; i--) {
            array[i] *= curr;
            curr *= nums[i];
        }

        return array;
    }
}
