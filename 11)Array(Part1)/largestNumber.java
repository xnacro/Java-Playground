import java.util.*;

public class largestNumber {
    
    public static int largestNumber(int numbers[]) {

        int largest = Integer.MIN_VALUE;
        
        for(int i=0; i < numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
        
    public static void main(String[] args) {
        int numbers[] = {95,96,97,98,99};

        System.out.println("Largest number is: " + largestNumber(numbers));
        
        
    }
}