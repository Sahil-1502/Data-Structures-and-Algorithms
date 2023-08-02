public class Abstract {

    public static void main(String args[]){
        // Horse H1 = new Horse();
        // H1.eats();
        // H1.walk();

        // Chicken C1 = new Chicken();
        // C1.eats();
        // C1.walk();

        // Animal A1 = new Animal();

        Horse H1 = new Horse();
        // System.out.println(H1.color); 
        // H1.changeColor("Dark brown");
        // System.out.println(H1.color);
    }
    
}

abstract class Animal{

    String color;

    void eats(){
        System.out.println("Animal Eats");
    }

    abstract void walk();
    // the implementation is written in the subclass and depends
    // the sub class not on the parent class

    //constructor
    // Animal(){
    //     this.color = "brown";
    // }

    Animal(){
        System.out.println("Animal Constructor called");
    }
}

class Horse extends Animal{
    void walk() {
        System.out.println("walks on 4 legs");
    }

    void changeColor(String color){
        this.color = color;
    }

    Horse(){
        System.out.println("Horse Constructor called");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on two legs");
    }

    void changeColor(String color){
        this.color = color;
    }
}
