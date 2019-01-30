class ListNode {
    ListNode next;
    int val;
    ListNode(int x) {
        val = x;
    }

    public ListNode() {

    }
}



public class SolutionLinkedList {
    public static ListNode deleteDuplicates(ListNode head) {
            if (head == null) return head;
            ListNode dummy = new ListNode(0);
            ListNode a = dummy;
            dummy.val = head.val;
            while (head != null){
                if (dummy.val == head.val){
                    head = head.next;
                } else {
                    dummy.next = head;
                    dummy = dummy.next;
                    head = head.next;
                }
            }
            return a;
        }


        public static void main (String args[]) {
            ListNode a = new ListNode(0);
            a.val = 1;
            ListNode b = new ListNode(1);
            a.next = b;
            b.val = 2;
            ListNode c = new ListNode(2);
            b.next = c;
            c.val = 2;
            ListNode q = new ListNode();
            q = deleteDuplicates(a);
    }
    }

