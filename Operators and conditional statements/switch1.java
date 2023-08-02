import java.util.*;
public class switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char num = sc.next().charAt(0);
        switch(num){
            case 'a':
            {
                System.out.println("samosa");
                break;
            }
            case 'b':
            {
                System.out.println("burger");
                break;
            }
            case 'c':
            {
                System.out.println("oreo shake");
                break;
            }
            default :
            {
                System.out.println("we wake up");
            }

        }
    }
    
}
