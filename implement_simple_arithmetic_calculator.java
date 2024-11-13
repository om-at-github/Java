// javac implement_simple_arithmetic_calculator.java
// java implement_simple_arithmetic_calculator
//  Write a program to implement simple arithmetic calculator. Perform appropriate validations.


import java.util.Scanner;
public class implement_simple_arithmetic_calculator {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number1 =");
        int num = s.nextInt();
        System.out.println("enter the number2 =");
        int num2 = s.nextInt();
        System.out.println("Enter the operation (+, -, *, /):");
        char operator = s.next().charAt(0);
        int result=0;
        switch (operator) {
            case '+':
                result = num + num2;
                System.out.println("result="+result);
                break;
            case '-':
                result = num - num2;
                System.out.println("result="+result);
                break;

            case '/':
                result = num / num2;
                System.out.println("result="+result);
                break;

            case '*':
                result = num * num2;
                System.out.println("result="+result);
                break;

            default:
            System.out.println("Invalid operation");
                break;
        }       
   
    }
}