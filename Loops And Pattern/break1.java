import java.util.*;
public class break1 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        for(int i =0;i<10;i++){
            n= sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);

        }
        
    }

}

