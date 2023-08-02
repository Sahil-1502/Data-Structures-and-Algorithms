import java.util.*;
import java.util.LinkedList;

public class Interleave{
    public static void main(String args[]){
        Queue<Integer> q3 = new LinkedList<>(); 
        q3.add(1);
        q3.add(2);
        q3.add(3);
        q3.add(4);
        q3.add(5);
        q3.add(6);
        q3.add(7);
        q3.add(8);
        q3.add(9);
        q3.add(10);

        
        interleave(q3);

    }
    public static void interleave(Queue<Integer> q1){

        Queue<Integer> q2 = new LinkedList<>(); 
        int n = q1.size();

        for(int i=0; i<n/2; i++){               //calculate size before entering this loop because the size of queue in the loop is changing
            q2.add(q1.remove());
        }
        while(!q2.isEmpty()){
            q1.add(q2.remove());
            q1.add(q1.remove());
        }
        System.out.println(q1);
    }
}