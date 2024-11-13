// 1
// java packageaddnums
// Package Structure and Importing:
// Create a package named utilities.
 //Inside the utilities package, define a class MathHelper with a method int add(int a, int b)
 // that returns the sum of two integers.In a separate main class MainApp, import and use the add method to
 // compute the sum of two numbers entered by the user.


package pkg;
import java.util.Scanner;
public class packageaddnums {
        Scanner s = new Scanner(System.in);

        
        public void add(){
                int a=s.nextInt();
                int b=s.nextInt();
                int sum=a+b;
                
                System.out.printf("Sum = "+ sum);
        }
}
