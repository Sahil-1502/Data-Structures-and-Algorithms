import java.util.*;

public class primeornot {

    public static void range(int x,int y){
        for(int i=x;i<=y;i++){
            if(isprime(i)){
                System.out.print(i+ " ");
            }
        }
    }

    public static boolean isprime(int n){

        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        range(x, y);

    }
}






