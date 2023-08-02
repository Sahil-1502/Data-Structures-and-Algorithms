import java.util.*;
public class posinegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String type = (num>=0)? "positive number" : "negative number" ;
        System.out.println(type);
    }
    
}
