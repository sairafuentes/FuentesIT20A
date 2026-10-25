/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelim;

/**
 *
 * @author andil
 */
public class doublyLinkedList {
    class Node {

        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }
    Node head;

    // Add a node at the end
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.previous = current;
    }

    // Display the list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");

    }

    // Display nodes
    void displaynodes() {
        Node current = head;

        while (current != null) {

            System.out.print("Previous: ");

            if (current.previous != null) {
                System.out.print(current.previous);
            } else {
                System.out.print("null");
            }

            System.out.print(" | Data: " + current.data);
             System.out.print(" | Current Nodes: " + current);
            

            System.out.print(" | Next: ");

            if (current.next != null) {
//                System.out.println(current.next.data);
                System.out.println(current.next);
            } else {
                System.out.println("null");
            }

            current = current.next;
        }
    }

    public static void main(String[] args) {
        doublyLinkedList list = new doublyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.display();
        list.displaynodes();
    
}
}

    

