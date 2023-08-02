public class kadanes {
    public static void main(String args[]){
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(kadanes(array));
    }

    public static int kadanes(int array[]){
        int cs=0;
        int ms =0;
        for(int i=0;i<array.length;i++){
            cs = cs +array[i];
            if(cs<0){
                cs = 0;
            }
            if(cs>ms){
                ms=cs;
            }
        }
        return ms;
    }
}
