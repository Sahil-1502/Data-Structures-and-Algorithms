import java.util.*;
public class decToBin {
    public static int DecToBi(int n){
        int bi=0;
        for(int pow=0;n>0;pow++){
            bi= bi + n%2*(int)Math.pow(10, pow);
            n=n/2;
        }
        return bi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(DecToBi(n));
    }
}