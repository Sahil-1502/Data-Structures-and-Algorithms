import java.util.*;
public class largest {
    public static void main (String args[]){
        int matrix[][] = new int[4][3];
        
        //input
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(largest(matrix));

        
    }

    public static int largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                largest = Math.max(largest,matrix[i][j]);
            }
        }
        return largest;
    }
    
}
