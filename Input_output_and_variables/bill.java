import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float sum = a+b+c;
        float total = sum*(18/100f+1);
        System.out.println(total);
        // float a = 18/100f +1f;
        // System.out.println(a);

    }
    
}
