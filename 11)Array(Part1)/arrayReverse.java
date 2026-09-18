import java.util.*;

public class arrayReverse {
    
    public static void arrayReverse(int numbers[]) {
        int first = 0; 
        int last = numbers.length-1;

        while(first < last) {
            // swap the number 
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            // changing pointer
            first++;
            last--;
        }
    }
        
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        arrayReverse(numbers);

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }   
    }
}