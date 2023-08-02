public class Interface {
    public static void main(String[] args) {
        // Queen Q = new Queen();
        // Q.moves();

        Bear B = new Bear();
        B.eatsAnimals();
        B.eatsPlants();

    }
}

interface ChessPlayer {

    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right - by one tile only");
    }
}

interface Herbivore{
    void eatsPlants();
}

interface Carnivore{
    void eatsAnimals();
}

class Bear implements Herbivore, Carnivore{
    public void eatsPlants(){
        System.out.println("bear eats plants");
    }

    public void eatsAnimals(){
        System.out.println("bear eats animals");
    }
}