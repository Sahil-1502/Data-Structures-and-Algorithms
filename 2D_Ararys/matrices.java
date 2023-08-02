import java.util.*;
public class matrices {
    public static void main(String args[]){
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 7);
    }

    public static void search(int array[][],int key){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]==key){
                    System.out.println(i + "," + j );
                    return;
                }
            }
        }
        System.out.println("the key is not present in this matrix");
    }
}
