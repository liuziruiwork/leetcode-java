//https://leetcode.com/problems/count-good-nodes-in-binary-tree/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int goodNodes(TreeNode root) {
        return isitgood(root, root.val);
    }

    public int isitgood(TreeNode root, int max){
        if(root==null)return 0;
        int good = 0;
        if(root.val>=max){
            good = 1;
            max = root.val;
        }
        return good+isitgood(root.left,max)+isitgood(root.right,max);
    }
}
