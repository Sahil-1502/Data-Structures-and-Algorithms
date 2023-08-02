import java.util.*;
public class numberpyramid {

    public static void pyramidnumber(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //alternative
            for(int k=1;k<=i;k++){
                System.out.print(i + " ");
            }
            // for(int k=1;k<=(2*i-1);k++){
            //     if(k%2==0){
            //         System.out.print(" ");
            //     } else {
            //         System.out.print(i);
            //     }
            // }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    pyramidnumber(n);
    }
}
