import java.util.*;
public class Largest {

    public static int Largest(int array[]){
        int largest = Integer.MIN_VALUE;
        // int largest = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest = array[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {1,2,6,3,5,15};
        System.out.println(Largest(array));
    }
    

}
