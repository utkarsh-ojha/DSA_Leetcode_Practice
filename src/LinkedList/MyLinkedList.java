package LinkedList;
/*
Leetocde Link: https://leetcode.com/problems/design-linked-list/description/
 */
public class MyLinkedList {
    Node head;
    int len;

    public MyLinkedList() {
        head = null;
        len = 0;
    }

    public int get(int index) {
        if (index < 0 || len <= index) return -1;
        Node cur = this.head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.data;
    }

    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = this.head;
        this.head = newHead;
        this.len += 1;
    }

    public void addAtTail(int val) {
        if (len == 0) {
            addAtHead(val);
            return;
        }
        Node nodeCurrent = this.head;
        while (nodeCurrent.next != null) {
            nodeCurrent = nodeCurrent.next;
        }
        Node newNode = new Node(val);
        nodeCurrent.next = newNode;
        this.len++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || len < index) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node newNode = new Node(val);
        Node cur = this.head;
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        Node tempIndexNode = cur.next;
        cur.next = newNode;
        newNode.next = tempIndexNode;
        this.len++;
        return;
    }

    public void deleteAtHead() {
        this.head = this.head.next;
        this.len--;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || len <= index) return;
        if (index == 0) {
            deleteAtHead();
            return;
        }
        Node cur = this.head;
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        this.len--;
    }
}

class Node {
    int data;
    Node next;

    public Node(int val) {
        this.data = val;
        this.next = null;
    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */


