// javac try_catch.java
// java try_catch

public class try_catch {
    public static void main(String[] args) {
        int i,j;
        try{
            System.out.println("Inside Try Block_");
            i=0;
            j=2078/i;
            System.out.println("Value of j:" +j);
            System.out.println("Try Block over.........");
        }
        catch(ArithmeticException e){
            System.out.println("werty");
        }
        System.out.println("uuuu");
    }
}
