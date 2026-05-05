class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode temp = head;
        int length = 1;

        while(temp.next != null){
            length+=1;
            temp = temp.next;
        }

        temp.next = head;

        k = k % length;

        if(k == 0){
            temp.next = null;
            return head;
        }

        int steps = length - k;
        ListNode traversal = head;

        for(int i = 1;i<steps;i++){
            traversal = traversal.next;
        }

        ListNode newHead = traversal.next;
        traversal.next = null;

        return newHead;
    }
}