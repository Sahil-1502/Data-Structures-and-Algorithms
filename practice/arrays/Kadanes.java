public class Kadanes {


    public static void kadanes(int array[]){
        int CS=0,MS=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){

            CS = CS + array[i];
            if(CS<0){
                CS =0;
            }

            if(CS>MS){
                MS=CS;
            }
        } 
        System.out.println(MS);

    }


    public static void main(String args[]){
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(array);
    }
}
