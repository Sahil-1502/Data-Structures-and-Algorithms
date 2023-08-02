public class QuickSort {
    public static void main(String args[]){
        int array[] = {6,3,9,8,2,5,-5};
        quickSort(array, 0, array.length-1);
        printArr(array);
    }

    public static void printArr(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int array[], int si, int ei){
        
        if(si>=ei){
            return;
        }
        
        
        int pIdx = partition(array, si, ei);
        quickSort(array, si, pIdx-1);
        quickSort(array, pIdx+1, ei);

    }

    public static int partition(int array[], int si, int ei){
        int pivot = array[ei];

        int i= si-1;    // to make place for elements smaller than pivot

        for(int j=si;j<=ei;j++){  // this loop will start from j=si because chote me jab divide karenge toh si se start hoga
            if(array[j]<=pivot){
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        // i++;
        // int temp = array[ei];
        // array[ei] = array[i];
        // array[i] = temp;

        return i;

    }
}
