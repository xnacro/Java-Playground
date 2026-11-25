public class QueuesIn {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isEmpty operation
        public static boolean isEmpty() {
            return rear == -1;
        }

        // add operation // o(1)
        public static void add(int data) {
            if(rear == size-1) {
                System.out.println("Queue is full");
                return;
            }

            rear += 1;
            arr[rear] = data;
            System.out.println("Added elements = " + data);
        }

        // remove operation // O(n)
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];
            for(int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear -= 1;
            return front;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println("Removed = " + q.remove());
        }
    }
}