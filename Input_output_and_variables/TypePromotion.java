import java.util.*;
public class TypePromotion 
{
    public static void main(String[] args) {
        // char a = 'a';
        // char b = 'b';
        // char c = b-a;
        // System.out.print(b-a);
        short a = 5;
        byte b =25;
        char c = 'c';
        byte bt = (byte)(a+b+c);
        System.out.println(a+b+c);
        System.out.print(bt);
    }
    
}
