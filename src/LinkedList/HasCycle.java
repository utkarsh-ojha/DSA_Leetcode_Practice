package LinkedList;

import java.util.HashMap;

/*
Leetcode Link: https://leetcode.com/problems/linked-list-cycle/description/
 */
public class HasCycle {
    //Solution -1
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode currentHead = head;
        HashMap<ListNode, ListNode> count = new HashMap<>();
        while (currentHead.next != null) {
            if (count.containsKey(currentHead) && count.get(currentHead) == currentHead.next) {
                return true;
            } else count.put(currentHead, currentHead.next);

            currentHead = currentHead.next;
        }
        return false;
    }

    //Solution 2
    public boolean hasCycle2(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false;
    }
}

