//https://leetcode.com/problems/maximum-depth-of-binary-tree/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
