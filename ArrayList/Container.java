import java.util.*;

public class Container {
    public static void main(String args[]){
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        System.out.println(maxWater(heights));
    }

    // public static int maxWater(ArrayList<Integer> heights ){
    //     int height,width;
    //     int maxArea = 0;

    //     for(int i=0;i<heights.size();i++){
    //         for(int j =0;j<heights.size();j++){
    //             height = Math.min(heights.get(i), heights.get(j));
    //             width = j-i;
    //             int area = height*width;
    //             maxArea = Math.max(area,maxArea);
    //         }
    //     }
    //     return maxArea;
    // }

    //2 pointer approach O(ns)
    public static int maxWater(ArrayList<Integer> heights){
        int Lp = 0;
        int Rp = heights.size()-1;
        int maxArea = 0;

        while(Lp<Rp){

            int height = Math.min(heights.get(Lp), heights.get(Rp));
                int width = Rp - Lp;
                int area = height*width;
                maxArea = Math.max(area,maxArea);

            if(heights.get(Lp)<heights.get(Rp)){
                Lp++;
                
            } else {
                Rp--;
            }
        }

        return maxArea;
    }

    
}