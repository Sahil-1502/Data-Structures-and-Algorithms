import java.util.*;
import java.util.HashMap;
// import java.util.Map;


public class LinkedHashMap1 {

    public static void main(String args[]){
        // LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        // lhm.put("India", 100);
        // lhm.put("china" , 150);
        // lhm.put("USA",50);

        // System.out.println(lhm);

        //alphabetical order
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("china" , 150);
        tm.put("USA",50);

        System.out.println(tm);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("china" , 150); 
        hm.put("USA",50);

        System.out.println(hm);
    }
}
