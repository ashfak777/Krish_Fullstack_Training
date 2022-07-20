/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author ashfak
 */
public class ReverseLinkedList {

    public static Node head = null;

    public Node reverseRecur2(Node current) {
        if (current == null) {
            return null;
        }
        if (current.next == null) {
            head = current;
            return null;
        }
        reverseRecur2(current.next);
        current.next.next = current;
        current.next = null;
        return head;
    }

    public void display(Node head) {
        //
        Node currNode = head;
        while (currNode != null) {
            System.out.print("->" + currNode.data);
            currNode = currNode.next;
        }
    }

    public static void main(String args[]) {
        head = new Node(20);
        head.next = new Node(15);
        head.next.next = new Node(10);
        System.out.println("Original List :");
        ReverseLinkedList r = new ReverseLinkedList();
        r.display(head);
        System.out.println("\nReversed List :");
        Node x = r.reverseRecur2(head);
        r.display(x);
    }
}

class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
