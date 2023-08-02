public class trapping_rainwater {
    public static void main(String args[]){
        int array[] = {4,2,0,6,3,2,5};
        trapping_rainwater(array);
        System.out.println(trapping_rainwater(array));
    }
    public static int trapping_rainwater(int array[]){
        int leftmax[] = new int[array.length];
        leftmax[0]=array[0];
        for(int i=1;i<array.length;i++){
            leftmax[i]=Math.max(array[i],leftmax[i-1]);
        }

        int rightmax[] = new int[array.length];
        rightmax[array.length-1]=array[array.length-1];
        for(int i=array.length-2;i>=0;i--){
            rightmax[i]=Math.max(array[i],rightmax[i+1]);
        }

        int trappedWater=0;
        int waterLevel =0;
        for(int i=0;i<array.length;i++){
            waterLevel = Math.min(leftmax[i],rightmax[i]);
            trappedWater += waterLevel - array[i]; 
        }
        return trappedWater;
    }
}