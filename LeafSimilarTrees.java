//https://leetcode.com/problems/leaf-similar-trees/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leaves1 = new ArrayList<Integer>();
        ArrayList<Integer> leaves2 = new ArrayList<Integer>();
        leafSeq(root1,leaves1);
        leafSeq(root2,leaves2);
        return leaves1.equals(leaves2);
    }

    public void leafSeq(TreeNode root, ArrayList<Integer> leaves){
        if(root==null)return;
        if(root.left==null&&root.right==null)leaves.add(root.val);
        else {
            leafSeq(root.left, leaves);
            leafSeq(root.right, leaves);
        }
    }
}
