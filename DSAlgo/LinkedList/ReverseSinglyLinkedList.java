package com.DSAlgo.LinkedList;

public class ReverseSinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        System.out.println("Original Linked List:");
        printLinkedList(head);
        head=reverseLinkedList(head);
        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }

    private static Node reverseLinkedList(Node head) {
        Node temp = head;
        Node prev =null;
        while (temp != null) {
            Node front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

    private static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
