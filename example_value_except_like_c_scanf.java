// javac example_value_except_like_c_scanf.java
// java example_value_except_like_c_scanf

import java.util.Scanner;
public class example_value_except_like_c_scanf{
    public static void main(String args[]){

        @SuppressWarnings("resource")
        Scanner S = new Scanner(System.in);

        System.out.println("Enter a integer");
        int a = S.nextInt();
        System.out.println("integer = " + a);
        System.out.println("Enter a string");
        String b = S.nextLine();
        System.out.println("string = " + b);
        System.out.println("Enter a character");
        char c = S.next().charAt(0);
        System.out.println("character = " + c);
    }
}