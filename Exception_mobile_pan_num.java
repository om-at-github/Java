// javac Exception_mobile_pan_num.java
// java Exception_mobile_pan_num
// Write a java program to validate PAN number and Mobile Number. If it is invalid 
// then throw user defined Exception “Invalid Data”, otherwise display it. 
//

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
public class Exception_mobile_pan_num {
    public static void main(String[] args) {
        try{
            String pan = "ABCD1234E";
            if(pan.length()!=10 || !pan.matches("[A-Z]{4}[0-9]"));
            throw new MyException("Invalid Data");
            }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        
        try{
            String mobile = "1234567891";
            if(mobile.length()!=10 || !mobile.matches("[0-9]"));
            throw new MyException("Invalid Data");
            }
            catch(MyException e){
                System.out.println(e.getMessage());
            }
            }
        }
        