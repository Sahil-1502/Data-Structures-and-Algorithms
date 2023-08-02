import java.util.*;
public class avg {
    public static double avg(int a , int b , int c ){
        double avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(avg(a,b,c));
    }
}
