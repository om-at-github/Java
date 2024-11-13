//  javac single_inheritance.java
// java single_inheritance
// Find cube

import java.util.Scanner;
class First{
    
    int val;
    void init()
    {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("enter the numeber :");
            int val = s.nextInt();
            this.val = val;
        }
    };
    int square(){
        return(val*val);
    }
}

class Second extends First{
    int mem;
    int cube(){
        mem = square()*val;
        return mem;
    }
}

public class single_inheritance{
    public static void main(String[] args) {
        
        Second s = new Second();
        s.init();
        System.out.println("Cube:"+s.cube());
    }
}
