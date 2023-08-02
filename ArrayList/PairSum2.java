import java.util.*;
public class PairSum2 {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        //11,15,6,7,8,10
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(10);

        int target =16;
        System.out.println(pairs2(list,target));
    }
    public static boolean pairs2(ArrayList<Integer> list, int target){
        int Bp =-1;

        for(int i=0; i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                Bp = i;
                break;
            }
        }

        int Lp = Bp + 1;
        int Rp = Bp;

        while(Lp!=Rp){
            if(list.get(Lp)+list.get(Rp)==target){
                return true;
            }
            else if(list.get(Lp)+list.get(Rp)<target){
                Lp = (Lp + 1) % list.size();
            } else {
                Rp = (list.size() + Rp -1) % list.size();
            }
        }

        return false;

        
    }
}
