// javac multilevel_inheritance.java
// java multilevel_inheritance

class White{
    int num;
    White(int x){
        num = x;
    }
}

class Red extends White{
    Red(int y){
        super(y);
    }
    
    void print(){
        System.out.println("Value of num :"+num);
    }
}

class Magenta extends Red{
    int maggy;
    Magenta(int z){
        super(z);
        maggy=z;
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        Magenta m = new Magenta(9);
        m.print();
        System.out.println("value of maggy"+m.maggy);
    }
}
