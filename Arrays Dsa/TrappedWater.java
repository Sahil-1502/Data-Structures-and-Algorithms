public class TrappedWater {

    public static int TrappingWater(int array[]){
        int n=array.length;
        int LeftArray[]=new int[n];
        int RightArray[]=new int[n];


        // leftmax boundry
        LeftArray[0]=array[0];
        for(int i=1;i<n;i++){
            LeftArray[i]=Math.max(LeftArray[i-1],array[i]);
        }

        // rightmax boundry 
        RightArray[n-1]=array[n-1];
        for(int i=n-2;i>=0;i--){
            RightArray[i]=Math.max(RightArray[i+1],array[i]);
        }

        //water level
        
        int trappedWater = 0;
        for(int i=0;i<n;i++){
            //waterlevel =min(leftmax boundry , rightmax boundry)
            int waterlevel=Math.min(LeftArray[i],RightArray[i]);

            //trapped water = waterlevel - height[i]
            trappedWater += waterlevel - array[i];

        }

        //trapped water
        // int trappedWater[] = new int[n];
        // for(int i=0;i<n;i++){
        //     trappedWater[i] = waterlevel[i] - array[i];
        // }

        //Total Water
        // for(int i=0;i<n;i++){
        //     TotalWater = TotalWater + trappedWater[i];
        // }


        return trappedWater;
    }
    public static void main(String[] args) {
        int numbers[]={4,2,0,6,3,2,5};
        System.out.println(TrappingWater(numbers));
    }
}
