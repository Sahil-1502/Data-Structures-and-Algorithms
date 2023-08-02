public class buyandsell {
    public static void main(String args[]){
        int array[] = {7,1,5,3,6,4};
        System.out.println(maxprofit(array));
    } 

    public static int maxprofit(int array[]){
        int bp = Integer.MAX_VALUE;
        int current_profit;
        int max_profit = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]>bp){
            current_profit=array[i]-bp;
            max_profit=Math.max(max_profit,current_profit);
            } else {
                bp = array[i];
            }
            
        
        }    
    
            return max_profit;
}
}
