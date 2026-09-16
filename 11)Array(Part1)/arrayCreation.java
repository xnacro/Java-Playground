// array creation

public class arrayCreation {
    public static void main(String[] args) {
        // declaration 
        int marks[];

        // creation or memory allocation
        marks = new int[5];

        // initialization
        marks[0] = 98;
        marks[1] = 88;
        marks[2] = 78;
        marks[3] = 92;
        marks[4] = 85;

        // access or print
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println();
        // we can write it like this also

        int mark2[] = {32, 45, 54, 64, 85};

        for(int i = 0; i<mark2.length; i++) {
            System.out.println(mark2[i]);
        }
        System.out.println();

        // in java, strings are also arrays of character
        String name = "John";

        char name2[] = {'J', 'o', 'h', 'n'};
        
        String name3[] = {"John", "Jack", "Joe", "Jill"};

        for(int i = 0; i<name3.length; i++) {
            System.out.println("Name of person : " + name3[i]);
        }
        System.out.println();

        String prince[] = new String[5];

        prince[0] = "Prince";
        prince[1] = "Akarsh";
        prince[2] = "Yash";
        prince[3] = "Anmol";
        prince[4] = "Shubham";

        for(int i = 0; i<prince.length; i++) {
            System.out.println(prince[i]);
        }
    }
}