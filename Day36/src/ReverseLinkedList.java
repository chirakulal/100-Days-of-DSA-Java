public class ReverseLinkedList {


        public static ListNode reverseList(ListNode head) {

            ListNode prev = null;
            ListNode current = head;

            while (current != null) {

                ListNode next = current.next; // store next

                current.next = prev;          // reverse

                prev = current;               // move prev

                current = next;               // move current
            }

            return prev; // new head
        }

    public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next=new ListNode(4);
        ListNode newHead = reverseList(head);
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }



}
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}