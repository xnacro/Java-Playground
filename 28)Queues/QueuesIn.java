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

        // 
    }

    public static void main(String[] args) {

    }
}