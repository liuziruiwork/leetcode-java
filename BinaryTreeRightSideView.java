//https://leetcode.com/problems/binary-tree-right-side-view/submissions/1185222152/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static void levelOrder(TreeNode root,ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            ArrayList<Integer> levelList = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();
                levelList.add(curr.val);

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            arr.add(levelList.get(levelList.size()-1));
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
         arr = new ArrayList<>();
         levelOrder(root,arr);
         return arr;
    }
}
