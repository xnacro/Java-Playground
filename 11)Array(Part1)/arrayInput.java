import java.util.*;

public class arrayInput {
    public static void main(String[] args) {
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of array: ");
        
        for(int i=0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        for(int i=0; i<marks.length; i++) {
           System.out.println("Value of entered array at index [" +i+"] is: " + marks[i]); 
        } 
    }
}