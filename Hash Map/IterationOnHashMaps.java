import java.util.*;
public class IterationOnHashMaps {
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("USA",50);
        hm.put("China",150);
        hm.put("Nepal",5);

        //hm.keySet()
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key=" + k + ",value=" + hm.get(k));
        }
        System.out.println(hm);
    }    
}
