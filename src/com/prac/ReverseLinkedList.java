package com.prac;
class Node{
    Node next;
    int data;

    public Node(Node next, int data){
        this.next = null;
        this.data = data;
    }
}
public class ReverseLinkedList {
    Node head;
    public Node reverseLinkedList(Node node){
        Node previous = null;
        Node current = head;
        Node next = null;

        if(head == null){
            return null;
        }
        if(current.next == null){
            return head;
        }
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        node = previous;
        return node;
    }
}
