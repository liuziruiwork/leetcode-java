//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(containsValue(root.left,p)&&containsValue(root.right,q))return root;
        if(containsValue(root.left,q)&&containsValue(root.right,p))return root;

        if(containsValue(root.left,q)&&root.val==p.val)return root;
        if(containsValue(root.left,p)&&root.val==q.val)return root;
        if(containsValue(root.right,q)&&root.val==p.val)return root;
        if(containsValue(root.right,p)&&root.val==q.val)return root;

        if(containsValue(root.left,q)&&containsValue(root.left,p))return lowestCommonAncestor(root.left,p,q);
        if(containsValue(root.right,q)&&containsValue(root.right,p))return lowestCommonAncestor(root.right,p,q);
        return null;
    }
    public boolean containsValue(TreeNode root, TreeNode p){
        if(root==null)return false;
        if(root.val==p.val)return true;
        return containsValue(root.left, p)||containsValue(root.right, p);
    }
}
