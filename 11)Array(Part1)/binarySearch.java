import java.util.*;

public class binarySearch {
    
    public static int binarySearch(int numbers[], int key) {

        int start = 0; 
        int end = numbers.length -1;

        while(start <= end) {
            int mid = (start + end) / 2;
            
            // found at mid(best case)
            if(numbers[mid] == key) {
                return mid; 
            }
            // right side
            if(numbers[mid] < key) {
                start = mid + 1; // changing start
            // left side
            } else {
                end = mid - 1; // changing end
            }
        }
        return -1;
    }
        
    public static void main(String[] args) {
        int numbers[] = {95,96,97,98,99};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to search: ");

        int key = sc.nextInt();
        int index = binarySearch(numbers, key);

        if(index == -1) {
            System.out.println("Not found in these numbers");
        } else {
            System.out.println("Found at index [" +index+"] and Value is: " + numbers[index]);
        }
    }
}