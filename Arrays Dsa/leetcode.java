import java.util.*;

public class leetcode {

    public static int PrefixSum(int array[]){
        int prefix[] = new int[array.length];

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
        
        Scanner sc = new Scanner(System.in);
        int numbers[]=new int[7];
        for (int i = 0; i < numbers.length; i++) {
            if (sc.hasNextInt()) {
                numbers[i] = sc.nextInt();
            }
        }
    
        System.out.println(PrefixSum(numbers));
}
}
