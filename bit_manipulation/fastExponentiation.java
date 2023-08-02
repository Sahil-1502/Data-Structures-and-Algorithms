public class fastExponentiation {
    public static void main(String args[]){
        System.out.println(fastExponentiation(5, 3)); 
    }

    public static int fastExponentiation(int a,int n){
        int ans=1;
        while(n>0){
            if((n & 1) == 1){
                ans = ans *a;
            } 
            // else {
            //     ans = ans *1;
            // }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
}
