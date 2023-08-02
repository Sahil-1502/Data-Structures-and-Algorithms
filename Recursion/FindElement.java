public class FindElement {
    public static void main(String args[]){
        int array[] = {5,3,6,9,4,10,2,4,3};
        System.out.println(lastOccurance(array, 5, 0));
        System.out.println(firstOccrance(array, 5, 0));


    }
    
    public static int firstOccrance(int array[], int key, int i){
        if(i==array.length){
            return -1;
        }
        if(array[i]==key){
            return i;
        }
        return firstOccrance(array, key,i+1);

        
    }

    // public static int lastOccurance(int array[], int key, int n){
    //     if( n== -1){
    //         return -1;
    //     }
    //     if(array[n]==key){
    //         return n;
    //     }
    //     return lastOccurance(array, key, n-1);

    // }

    public static int lastOccurance(int array[], int key, int i){
        if( i== array.length){
            return -1;
        }

        //aage ke values ke liye call kiya
        int isFound = lastOccurance(array, key, i+1);

        //if aage nahi hai and current me hai toh return i
        if(isFound == -1 && array[i]==key){
            return i;
        }

        // agar mera aage exist karta hai toh upar wala 
        //condition toh check hi nahi hoga 
        //i.e. checking the current position
        //toh we should return aage wali value 
        //thats why we return isFound
        return isFound;

    }
}   