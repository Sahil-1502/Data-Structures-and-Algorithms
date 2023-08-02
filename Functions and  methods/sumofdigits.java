import java.util.*;
public class sumofdigits {
    public static int digitSum(int n){
        int sum = 0;
        for(;n>0;){
            int ld = n%10;
            sum = sum + ld;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digitSum(n));

    }
}
