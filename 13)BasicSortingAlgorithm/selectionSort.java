public class selectionSort {
    public static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void print(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {85, 75, 34, 5, 3, 5, 45, 6, 2, 6, 0, 3};
        selectionSort(arr);
        print(arr);
    }
}
