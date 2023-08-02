import java.util.*;
public class floydtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(2*i-1);j++){
                if(j%2==0){
                    System.out.print(" ");
                }
                else {
                    System.out.print(k);
                    k++;
                }
            }
            System.out.println();
        }
        
    }    
}
