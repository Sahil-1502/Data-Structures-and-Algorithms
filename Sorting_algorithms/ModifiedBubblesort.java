public class ModifiedBubblesort {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        modifiedBubblesort(arr);
        printarray(arr);
    }

    public static void modifiedBubblesort(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean swaps = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swaps = true;
                }
            }
            // agar i=0 me ek bhi swap nahi hua toh matlab swapping ki zarurat nahi hai 
            // toh agar swaping nahi hua toh break kar do
            if(swaps == false){
                break;
            }
        }
    }

    public static void printarray(int array[]){    
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    
    }
}
