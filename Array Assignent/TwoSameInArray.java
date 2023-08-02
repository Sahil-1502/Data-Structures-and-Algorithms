import java.util.*;
//brute force
public class TwoSameInArray {

    public static boolean areSame(int array[]){
        for(int i=0; i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    return true;
                }
            }
        }
        return false;
        
    }
    

    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(areSame(nums));
        
    }
}
