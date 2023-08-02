import java.util.*;

public class LinkedHashSet1 {
    public static void main(String args[]){

        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("banglore");
        cities.add("hyderabad");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("delhi");
        lhs.add("banglore");
        lhs.add("hyderabad");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("delhi");
        ts.add("banglore");
        ts.add("hyderabad");
        System.out.println(ts);

    }
}
