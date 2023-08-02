
public class rainwater {
    public static int rainwater(int array[]){
        int n= array.length;
        int trappedWater =0;
        int waterLevel = 0;

        // left max boundry
        int leftmax[] = new int[n];
        leftmax[0]=array[0];
        for(int i =1; i<n;i++){
            leftmax[i]=Math.max(array[i],leftmax[i-1]);
        }

        // Right max boundry
        int rightmax[] = new int[n];
        rightmax[n-1]=array[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],array[i]);
        }

        for(int i=0; i<n;i++){
            waterLevel = Math.min(leftmax[i],rightmax[i]);
            trappedWater += waterLevel-array[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int num[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rainwater(num));
    }
    
}
