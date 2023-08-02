public class ReverseArr {
    public static void Reversearray(int array[]){
        int n=array.length;
        int i=0;
        int temp;
        while(i<n){
            temp = array[n-1];
            array[n-1]=array[i];
            array[i]=temp;
            n=n-1;
            i=i+1;
        }
        
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12};
        Reversearray(numbers);
        for(int j=0; j<numbers.length; j++){
            System.out.println(numbers[j]);
        }
    }
}
