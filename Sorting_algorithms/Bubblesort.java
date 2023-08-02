public class Bubblesort {
    public static void main(String args[]){
        int array[] = {4,5,1,3,2};
        bubblesort(array);
        printarray(array);
    }

    public static void bubblesort(int array[]){
        int n = array.length;
        int temp;
        for(int i=0;i<n-1;i++){
            // int swaps = 0;
            for(int j=0;j<n-1-i;j++){
                if(array[j]>array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    // swaps++;
                }
            }
            // System.out.println(swaps);
        }
    }

    public static void printarray(int array[]){    
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    
}
