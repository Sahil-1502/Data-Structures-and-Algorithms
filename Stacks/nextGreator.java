import java.util.*;
public class nextGreator {
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        int greator[] = nGreator(arr);

        for(int i =0;i<arr.length;i++){
            System.out.print(greator[i] + " ");
        }

    }

    //void return type leke karna coz int[] is passed by ref
    public static int[] nGreator(int arr[]){

        Stack<Integer> s = new Stack<>();
        int greator[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]>=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                greator[i] = -1;
            } else {
                greator[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return greator;
    }
}


//next Greator right
//next greator left // loop starting se
//next smaller right // while condition ulta
//next smaller left 
