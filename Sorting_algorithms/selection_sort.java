public class selection_sort {
    public static void main(String args[]){
        int array[] = {5,4,1,3,2};
        SelectionSort(array);
        printarray(array);
    }

    public static void SelectionSort(int array[]){
        int n = array.length;
        int temp;
        for(int i =0;i<n-1;i++){
            int smallest = i;

            for(int j = i+1;j<n;j++){    
                if(array[j]<array[smallest]){
                smallest=j;
            }
            }
            temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp; 
        }
    }

    public static void printarray(int array[]){    
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    
    }
}
