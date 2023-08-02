public class Inheritence {
    public static void main(String args[]){
        // Fish Shark = new Fish();
        // Shark.eats();
        // Shark.Swim();

        // Dogs pug = new Dogs();
        // pug.eats();
        // pug.legs = 4;

        

    }
}

class Animal{

    String color;

    void eats(){
        System.out.println("eats");
    }

    void SkinColor(String color){
        this.color = color;
    }

}

// single level inheritence

// class Fish extends Animal{
//     int fins;

//     void Swim(){
//         System.out.println("the fish swims");
//     }
// }

// multi level Inheritence

// class Mamal extends Animal{
//     int legs;
// }

// class Dogs extends Mamal{
//     String breed;
// }

// hierarchical Inheritence

class Mamal extends Animal{
    void walks(){
        System.out.println("can walk");
    }
}

class bird extends Animal{
    void fly(){
        System.out.println("Can fly");
    }
}

class fish extends Animal{
    void swim(){
        System.out.println("can Swim");
    }
}
