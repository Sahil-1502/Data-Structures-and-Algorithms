import java.util.*;
public class Chocola {
    public static void main(String args[]){
        int n =4, m = 6;
        Integer vertical[] = {2, 1, 3, 1, 4};
        Integer horizontal[] = {4, 1, 2};

        //sorting
        Arrays.sort(vertical,Comparator.reverseOrder());
        Arrays.sort(horizontal,Comparator.reverseOrder());

        int h=0,v=0;                //pointers
        int vp =1;                  //verical pieces
        int hp =1;                  // horizontal pieces
        int cost =0;

        while(v<vertical.length && h<horizontal.length){
            if(vertical[v]>horizontal[h]){
                //vertical cut
                cost += hp * vertical[v];
                vp++;
                v++;
            } else {
                //horizontal cut
                cost += vp * horizontal[h];
                hp++;
                h++;
            }
        }
        while(h<horizontal.length){
            cost += vp*horizontal[h];
            hp++;
            h++;
        }
        while(v<vertical.length){
            cost += hp*vertical[v];
            vp++;
            v++;
        }
        System.out.println(cost);
    }
}