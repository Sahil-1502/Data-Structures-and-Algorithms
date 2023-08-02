import java.util.*;

public class Print110o1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print(n);
        
    }

    public static void Print(int i){

        if(i==1){
            System.out.println(1);
            return;
        }

        System.out.println(i);

        Print(i-1);
    }
}
