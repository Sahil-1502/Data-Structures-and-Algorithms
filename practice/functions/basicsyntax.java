import java.util.*;

public class basicsyntax{

    public static int Fact(int n){
        int Fact = 1;
        for(int i=1;i<=n;i++){
            Fact = Fact*i;
        }
        return Fact;
    }

    public static int BinomialCoefficient(int n,int r){
        int num1 = Fact(n);
        int num2 = Fact(r);
        int num3 = Fact(n-r);

        return num1/(num2*num3); 
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(BinomialCoefficient(n, r));


    }
}