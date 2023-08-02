import java.util.*;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String args[]){
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};  //if can't make Integer make the loop in reverse order

        //sorting
        Arrays.sort(coins, Comparator.reverseOrder());

        int count = 0;
        int value = 1059;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<coins.length;i++){
            while(coins[i]<=value){
                value -= coins[i];
                ans.add(coins[i]);
                count++;
                if(value == 0){
                    break;
                }
            }

        }
        System.out.println(count);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println(ans);
    }    
}
