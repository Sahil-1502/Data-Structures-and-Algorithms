import java.util.*;
public class palindrome {

    public static int reverse(int n){
        int rev = 0;
        for(;n>0;){
            int ld = n%10;
            rev = rev*10 + ld;
            n=n/10;
        }
        return rev;
    }

    public static boolean palindrome(int n ){
        int rev = reverse(n);
        if(n==rev){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palindrome(n));
    }
}
