/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode mid=getMid(head);
        ListNode left=head;
        ListNode right = mid.next;
        mid.next=null;
        ListNode lsort=sortList(left);
        ListNode rsort=sortList(right);
        return merge(lsort,rsort);

        
    }
    private ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return prev;
    }
    private ListNode merge(ListNode left,ListNode right){
        ListNode dummy= new ListNode(-1);
        ListNode tail=dummy;
        while(left!=null&&right!=null){
            if(left.val<right.val){
                tail.next=left;
                left=left.next;
            }else{
                tail.next=right;
                right=right.next;
            }
            tail=tail.next;
        }
        if(left!=null)tail.next=left;
        if(right!=null)tail.next=right;
        return dummy.next;

    }
}