import java.util.*;
public class BiToDec {

    public static int BitoDec(int n){
        int dec = 0;
        for(int i=0;n>0;i++){
            int last_digit = n%10;
            dec = dec +last_digit*(int)Math.pow(2, i);
            n = n/10;
        }
        return dec;
    } 

    public static int DecToBi(int Dec_no){
        int Binary_no = 0;
        for(int i=0;Dec_no>0;i++){
            int last_Digit = Dec_no % 2;
            Binary_no = Binary_no+ last_Digit*(int)Math.pow(10,i); ;
            Dec_no = Dec_no/2;
        }
        return Binary_no;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int Bi = sc.nextInt();
        // System.out.println(BitoDec(Bi));
        int Dec_no = sc.nextInt();
        System.out.println(DecToBi(Dec_no));

    }
}
