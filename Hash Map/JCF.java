// import java.sql.ShardingKeyBuilder;
import java.util.HashMap;
public class JCF {
    public static void main(String args[]){
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //Put
        hm.put("sahil", 1);
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",50);

        System.out.println(hm);

        //get 
        int Population = hm.get("India");
        System.out.println(Population);

        // int pop1 = hm.get("hi");

        //ContainsKey
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("nigg"));

        //Remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);
        System.out.println(hm.remove("nigg"));

        //Size
        System.out.println(hm.size());

        //Is Empty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
