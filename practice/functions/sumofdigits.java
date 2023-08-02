import java.util.*;
public class sumofdigits {

    public static void SumOfNum(int n){
        int sum = 0;
        for(int i=0;n>0;i++){
            int last_digit = n%10;
            sum = sum + last_digit;
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumOfNum(n);
    }
}
