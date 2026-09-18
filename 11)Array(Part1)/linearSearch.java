import java.util.*;

public class linearSearch {
    // function is int type so we must have to return anything
    public static int linearSearch(int marks[], int key) {
        
        for(int i=0; i < marks.length; i++) {
            if(marks[i] == key) {
                // inside loop don't use print statement
                // only use return statement
                return i;
            }
        }
        // if not found
        return -1;
    }
    public static void main(String[] args) {
        int marks[] = {95,96,97,98,99};
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the marks you want to search: ");
        int key = sc.nextInt();

        int index = linearSearch(marks, key);

        //cases
        if(index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index [" +index+"] and Value is: " + marks[index]);
        } 
        
    }
}