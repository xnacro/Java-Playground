public class CyclicQueue {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // isEmpty operation
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // isFull operation
        public static boolean isFull() {
            return (rear+1) % size == front;
        }

        // add operation // o(1)
        public static void add(int data) {
            if(isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // adding 1st element
            if(front == -1) {
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
            System.out.println("Added elements = " + data);
        }

        // remove operation // O(n)
        public static int remove() {

            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int results = arr[front];
            if(front == rear) {
                front = rear = -1;
            } else {
            front = (front + 1) % size;
            }
            return results;
        }

        // peek operation
        public static void peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.println(arr[front]);     
        }
    }


    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println("Removed = " + q.remove());
            q.peek();     
        }
    }
}