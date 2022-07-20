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
public class PalindromeOrnot {

    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.display();

        System.out.println(ll.isPalindrome());
    }

}
class LinkedList {

    private class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

// Linked list constructor
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        return this.size() == 0;
    }
// Function to traverse and print the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");

            temp = temp.next;
        }
        System.out.println("END");
    }
// Function to add a node in beginning of linked list
    public void addFirst(int item) {

        Node temp = new Node(item, head);

        if (this.size == 0) {
            this.head = this.tail = temp;
        } 
        else {
            this.head = temp;
        }

        this.size++;
    }
    public boolean isPalindrome() {
        HeapMover start = new HeapMover();

        start.node = this.head;

        return this.isPalindrome(start, this.head, 0);
    }
//Function to check whether linked list is palindrome or not
    private boolean isPalindrome(HeapMover start, Node end, int floor) {

        if (end == null) {
            return true;
        }
//Recursive calls
        boolean rv = this.isPalindrome(start, end.next, floor + 1);

        if (rv == false) {
            return false;
        }
        if (floor >= this.size() / 2) {
            if (start.node.data != end.data) {
                return false;
            } else {
                start.node = start.node.next;
                return true;
            }
        }
        return rv;
    }
    private class HeapMover {

        Node node;
    }

}
