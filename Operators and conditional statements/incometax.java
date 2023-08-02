import java.util.*;
public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        float tax = 0f;
        if(income>=1000000){
            tax = income*0.30f;
            System.out.println(tax);
        } else if(income>=500000 && income<1000000){
            tax = income*0.20f;
            System.out.println(tax);
        } else{
            System.out.println("no tax");
        }
    }
}
