import java.util.*;
public class Syntax {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        //elements are added to the end
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //other way to add
        //other elements are pushed back
        list.add(3,9);
        System.out.println(list);


        // get element

        int element = list.get(2);
        System.out.println(element);

        //Delete O(n)
        list.remove(2);
        System.out.println(list);

        //set   O(n)
        list.set(2,10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11)); 

    }
}
