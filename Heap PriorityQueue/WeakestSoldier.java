// import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeakestSoldier{

    public static class Row implements Comparable<Row>{
        int row;
        int soldiers;

        public Row(int row, int soldiers){
            this.row = row;
            this.soldiers = soldiers;
        }

        @Override
        public int compareTo(Row R2){
            if(this.soldiers == R2.soldiers){
                return this.row-R2.row;     //if mumber of soldiers same toh cpmpare index
            } else {
                return this.soldiers-R2.soldiers;       //ascending order
            }
        }
    }
    public static void main(String args[]){
         int arr[][] ={{1, 0, 0, 0},
                     {1, 1, 1, 1},
                     {1, 0, 0, 0},
                     {1, 0, 0, 0}};

        int k =2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            int soldiers=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    soldiers++;
                }
            }
            pq.add(new Row(i, soldiers));
        }

        for(int i =0;i<k;i++){
            System.out.println("R" + pq.remove().row);
        }
    }
}