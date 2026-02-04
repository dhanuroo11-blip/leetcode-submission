class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

        HashSet<Integer> set = new HashSet<>();

      
        for(int num : nums) {
            set.add(num);
        }

      
        while(head != null && set.contains(head.val)) {
            head = head.next;
        }

        ListNode current = head;
        ListNode previous = null;

        while(current != null) {

            if(set.contains(current.val)) {
               
                previous.next = current.next;
            } 
            else {
                
                previous = current;
            }

            current = current.next;
        }

        return head;
    }
}
