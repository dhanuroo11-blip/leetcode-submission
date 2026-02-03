class Solution {
    public ListNode insertionSortList(ListNode head) {

        if (head == null) return null;

        // Dummy node for sorted list
        ListNode dummy = new ListNode(0);

        ListNode curr = head;

        while (curr != null) {

            // At each iteration, insert curr into sorted list
            ListNode prev = dummy;

            // Find correct position
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            // Save next node
            ListNode nextNode = curr.next;

            // Insert curr after prev
            curr.next = prev.next;
            prev.next = curr;

            // Move to next node
            curr = nextNode;
        }

        return dummy.next;
    }
}
