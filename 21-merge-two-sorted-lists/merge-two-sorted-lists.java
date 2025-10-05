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

        // Step 1: Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        // Step 3: Merge nodes while both lists have elements
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {       // list1 node is smaller or equal
                current.next = list1;           // attach it
                list1 = list1.next;             // move list1 forward
            } else {                            // list2 node is smaller
                current.next = list2;           // attach it
                list2 = list2.next;             // move list2 forward
            }
            current = current.next;             // move current forward
        }

        // Step 4: Attach remaining nodes (one list might still have nodes)
        current.next = (list1 != null) ? list1 : list2;

        // Step 5: Return head of merged list (skip dummy node)
        return dummy.next;

         /*
        Example: list1 = [1,2,4], list2 = [1,3,4]

        Step | Attach | list1 | list2 | Merged List (via dummy.next)
        1    | 1      | 2,4   | 1,3,4 | 1
        2    | 1      | 2,4   | 3,4   | 1 -> 1
        3    | 2      | 4     | 3,4   | 1 -> 1 -> 2
        4    | 3      | 4     | 4     | 1 -> 1 -> 2 -> 3
        5    | 4      | null  | 4     | 1 -> 1 -> 2 -> 3 -> 4
        6    | 4      | null  | null  | 1 -> 1 -> 2 -> 3 -> 4 -> 4
        */
    }
}