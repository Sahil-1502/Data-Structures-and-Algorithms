import java.util.*;
public class decimaltobinary {
   
    public static int BiToDec(int n) {
        int dec=0;
        int Ld = 0;
        for(double pow=0;n>0;pow++){
            Ld = n%10;
            n =n/10;
            dec = dec + (Ld*(int)Math.pow(2, pow));
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(BiToDec(n));

    }
}
