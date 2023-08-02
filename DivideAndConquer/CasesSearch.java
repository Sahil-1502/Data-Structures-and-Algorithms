public class CasesSearch {
    public static void main(String arrgs[]){
        int array[] = {4,5,6,7,0,1,2};
        int target =6;
        System.out.println(casesSearch(array, target, 0, array.length-1)); 
    }

    public static int casesSearch(int array[],int tar, int si, int ei ){

    // target doesn't exist in array
    if(si > ei){
        return -1;
    }

    //find mid 
    int mid = si+(ei-si)/2;

    //Best case
    if(array[mid] == tar){
        return mid;
    }

    //case 1 mid lies in L1
    if(array[si]<=array[mid]){
        //case a
        if(array[si] <= tar && tar <= array[mid]){
            return casesSearch(array, tar, si, mid-1);  // because we already checked the mid value
        } else {
            //case b
            return casesSearch(array, tar, mid+1, ei); 
        }
    }
    //case 2 mid lies on L2
    // if(array[ei]>=array[mid]){

    else {
        //case c
        if(array[mid] <= tar && tar<= array[ei]){
            return casesSearch(array, tar, mid+1, ei);
        } else {
            //case d
            return casesSearch(array, tar, si, mid-1);
        }
    }
}
}
