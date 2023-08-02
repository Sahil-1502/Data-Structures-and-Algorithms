public class prefixSum {

    public static int PrefixSum(int array[]){
        int prefix[] = new int[array.length];

        // calculate prefix
        // prefix[0]=array[0];
        for(int i=0;i<array.length;i++){
            prefix[i]= i==0 ? array[i] : prefix[i-1]+array[i];
        }



        int sum =0;
        int largest=Integer.MIN_VALUE;
    for(int i=0;i<array.length;i++){
        for(int j=i;j<array.length;j++){
            
            sum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
        }
        if(sum>largest){
            largest=sum;
        }
    }
    return largest;
}

    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        System.out.println(PrefixSum(numbers));
    }
}
