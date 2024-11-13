// javac country_state_inhertance.java
// java country_state_inhertance

// Python Program to Create a Class in which One Method Accepts a String from the 
// User and Another method Prints it. Define a class named Country which has a method 
// called print Nationality. Define subclass named state from Country which has a mehtod 
// called printState. Write a method to print state, country and nationality.

public class country_state_inhertance {
    public static void main(String[] args) {
        country c1 = new country("India", "Asia", "New Delhi", "English");
        c1.printNationality();
        state s1 = new state("Karnataka", "India", "Asia", "Bang");
        s1.printState();

        void acceptCountry(name){
        this.cname = name;
        }
    void displayCountry(){
        return this.cname;
    }

    }
}

class State(country_state_inhertance){
    void Acceptstate(state){
        this.sstate = state;
    }
    void displaystate(){
        return this.sstate;
    }

    obj.acceptCountry();
    obj.displayCountry();
    obj.Acceptstate();
    obj.displaystate();
}
