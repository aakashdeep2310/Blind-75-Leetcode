class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode curr = head;
        int length = 0;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        int del = length - n + 1;
        if(del == 1) return head.next;
        ListNode temp = head;
        int count = 1;
        while(count< del -1){
            temp = temp.next;
            count++;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
        return head;
    }
}
