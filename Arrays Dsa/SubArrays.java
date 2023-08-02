public class SubArrays {

    public static void SubArrays(int array[]){
        int k;
        int ts=0;
        for(int i=0;i<array.length;i++){
            //  System.out.println(array[i]);
            for(int j=i;j<array.length;j++){
                for( k=i;k<=j;k++){
                    System.out.print(array[k] + " ");
                    
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total number of sub-arrays " + ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        SubArrays(numbers);
    }
}
