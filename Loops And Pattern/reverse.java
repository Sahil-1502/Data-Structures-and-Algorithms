import java.security.DigestInputStream;
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse =0;
        int lastdigit;
        for(int i =0;num>0;i++){
            lastdigit =num % 10;
            num= num/10;
            reverse=(reverse*10)+lastdigit;
        }
        System.out.println(reverse);
    }
    
}
