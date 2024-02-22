//https://leetcode.com/problems/search-in-a-binary-search-tree/submissions/1182430941/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)return null;
        if(root.val==val)return root;
        else if(root.left==null&&root.right==null)return null;
        TreeNode leftsearch = searchBST(root.left,val);
        TreeNode rightsearch = searchBST(root.right,val);
        if(leftsearch!=null)return leftsearch;
        if(rightsearch!=null)return rightsearch;
        return null;
    }
}
