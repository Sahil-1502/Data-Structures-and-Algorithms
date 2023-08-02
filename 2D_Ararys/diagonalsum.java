import java.util.*;
public class diagonalsum {
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};
        System.out.println(diagonalsum(matrix));
    }

    public static int diagonalsum(int array[][]){
        int sum=0;
        for(int i=0;i<array.length;i++){
            //pd
            sum += array[i][i];

            //sd
            if(i!=array.length-i-1){
                sum += array[i][array.length-i-1];
            }
        }
        return sum;
}
}