import java.util.*;
import java.util.LinkedList;

 public class StackUsingQueue2{

    public static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            if(q1.isEmpty() && q2.isEmpty()){
                return true;
            } 
            return false;
        }

        public static void push(int data){
            if(q1.isEmpty()){
                q1.add(data);
                while(!q2.isEmpty()){
                    q1.add(q2.remove());
                }
            } else {
                if(q2.isEmpty()){
                    q2.add(data);
                    while(!q1.isEmpty()){
                        q2.add(q1.remove());
                    }
                }
            }
        }

        public static int pop(){
            if(!q1.isEmpty()){
                return q1.remove();
            } else {
                return q2.remove();
            }
        }

        public static int peek(){
            if(!q1.isEmpty()){
                return q1.peek();
            } else {
                return q2.peek();
            }
        }

    }

    public static void main(String args[]){
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }


}