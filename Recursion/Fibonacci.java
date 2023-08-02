public class Fibonacci {
    public static void main(String args[]){
        int n = 5;
        for(int i = 0;i<=n;i++){
            System.out.print(fibonacci(i)+" ");
        }
        fibonacci(5);
       
    }
    public static int fibonacci(int n){
        if(n == 0 || n==1){
            return n;
        }
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);

        int fn = fnm1 + fnm2;
        return fn;
    }
}
