// javac exception_handling_throw_check_sal.java
// java exception_handling_throw_check_sal

public class exception_handling_throw_check_sal{
    static void check_sal(int sal){
        if(sal<20000){
            throw new ArithmeticException("salary less than 20000");
        }
        else{
            System.out.println("sal<20000");
        }
    }
    public static void main(String args[]){
        check_sal(110000);
    }
}
