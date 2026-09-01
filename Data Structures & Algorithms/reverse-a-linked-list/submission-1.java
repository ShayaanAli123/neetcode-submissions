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
    public ListNode reverseList(ListNode head) {
        List <Integer> newOne = new Arraylist<>();
        for (int i = head.size; i >=0; i--) {
            int inserter = head.get(i);
            newOne.add(inserter);
        }
        
    }
}
