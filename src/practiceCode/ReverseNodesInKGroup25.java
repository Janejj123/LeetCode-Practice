package practiceCode;

import javafx.application.Application;
import javafx.stage.Stage;

public class ReverseNodesInKGroup25 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val; }
        ListNode(int val, ListNode next) {this.val = val; this.next = next; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;

        while (curr != null && count != k) {
            curr = curr.next;
            count++;
        }
        if (count == k)
            curr = reverseKGroup(curr, k);
            while (count-- > 0) {
                ListNode tmp = head.next;
                head.next = curr;
                curr = head;
                head = tmp;
            }
            head = curr;
            return curr;
    }
}