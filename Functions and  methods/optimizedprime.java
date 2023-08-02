import java.util.*;
public class optimizedprime{
    
    public static boolean Isprime(int n){
        
        for(int i=2;i<Math.sqrt(n);i++){
           if( n%i==0){
            return false;
           }
        }  
        return true;
    } 
    public static  void RangePrime(int n){
        System.out.println("the prime numbers are");
        for(int j=2;j<n;j++){
            if (Isprime(j)==true){
                
                System.out.print(+j+",");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RangePrime(n);
    }    
}
