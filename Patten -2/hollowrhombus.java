import java.util.*;
public class hollowrhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=5;k++){
                if(i==1||i==n||k==1||k==5){
                System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
