public class LinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // reference variables 
    public static Node head;
    public static Node tail;

    // Add - First
    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);   
        
        // if list is empty
        if(head == null) {
            head = tail = newNode;
            return;
        }
        
        // new node next = head
        newNode.next = head;
        // head = newNode
        head = newNode;
    } 
 
    //Add - last
     public void addLast(int data) {

        Node newNode = new Node(data); 

        // if list is empty
        if(head == null) {
            head = tail = newNode;
            return;
        }
        // tail.next = newNode
        tail.next = newNode;

        // tail = newNode     
        tail = newNode;
     }

     // Print a Linked List

     
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
    }
}