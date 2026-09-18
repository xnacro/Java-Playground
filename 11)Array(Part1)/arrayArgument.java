import java.util.*;

// in java all array are pass by refrence (NOT BY VALUE)
public class arrayArgument {
    public static void update(int marks[]) {
        for(int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {95,96,97,98,99};
        update(marks);
        
        for(int i=0; i<marks.length; i++) {
           System.out.println("Value of array at index [" +i+"] is: " + marks[i]); 
        } 
    }
}