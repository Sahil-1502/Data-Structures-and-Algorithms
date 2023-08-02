import java.util.*;

public class binarysearch {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int array[] = {1,2,3,4,5};
        System.out.println(array.length);
        // if(Binarysearch(array,key)==-1) {
        //     System.out.println("key not present");
        // }    else {
        //     System.out.println(Binarysearch(array, key));
        // }
}
    public static int Binarysearch(int array[],int key){
        int start = array[0];
        int end = array[array.length-1];
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(array[mid]==key){
                //System.out.println(mid);
                return mid;
            } else if(array[mid]<key) {
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        //System.out.println("key is not present");
        return -1;

    }
}
