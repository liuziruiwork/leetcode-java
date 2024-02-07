//https://leetcode.com/problems/odd-even-linked-list/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)return null;
        ListNode oddcurr = head;
        ListNode evencurr = head.next;
        ListNode evenhead = head.next;
        while(oddcurr.next!=null&&oddcurr.next.next!=null){
            oddcurr.next = oddcurr.next.next;
            oddcurr = oddcurr.next;
            evencurr.next = evencurr.next.next;
            evencurr = evencurr.next;
        }
        oddcurr.next = evenhead;
        return head;
    }
}
