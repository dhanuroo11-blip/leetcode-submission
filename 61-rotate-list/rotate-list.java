class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: find length and last node
        int length = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Step 2: make it circular
        tail.next = head;

        // Step 3: reduce useless rotations
        k = k % length;

        // Step 4: find new tail
        int steps = length - k - 1;
        ListNode newTail = head;

        for (int i = 0; i < steps; i++) {
            newTail = newTail.next;
        }

        // Step 5: break circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}