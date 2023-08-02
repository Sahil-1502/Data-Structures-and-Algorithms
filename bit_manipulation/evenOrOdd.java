import java.util.*;
public class evenOrOdd {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenOrOdd(n);
    }

    public static void evenOrOdd(int n){
        int bitmask = 1;
        if((n&bitmask) ==0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }
    }
}
