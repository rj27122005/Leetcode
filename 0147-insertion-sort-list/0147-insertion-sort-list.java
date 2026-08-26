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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        while(curr!=null){            
            ListNode temp = curr.next;
            ListNode ptr = dummy;
            while(ptr.next!= null && ptr.next.val <=curr.val){
                ptr= ptr.next;
            }
            curr.next= ptr.next;
            ptr.next= curr;
            curr= temp;
        }
        return dummy.next;
    }
}