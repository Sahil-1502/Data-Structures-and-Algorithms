public class MaxSubarraySum{

    public static int MaxSubarray(int array[]){
        int sum;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                sum=0;
                for(int k =i;k<=j;k++){
                    sum = sum +array[k];
                }
                System.out.println(sum);
                if(sum>largest){
                    largest=sum;
                }
               
            }
            
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        System.out.println("Max subarray is "+MaxSubarray(numbers));
    }
}