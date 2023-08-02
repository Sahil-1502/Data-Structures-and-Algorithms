import java.util.*;
public class Itinerary {

    public static String getStart(HashMap<String,String> map1){
        HashMap<String,String> map2 = new HashMap<>();
        
        for(String key : map1.keySet()){
            map2.put(map1.get(key),key);
        }

        for(String key : map1.keySet()){
            if(!map2.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String,String> map1 = new HashMap<>();
        map1.put("Chennai","Bengaluru");
        map1.put("Mumbai" , "Delhi");   //dont give space here 
        map1.put("Goa", "Chennai");
        map1.put("Delhi", "Goa");

        String start = getStart(map1);
        System.out.print(start);

        for(String key : map1.keySet()){
            System.out.print(" -> " + map1.get(start));
            start = map1.get(start);
        }
        System.out.println();
        
    }
}
