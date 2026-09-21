public class bubbleSort {
    public static void bubbleSort(int arr[]) {
        for(int turn = 0; turn < arr.length; turn++) {
            for(int j = 0; j < arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
    }
    public static void print(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {85,75,34,5,3,5,45,6,2,6,0,3};
        bubbleSort(arr);
        print(arr);
    }
}