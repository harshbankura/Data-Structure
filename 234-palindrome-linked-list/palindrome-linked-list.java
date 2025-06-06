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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode fh=head;
        ListNode sh=reverse(slow);
        while(sh!=null){
            if(fh.val!=sh.val)return false;
            fh=fh.next;
            sh=sh.next;
        }
        return true;
        
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nn= curr.next;
            curr.next=prev;
            prev=curr;
            curr=nn;
        }
        return prev;
    }
}