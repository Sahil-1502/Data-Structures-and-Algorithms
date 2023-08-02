public class Tiling {
    public static void main(String args[]){
        System.out.println(tiling(5));
    }

    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        //not required
        // if(n==2){
        //     return 2;
        // }
        return tiling(n-1)+tiling(n-2);
    }
}
