import java.util.*;
public class Size {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        //elements are added to the end
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.size());

        // print AL
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}