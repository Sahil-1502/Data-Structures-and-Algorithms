public class Stocks {
    public static int Profit(int array[]){
        int profit=0;
        int bp = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=0;i<array.length;i++){
            if(array[i]>bp){
                profit = array[i]-bp;
                maxProfit = Math.max(profit,maxProfit);
            } else {
                bp = array[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int Prices[] = {7,1,5,3,6,4};
        System.out.println(Profit(Prices));
    }
}
