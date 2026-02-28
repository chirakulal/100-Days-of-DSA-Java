
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {

        if (head == null || head.next == null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        // Creating nodes
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        // Linking nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        boolean result = hasCycle(node1);
        System.out.println("Cycle Exists: " + result);
    }
}