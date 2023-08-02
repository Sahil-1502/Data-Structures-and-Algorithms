import java.util.*;

public class linearsearch {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {1,2,3,4,5};
        System.out.println("enter key");
        int n = sc.nextInt();
        linearsearch(array, n);
    }
    public static void linearsearch(int array[],int key){
        for(int i =0 ; i<array.length;i++){
            if(key==array[i]){
                System.out.println("your key is at index "+ i);
            }
        }
        System.out.println("key not present");
    }
}
