public class Stocks {

    public static int profit(int array[]){
        int bp=Integer.MAX_VALUE;
        int maxprofit =0;

        for(int i=0;i<array.length;i++){
            if(bp<array[i]){
                int profit=array[i]-bp;  //profit if sold today
                maxprofit = Math.max(maxprofit,profit);
            }
            else {
                bp=array[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(profit(prices));
    }
}
