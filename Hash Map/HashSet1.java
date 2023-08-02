import java.util.*;
public class HashSet1 {
    public static void main(String args[]){
        // HashSet<Integer> set = new HashSet<>();

        // set.add(2);
        // set.add(4);
        // set.add(5);
        // set.add(2);
        // set.add(4);

        // System.out.println(set);

        // set.remove(2);
        // if(set.contains(2)){
        //     System.out.println("contains 2");
        // }
        // if(set.contains(6)){
        //     System.out.println("contains 6");
        // }

        // // set.clear();
        // // System.out.println(set.size());
        // System.out.println(set.isEmpty());

        //ITERATION IN HASHSET

        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("banglore");
        cities.add("hyderabad");

        // //iterator
        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        //advanced loops -- cities se ek ek karke city me store hongi
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
