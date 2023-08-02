public class staircase_search {
    public static void main(String args[]){

        int array[][]= {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key =51;
        StaricaseSearch(array, key);
    }

    public static void StaricaseSearch(int array[][],int key){
        int i=0;
        int j=array[0].length-1;
        while(i<array.length&&j>=0){
            if(key==array[i][j]){
                System.out.println(i+","+j);
                return;
            }  
            
            else if(key>array[i][j]){
                i++;
            }

            else{
                j--;
            }
            
        }
        System.out.println("key not found");
    }
}
