public class Super {
    public static void main(String args[]){
        Horse H = new Horse();
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super.color = "brown";
        System.out.println("horse Constructor is called");
    }
}