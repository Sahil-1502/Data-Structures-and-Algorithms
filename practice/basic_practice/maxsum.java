public class maxsum{

    public static void SubArrays(int array[]){
        int k;
        int sum=0;
        int largest =Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                for( k=i;k<=j;k++){
                    sum = sum +array[k];
                }
                if(largest<sum){
                    largest=sum;
                }
                sum =0;
            }
            
        }
        System.out.println(largest);
        
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        SubArrays(numbers);
    }
}

