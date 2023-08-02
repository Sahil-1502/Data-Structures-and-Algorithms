public class binarySearch {

    public static int BinarySearch(int array[],int key){
        int start = 0;
        int end = array.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(array[mid]==key){
                return mid;
            }
            else if((array[mid]>key)){
                end = mid-1;
            }
            else{
                start =mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 14;
        int index = BinarySearch(numbers,key);
        if(index==-1){
            System.out.println("key doesn't exist in the array");
        }
        else{
            System.out.println("the key is at index " + index);
        }
    }
}
