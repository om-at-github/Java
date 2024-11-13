// javac Exceptiondemo.java
// java Exceptiondemo


class MyException extends Exception{
    String str;
    MyException(){
        str = "some thing went wrong";
    }

    public String toString(){
        return str;
    }
}

class Exceptiondemo{
    static void compute(int a)throws MyException
    {
        if(a>10){
            throw new MyException();
        }
        else{
            System.out.println("a=" +a);
        }
    }

    public static void main(String args[]){
        try{
            compute(1);
            compute(20);
        }
        catch(MyException e){
            System.out.println("Caught" +e);
        }
    }
}

