//https://leetcode.com/problems/path-sum-iii/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    int total = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;

        Map<Long, Integer> map = new HashMap<>();
        map.put(0l, 1);
        findPathSum(root, 0l, targetSum, map);
        return total;
    }

    public void findPathSum(TreeNode root, long sum, int target, Map<Long, Integer> map){
        if(root == null) return;

        sum += root.val;

        if(map.containsKey(sum - target)) total += map.get(sum - target);
        map.put(sum, map.getOrDefault(sum, 0) + 1);

        findPathSum(root.left, sum, target, map);
        findPathSum(root.right, sum, target, map);

        map.put(sum, map.getOrDefault(sum, 0) - 1);
        return;
    }
}
