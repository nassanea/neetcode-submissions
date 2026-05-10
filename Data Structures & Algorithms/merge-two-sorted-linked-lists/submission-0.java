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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return list1;
        else if(list1==null) return list2;
        else if(list2==null) return list1;
        else{
            ListNode p1=list1;
            ListNode p2=list2;
            ListNode tail;
            ListNode dummy = new ListNode(-1);
            tail = dummy;

            while(p1!=null && p2!=null){
                if(p1.val <= p2.val){
                    tail.next = p1;
                    p1 = p1.next;
                }
                else{ // p1.val > p2.val
                    tail.next = p2;
                    p2 = p2.next;
                }
                tail = tail.next;
            }

            if(p1!=null) tail.next = p1;
            if(p2!=null) tail.next = p2;

            return dummy.next;
            

            
        }
        
        

    }
}