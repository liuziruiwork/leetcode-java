//https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int pairSum(ListNode head) {
        int max = 0;
        Stack<Integer> stack = new Stack<Integer>();
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null){
            stack.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        while(slow!=null){
            max = Math.max(max, slow.val+stack.pop());
            slow = slow.next;
        }
        return max;
    }
}
