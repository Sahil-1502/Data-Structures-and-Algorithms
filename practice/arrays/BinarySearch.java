import java.util.*;
public class BinarySearch {

    public static int binarySearch(int array[], int key){
        int start = 0;
        int end = array.length;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(key==array[mid]){
                return mid;
            } else if(key<array[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {2,4,6,8,10,12,14};
        int key = sc.nextInt();
        int index = binarySearch(array, key);
        if(index==-1){
            System.out.println("key is not present in the array");
        } else {
            System.out.println("the index is " + index);
        }
    }
}
