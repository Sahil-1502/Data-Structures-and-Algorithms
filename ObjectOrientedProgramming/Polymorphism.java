public class Polymorphism {
    public static void main(String args[]){
        // Calculator C1 = new Calculator();
        // System.out.println(C1.sum(1,2));
        // System.out.println(C1.sum((float)1.5,(float)2.5));
        // System.out.println(C1.sum(1 , 2,3));

        Deer D1 = new Deer();
        D1.eats();
    }
}

//overloading
class Calculator{
    int sum(int a , int b){
        return a + b;
    }
    int sum(int a , int b , int c){
        return a + b + c;
    }
    float sum(float a , float b){
        return a + b;
    }
}

//overriding
class Animal{
    void eats(){
        System.out.println("Eats Anything");
    }
}

class Deer extends Animal{
    void eats(){
        System.out.println("Eats Grass");
    }
}
