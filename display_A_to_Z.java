// javac display_A_to_Z.java
// java display_A_to_Z

public class display_A_to_Z {
    public static void main(String[] args) {
        // ASCII value of 'A' is 65 and 'Z' is 90
        int start = 65; // ASCII value of 'A'
        int end = 90;   // ASCII value of 'Z'

        // Using a for loop to iterate through ASCII values from 'A' to 'Z'
        for (int i = start; i <= end; i++) {
            char ch = (char) i; // Casting integer ASCII value to char

            // Printing the characters along with their ASCII values
            System.out.print(ch + " ");
        }
        System.out.println(); // Print a new line after the loop completes
    }

}