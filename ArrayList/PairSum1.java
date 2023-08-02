import java.util.*;

public class PairSum1 {
    public static void main(String args[]){

    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);

    int target =60;

    System.out.println(pairsum2(list, target)); 
    
    
    }

    public static boolean pairsum1(ArrayList<Integer> list , int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1 ; j<list.size() ; j++){
                int sum = list.get(i)+list.get(j);
                if(sum == target){
                System.out.println(i + "," + j);
                return true;
                }
            }
        }
        return false;
    }

    //2 pointer approach
    public static boolean pairsum2(ArrayList<Integer> list , int target){

        int Lp = 0;
        int Rp = list.size()-1;
        while(Lp<Rp){
            if(list.get(Lp)+list.get(Rp)==target){
                System.out.println(Lp + "," + Rp);
                return true;
            } else if(list.get(Lp)+list.get(Rp)<target){
                Lp++;
            } else {
                Rp--;
            }
        }
        return false;
    }
}
