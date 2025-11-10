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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;

        // Using a priority queue (min-heap) is the most efficient way to always pick the smallest node among all k lists.

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);   // this helps to know the smallest element

        // Add the first node of each list to the heap
        for (ListNode node : lists)
          if (node != null) 
            pq.add(node);
        
        ListNode dummy = new ListNode(-1);  // dummy node initially points to null
        ListNode current = dummy;

        while(!pq.isEmpty()) {
            ListNode smallest = pq.poll(); // retrieves and removes the head of the priority queue
            current.next = smallest; //current should point to that element
            current = current.next; // move the pointer

            if(smallest.next != null) {
                pq.add(smallest.next);
            }
        }
        return dummy.next;
    }
}