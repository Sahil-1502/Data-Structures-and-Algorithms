import java.util.*;
import java.util.LinkedList;

public class ReverseQueue {
    public static void main(String args[]){
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        reverse(q1);
        // System.out.println(q1);
        // print q1

        while(!q1.isEmpty()){
            System.out.print(q1.remove()+ " ");
        }
    }

    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        
    }
}
