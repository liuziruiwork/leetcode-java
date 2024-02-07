//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)return null;
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
