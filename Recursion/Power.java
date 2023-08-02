public class Power{
    public static void main(String args[]){
        System.out.println(power(2,5)); 
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        // int Fnm1 = power(x,n-1);
        // int Fn = x*Fnm1;
        // return Fn;

        return x*power(x,n-1); 
    }

    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(x,n/2);
        int halfPowerSq = halfPower*halfPower;
        if(n%2==0){
            return halfPowerSq;
        } else {
            return x*halfPowerSq;
        }
    }
}