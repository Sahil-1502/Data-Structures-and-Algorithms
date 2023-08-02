import java.util.*;
public class sumofevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evensum =0;
        int oddsum =0;
        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            if(n%2==0){
                evensum=evensum +n;
            }else {
                oddsum = oddsum +n;
            }

        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
    
}
