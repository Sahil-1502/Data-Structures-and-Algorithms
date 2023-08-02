public class ArrayBt {
    public static void main(String args[]){
        int arr[] = new int[5];
        araryBt(arr, 0, 1);
        printArray(arr);
        
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void araryBt(int arr[], int i, int val){
        
        // base case
        if(i == arr.length){
            printArray(arr);
            return;
        }

        //recursion
        arr[i] = val;
        araryBt(arr, i+1, val+1);
        arr[i] -= 2;               //BackTrackking wala step
    }
}