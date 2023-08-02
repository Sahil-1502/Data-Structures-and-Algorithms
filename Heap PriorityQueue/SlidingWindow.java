import java.util.*;
public class SlidingWindow {

    static class Info implements Comparable<Info>{
        int idx;
        int val;
        public Info(int idx,int val){
            this.idx =idx;
            this.val =val;
        }

        @Override
        public int compareTo(Info I2){
            return I2.val-this.val;             //decending
        }
    }
    public static void main(String args[]){
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k =3;
        int res[] = new int[arr.length-k+1];

        PriorityQueue<Info> pq = new PriorityQueue<>();

        for(int i=0;i<k;i++){
            pq.add(new Info(i, arr[i]));
        }

        res[0]=pq.peek().val;

        for(int i=k;i<arr.length;i++){

            while(pq.size()>0 && pq.peek().idx <= i-k){
                pq.remove();
            }
            pq.add(new Info(i,arr[i]));
            res[i-k+1] = pq.peek().val;
        }

        //print result
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}
