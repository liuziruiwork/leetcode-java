//https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/?envType=study-plan-v2&envId=leetcode-75
class Solution {

    int maxPath = 0;
    public void solve(TreeNode root, int steps, boolean goingLeft){
        if(root == null){
            return ;
        }
        maxPath = Math.max(maxPath, steps);
        if(goingLeft){
            solve(root.left,steps+1,false);
            solve(root.right,1,true);
        }
        else{
            solve(root.right,steps+1,true);
            solve(root.left,1,false);
        }
    }
    public int longestZigZag(TreeNode root) {
        solve(root,0,true);
        solve(root.left,0,true);
        solve(root.right,0,false);
        return maxPath;
    }
}
