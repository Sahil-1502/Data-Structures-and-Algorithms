import java.util.*;
public class continue1 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        for(int i =0;true;i++){
            n= sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("the number is "+n);

        }
        
    }

}
