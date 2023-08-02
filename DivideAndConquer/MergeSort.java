public class MergeSort {
    public static void main(String args[]){
        int array[] = {6,3,9,5,2,8,-2};
        mergeSort(array, 0, array.length-1);
        printArr(array);
    }

    public static void printArr(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int array[], int si, int ei){
        if(si>=ei){
            return;
        }

        //kaam
        int mid = si+(ei-si)/2;

        mergeSort(array, si, mid);
        mergeSort(array, mid+1, ei);

        merge(array, si, mid, ei);
    }

    public static void merge(int array[], int si, int mid, int ei){
        //left(0,3)=4 right(4,6)=3 -> 6-0+1 = 7
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left array
        int j = mid+1; //iterator for right array
        int k = 0; //iterator for temp
        
        while(i <= mid && j<= ei){
            if(array[i]<array[j]){
                temp[k] = array[i];
                i++;
                k++;
            } else {
                temp[k] = array[j];
                j++;
                k++;
            }
        }

        //Elements remaing in left part
        while(i <= mid){
            temp[k++]=array[i++];
            // i++;
            // k++;
        }

        //Elements remaing in right part
        while(j <= ei){
            temp[k++]=array[j++];
            // j++;
            // k++;
        }

        //copy temp into array
        for(k=0, i=si; k<temp.length; k++, i++){
            array[i]=temp[k];
        }

    }
}
