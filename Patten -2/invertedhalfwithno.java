import java.util.*;
public class invertedhalfwithno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int k =1;
            for(int j=n;j>=i;j--){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
