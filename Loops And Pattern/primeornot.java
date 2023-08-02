import java.util.*;
public class primeornot {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0){
                System.out.println("the number is compositie number");
                return ;
            }

        }
        System.out.println("the number is a prime number");
    }
}
