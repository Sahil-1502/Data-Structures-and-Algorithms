public class ClearIBits {
    public static void main (String args[]){
        System.out.println(ClearBits(15, 2)); 
    }
    public static int ClearBits(int n , int i ){
        int bitmask = (-1)<<i;
        return n & bitmask;
    }

}
