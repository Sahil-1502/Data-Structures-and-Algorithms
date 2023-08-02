import java.util.*;

public class Maximum {
    public static void main(String args[]){
        ArrayList <Integer>list2 = new ArrayList<>();   
        list2.add(2);
        list2.add(5);
        list2.add(9);
        list2.add(3);
        list2.add(6);

        int max = Integer.MIN_VALUE;

        for(int i=0;i<list2.size();i++){
            // if(list2.get(i)>max){
            //     max = list2.get(i);
            // }
            max = Math.max(list2.get(i),max);
        }
        System.out.println(max);
    }
}
