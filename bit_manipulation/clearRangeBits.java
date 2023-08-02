public class clearRangeBits{
    public static void main(String args[]){
        System.out.println(ClearRange(10, 2, 4));
    }

    public static int ClearRange(int n, int  i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return bitMask&n;
    }
}