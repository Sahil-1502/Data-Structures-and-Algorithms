import java.util.*;

public class Sorting {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        Sort(list);
        SortUlta(list);
    }

    public static void Sort(ArrayList<Integer> list){
        Collections.sort(list);     // assending order
        System.out.println(list);
    }

    public static void SortUlta(ArrayList<Integer> list){
        Collections.sort(list, Collections.reverseOrder());     // descending  order
        //comparator
        System.out.println(list);
    }
}