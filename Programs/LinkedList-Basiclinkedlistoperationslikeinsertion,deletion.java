// Node class for the linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList {
    Node head;

    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Delete by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If the node to be deleted is the head node
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        // If the value is not found
        if (current.next == null) {
            System.out.println("Value not found.");
            return;
        }

        // Delete the node
        current.next = current.next.next;
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Main class to test LinkedList operations
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Display list
        System.out.println("Linked List:");
        list.display();

        // Delete element
        list.delete(20);
        System.out.println("After deleting 20:");
        list.display();

        // Try deleting non-existent element
        list.delete(100);
    }
}