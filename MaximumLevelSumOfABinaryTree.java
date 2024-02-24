//https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public ArrayList<Integer> list = new ArrayList<Integer>();
    public int maxLevelSum(TreeNode root) {
        dive(root,1);
        for(int i = 0;i<list.size()-1;i++){
            //System.out.println(list.get(i));
        }
        return list.indexOf(Collections.max(list))+1;
    }
    public void dive(TreeNode root, int level){
        if(root==null)return;
        if(list.size()<level)list.add(0);
        list.set(level-1, list.get(level-1)+root.val);
        dive(root.left,level+1);
        dive(root.right,level+1);
    }
}
