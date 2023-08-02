import java.util.*;
public class factorial {
    public static int Fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binCoeff(int n , int r){
        int c = Fact(n);
        int d = Fact(r);
        int e = Fact(n-r);
        int coeff = c/(d*e);
        return coeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        
        System.out.println(binCoeff(n, r));
       
    }
    
}
