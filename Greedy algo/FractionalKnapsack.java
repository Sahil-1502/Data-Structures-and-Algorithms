import java.util.*;
public class FractionalKnapsack {

    public static void main(String args[]){
        int weight[] = {10,20,30};
        int value[] = {60,100,120};
        double W = 50;

        double totalValue = 0;

        //sorting 
        double ratios[][] = new double[weight.length][4];
        for(int i=0;i<weight.length;i++){
            ratios[i][0] = i;
            ratios[i][1] = value[i]/(double)weight[i];
            // ratios[i][2] = value[i];
            // ratios[i][3] = weight[i];
        }

        //lamda function  
        Arrays.sort(ratios, Comparator.comparingDouble(o -> o[1]));

        //work
        for(int i=weight.length-1;i>=0;i--){
            int idx = (int)ratios[i][0];              //idhar se index mil gaya
            if(weight[idx]<=W){
                //include fully
                W = W-weight[idx];
                totalValue = totalValue + value[idx];
                if(W==0){
                    break;
                }
            } else {
                totalValue = ratios[i][1]*W + totalValue;
                W=0;
                break;
            }
        }
        System.out.println(totalValue);
    }
}
