import java.util.ArrayList;
public class Classroom {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){  //O(logn)
            //add at last idx
            arr.add(data);

            int x = arr.size()-1;   //x is child index
            int par = (x-1)/2;      //par index

            while(arr.get(x)<arr.get(par)){     //O(logn)     //for max heap '>'
                //swap
                int temp = arr.get(par);
                arr.set(par, arr.get(x));
                arr.set(x,temp);

                x=par;
                par =(x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

                //i is not a leaf node
            if(left < arr.size() && arr.get(minIdx)>arr.get(left)){          //for max '<'
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){ //for max '<'
                minIdx = right;
            }

            if(minIdx != i){
                //swap
                int temp = arr.get(minIdx);
                arr.set(minIdx,arr.get(i));
                arr.set(i, temp);

                heapify(minIdx);
            }

            
        }

        public int remove(){
            
            int data = arr.get(0);

            //swap first and last
            int temp = arr.get(arr.size()-1);
            arr.set(arr.size()-1,arr.get(0));
            arr.set(0,temp);
            
            //delete last
            arr.remove(arr.size()-1);       //O(1) because to remove the last element shifting of elements is nit required

            //heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String args[]){
        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while(!pq.isEmpty()){   //heap sort O(nlogn)
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
    }
}
