// javac link_list_demo.java
// java link_list_demo

import java.util.LinkedList;

class link_list_demo {
    public static void main(String[] agrs){
        // create linklist
        LinkedList<String> animals = new LinkedList<>();
        

        //add() method without the index parameter
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkList:" +animals);

        // add() method with the index parameter
        animals.add(3,"Horse");
        System.out.println("Updates LinkedList:" +animals);
    }    
}
