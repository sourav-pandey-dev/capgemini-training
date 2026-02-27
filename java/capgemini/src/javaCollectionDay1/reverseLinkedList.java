package javaCollectionDay1;

public class reverseLinkedList {
    public static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    public static Node AddNode(int val, Node pos) {
        Node node = new Node(val);
        pos.next = node;
        return node;
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node pos = head;
        pos = AddNode(20, pos);
        pos = AddNode(30, pos);
        pos = AddNode(40, pos);
        pos = AddNode(50, pos);

        printList("Before reversing:", head);
        head = reverse(head);
        printList("After reversing:", head);
    }

    static void printList(String message, Node head) {
        System.out.println(message);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println("\n");
    }
}