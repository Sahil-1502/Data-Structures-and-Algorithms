import java.util.*;

public class ReverseAnArray {

    public static void reverse(int array[]){
        int temp;
        for(int i=0,j=array.length-1;i<j;i++,j--){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int array[]= {2,4,6,8,10};
        reverse(array);
    }
}
