class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        Stack<ListNode> st = new Stack<>();
        ListNode curr = head;
        int len = 0;
        while(curr != null){
            st.push(curr);
            curr = curr.next;
            len++;
        }
        curr = head;
        for(int i = 0; i < len/2; i++){
            ListNode last = st.pop();
            last.next = curr.next;
            curr.next = last;
            curr = last.next;
        }
        
        if(curr != null){
            curr.next = null;
        }

    }
}
