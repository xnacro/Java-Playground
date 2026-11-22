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
    public static int size;

    // Add - First
    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);   
        size++;
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
        size++;
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
     
    // Add element in the middle at any idx
    public void addMiddle(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;

        int i = 0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        // i == idx-1 temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // removeFirst
    public int removeFirst() {

        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // removeLast
    public int removeLast() {

        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i = 0; i < size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
    // iterative approach(linear search) 
    public int iSearch(int key) {
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
     // Print a Linked list
     public void printList() {     
        if(head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
     }
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.printList();
        ll.addFirst(2);
        ll.printList();
        ll.addFirst(1);
        ll.printList();
        ll.addLast(4);
        ll.printList();
        ll.addLast(5);
        ll.printList();
        ll.addMiddle(3,5);
        ll.printList();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.printList();

        ll.removeLast();
        ll.printList();
        System.out.println(ll.iSearch(3));
        System.out.println(ll.iSearch(4));     
    }
}