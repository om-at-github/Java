// javac check_vowels_in_give_string.java
// java check_vowels_in_give_string

import java.util.Scanner;
public class check_vowels_in_given_string {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Prompt the user to enter a string
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
    
            // Convert the input string to lowercase to handle both uppercase and lowercase vowels
            input = input.toLowerCase();
    
            // Iterate through each character in the string
            System.out.print("Vowels in the string: ");
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
    
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.print(ch + " ");
                }
            }
    
            // Close the scanner
            scanner.close();
        }
    }
       

