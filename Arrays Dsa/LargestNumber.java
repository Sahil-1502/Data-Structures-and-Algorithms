public class LargestNumber {

    public static int Largest(int array[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(largest<array[i]){
                largest=array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(smallest>array[i]){
                smallest=array[i];
            }
        }
        System.out.println("The smallest int is" + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {10,20,25,48,60,46,28,34};
        System.out.println(Largest(numbers));
    }
}
