import java.util.*;
public class LinearSearch {

    public static void linearSearch(int array[] ,int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                System.out.println(i);
            }
        }
        System.out.println("the key is not present in the array");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {2,4,6,8,10,12,14,16};
        int key = sc.nextInt();
        linearSearch(array, key);
    }
   
}
