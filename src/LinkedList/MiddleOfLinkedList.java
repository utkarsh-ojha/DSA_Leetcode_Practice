package LinkedList;
/*
Leetcode Link: https://leetcode.com/problems/middle-of-the-linked-list/description/
*/
public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head,
                fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

