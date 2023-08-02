import java.util.*;

public class maxsubarray {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[]={1,-2,6,-1,3};
        System.out.println(maxsubarraysum(array));

    }

    public static int maxsubarraysum(int array[]){
        int largest = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                for(int k=i;k<=j;k++){
                    sum = sum + array[k];
                }
                if(sum>largest){
                    largest = sum;
                }
                sum =0;
            }
        }
        return largest;
    }
}
