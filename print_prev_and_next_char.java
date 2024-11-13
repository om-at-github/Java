// javac print_prev_and_next_char.java
// java print_prev_and_next_char

public class print_prev_and_next_char{
    public static void main(String args[])
    {
        char c='a';
        char temp = c;
        System.out.println("next char - " + ++c);
        System.out.println("prev char - " + --temp);
        
    }
}